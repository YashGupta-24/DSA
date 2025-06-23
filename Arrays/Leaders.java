import java.util.ArrayList;

public class Leaders {
    public static ArrayList<Integer> leaders(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        list.add(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>=list.get(list.size()-1)){
                list.add(arr[i]);
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            result.add(list.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> leaders = leaders(arr);
        System.out.println(leaders); // Output: [17, 5, 2]
    }
}
