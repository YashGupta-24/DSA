public class Sum implements Runnable {
    @Override
    public void run(){
        int sum=0;

        for(int i=0;i<10000;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
