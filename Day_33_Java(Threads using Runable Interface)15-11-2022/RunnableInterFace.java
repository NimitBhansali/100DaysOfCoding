//Program- How to Implement thread using Runnable interface in Java. 
//         Create a Runnable implementer and implement the run() method. 
 
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RunnableInterFace {

	public static void main(String[] args){
        System.out.println("Enter number of threads- ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<n;i++){                                   //using loop to see the Runnable output
		   System.out.println("Main thread is- " + Thread.currentThread().getName());
		   Thread t1 = new Thread(new RunnableInterFace().new RunnableImpl());
		   t1.start();
    }
	}

    private class RunnableImpl implements Runnable {
 
        public void run(){
            System.out.println(Thread.currentThread().getName() + ", executing run() method!");
        }
     }
}
//Sample Input 1-
// Enter number of threads- 
//   8

//Sample Output 1-
// Main thread is- main
// Main thread is- main
// Main thread is- main
// Main thread is- main
// Thread-0, executing run() method!
// Main thread is- main
// Thread-2, executing run() method!
// Thread-1, executing run() method!
// Main thread is- main
// Main thread is- main
// Thread-4, executing run() method!
// Thread-3, executing run() method!
// Thread-5, executing run() method!
// Thread-6, executing run() method!