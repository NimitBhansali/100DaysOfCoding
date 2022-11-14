//Program- Java code for thread creation by extending the Thread class.
//INPUT- 
//     Take Number of threads to create at random.
//OUTPUT-
//     'Random thread id' is running.
import java.util.Scanner;

class MultithreadingTest extends Thread {
	public void run()
	{
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
		}
		catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
}

// Main Class
public class Multithread {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Threads- ");
		int n = sc.nextInt(); // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingTest object = new MultithreadingTest();
			object.start();
		}
        sc.close();
	}
}
//Sample Input-
// Enter Number of Threads- 
// 10

//Sample Output-
// Thread 14 is running
// Thread 16 is running
// Thread 21 is running
// Thread 15 is running
// Thread 22 is running
// Thread 20 is running
// Thread 19 is running
// Thread 17 is running
// Thread 18 is running
// Thread 23 is running