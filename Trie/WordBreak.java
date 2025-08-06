
public class WordBreak {

    static class Node {

        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    static Node root = new Node();

    public static void insert(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            int ind = word.charAt(i) - 'a';
            if (temp.children[ind] == null) {
                Node node = new Node();
                temp.children[ind] = node;
            }
            if (i == word.length() - 1) {
                temp.children[ind].eow = true;
            }
            temp = temp.children[ind];
        }
    }

    public static boolean wordBreak(String key) {
        int len = key.length();

        if (len == 0) {
            return true;
        }

        for (int i = 1; i <= len; i++) {
            if (search(key.substring(0, i))
                    && wordBreak(key.substring(i))) {
                return true;
            }
        }

        return false;
    }

    public static boolean search(String s) {
        Node temp = root;
        for (int i = 0; i < s.length(); i++) {
            int ind = s.charAt(i) - 'a';
            if (temp.children[ind] == null || (i == s.length() - 1 && !temp.children[ind].eow)) {
                return false;
            }
            temp = temp.children[ind];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"i", "like", "sam", "samsung", "mobile", "ice"};

        for (String word : words) {
            insert(word);
        }
        System.out.println(wordBreak("ilikesamsung"));
    }
}
