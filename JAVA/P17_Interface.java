
// WAJP to create one thread by implementing Runnable interface in  
//Class

package Module6;

//Class implementing Runnable interface
class MyRunnable implements Runnable {
 public void run() {
     // Code that will be executed by the thread
     for (int i = 1; i <= 5; i++) {
         System.out.println("Thread is running: " + i);
         try {
             Thread.sleep(500); // Pause for 500 milliseconds
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted.");
         }
     }
 }
}

//Main class to start the thread
public class P17_Interface {
 public static void main(String[] args) {
     // Create an object of the class that implements Runnable
     MyRunnable runnable = new MyRunnable();

     // Create a Thread object and pass the Runnable object to it
     Thread thread = new Thread(runnable);

     // Start the thread
     thread.start();

     System.out.println("Main thread finished.");
 }
}
