//package Multithreading;

class MynewThr1 extends Thread {
    
  

    public void run() {
      int i=0;

        while (true) {
            System.out.println("Thank you");
            try {
                Thread.sleep(4555);
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            i++;
        }

    }
}
class MynewThr2 extends Thread {
    

    public void run() {
      

        while (true) {
            System.out.println(" My Thank you");
        }

    }
}

public class cwh_75_thread_methods {
    public static void main(String[] args) {
        MynewThr1 t1=new MynewThr1();
        MynewThr2 t2=new MynewThr2();
        t1.start();
       // t1.join();
        // try{
        //     t1.join();

        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();
    }
}
