public class Main {
    public static void main(String[] args) {
        long startTime=System.currentTimeMillis();
        Counter thread1=new Counter();
        Sum sum=new Sum();
        Thread thread2=new Thread(sum);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();  
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println("I am the main thread");
        System.out.println((System.currentTimeMillis() - startTime)+"ms");
    }
}
