public class L167{
    public static void main(String[] args){
        int[] arr={-10, -8, -3, -1};
        int t=-11;

        int l=0;
        int r=arr.length-1;

        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==t){
                l++;
                r++;
                System.out.println(l+","+r);
                break;
            }
            else if(sum>t)
                r--;
            else
                l++;
        }
        if(r==l)
        System.out.println("Not found");
    }
}