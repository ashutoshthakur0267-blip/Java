// Class implementing Runnable interface to define a thread task
class MyThreadRunnable1 implements Runnable {
    public void run() {
        // Code inside run() will be executed by the thread
        System.out.println("I am a thread | not a threat 1");
    }
}

// Another class implementing Runnable interface for a second thread task
class MyThreadRunnable2 implements Runnable {
    public void run() {
        System.out.println("I am a thread 2 not threat 2");
    }
}

// Main class to execute the program
public class Runnable1 {
    public static void main(String[] args) {
        
        // Create objects of classes implementing Runnable (these are NOT threads yet)
        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        
        // Wrap Runnable objects inside Thread objects
        // Now gun1 and gun2 are actual threads that can run independently
        Thread gun1 = new Thread(bullet1);
        Thread gun2 = new Thread(bullet2);
        
        // Start both threads — they will run concurrently
        gun1.start();
        gun2.start(); 
    }
}
