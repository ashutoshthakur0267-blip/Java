//package Multithreading;

class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
        System.out.println("Thank you");
        // while(true){
        // System.out.println("I am a thread");
        // }
    }
}

class cwh_73_thread_constructor {
    public static void main(String[] args) {
        MyThr t = new MyThr("Harry");
        MyThr t2 = new MyThr("Ram Candr");
        t1.start(); 
        t2.start();
        System.out.println("The id of the thread t is " + t1.getId());
        System.out.println("The id of the thread t is " + t1.getName());
        System.out.println("The id of the thread t is " + t2.getName());
    }

}