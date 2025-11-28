//package Multithreading;

class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        int i = 34;
       
        while(true){
             System.out.println("Thank you"+ this.getName());
        }

    }
}

class cwh_74_thread_constructor {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Harry");
        MyThr1 t2 = new MyThr1("Ram Candr");
        MyThr1 t3 = new MyThr1("Ram1 Candr");
        MyThr1 t4 = new MyThr1("Ram 2Candr");
        MyThr1 t5 = new MyThr1("Ram C3andr (most important)");
        MyThr1 t6 = new MyThr1("Ram Ca4ndr");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();


    }

}