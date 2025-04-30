
// WAJP to create one thread by extending Thread class in another 
// Class.

package Module6;

//Class extending Thread
class MyThread extends Thread {
 public void run() {
     // Code that will be executed in the new thread
     for (int i = 1; i <= 5; i++) {
         System.out.println("Child Thread: " + i);
         try {
             Thread.sleep(500); // Pause for 500 milliseconds
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted.");
         }
     }
 }
}

//Main class to run the thread
public class P18_ThreadClasstoanother {
 public static void main(String[] args) {
     // Create an instance of the class that extends Thread
     MyThread thread = new MyThread();

     // Start the thread
     thread.start();

     // Main thread continues
     for (int i = 1; i <= 5; i++) {
         System.out.println("Main Thread: " + i);
         try {
             Thread.sleep(500); // Pause for 500 milliseconds
         } catch (InterruptedException e) {
             System.out.println("Main thread interrupted.");
         }
     }
 }
}
