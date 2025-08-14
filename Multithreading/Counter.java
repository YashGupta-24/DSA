public class Counter extends Thread{
    @Override
    public void run(){
        int count=0;
        for(int i=0;i<10000;i++){
            if(i%7==0) count++;
        }
        System.out.println(count);
    }
}