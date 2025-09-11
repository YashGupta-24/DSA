import java.util.*;
public class SortVowels{
    public static void sortVowels(String s){
        TreeMap<Character, Integer> map=new TreeMap<>();
        map.put('A',0);
        map.put('E',0);
        map.put('I',0);
        map.put('O',0);
        map.put('U',0);
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);

        char[] character=new char[s.length()];
        Arrays.fill(character, ' ');

        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                character[i]=s.charAt(i);
            }
            else{
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int index=0;
        for(Character key: map.keySet()){
            if(map.get(key)!=0){
                for(int i=0;i<map.get(key);i++){
                    while(index<character.length-1 && character[index]!=' ')
                    index++;

                    character[index]=key; 
                }
            }
        }
        String result="";
        for(int i=0;i<character.length;i++)
        result+=character[i];

        System.out.println(result);
    }
    public static void main(String[] args) {
        String s="lYmpH";
        sortVowels(s);
    }
}