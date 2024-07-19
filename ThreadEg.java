class Home implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Database Updated");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
class HomeTwo implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
public class ThreadEg {
    public static void main(String[] args) throws InterruptedException {
        Runnable h = new Home();
        Runnable h2 = new HomeTwo();
        
        Thread t = new Thread(h);
        Thread t2 = new Thread(h2);

        t.start();
        t2.start();

        t.join();
        t2.join();

        System.out.println("Byee...");
    }
}
