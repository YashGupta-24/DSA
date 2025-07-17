public class PrintName{
    public static void print(String name, int count){
        if(count==0)
        return;
        System.out.println(name);
        print(name, count-1);
    }

    public static void main(String[] args) {
        print("Yash", 5);
    }
}