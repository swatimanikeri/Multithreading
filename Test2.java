class MyThread extends Thread {
    public void run() {
        try {
          
            System.out.println(Thread.currentThread().getName() + " is starting.");
            Thread.sleep(1000); // Simulating work by making the thread sleep
            System.out.println(Thread.currentThread().getName() + " has finished.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        // Create two thread objects
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        // Start the threads
        t1.start();
        t2.start();
        
        try {
            
            t1.join(); 
            t2.join(); 
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
       
        System.out.println("Both threads have finished. Main thread is exiting.");
    }
}
