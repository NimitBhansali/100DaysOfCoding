
import java.util.*;
public class Queue {

	private int start;
	private String [] q;
	private int end;
	private int count = 0;
	
	public Queue(){
		start = -1;
		end = 0;
		q = new String[1];
		
	}
	private int size(){
		return count;
	}
	
	public boolean isEmpty(){
		return size() == 0;
	}

	public void enqueue(String value){
		if (size() == q.length){
			end = q.length;
			resize(2 * q.length);
		}
		if (isEmpty())
		  start = end;
		q[end] = value;
		end = (end + 1) % q.length;
		count ++;
	}
	
	public void dequeue(){
		assert (start >=0);
		String item = q[start];
		count--;
		q[start] = null;
		start = (start + 1) % q.length;
		if (count == q.length / 4){
			System.out.println("resize");
			resize(q.length / 2);
			end = q.length /2;
		}
		System.out.println("Dequed "+ item);
	}
	
	// public void resize(int new_size) {
	// 	String [] new_array = new String[new_size];
	// 	int old_size = q.length;
	// 	int i = start;
	// 	int limit = (start < end) ? end : old_size;
	// 	for (i = start; i < limit; i++) {
	// 			new_array[i - start] = q[i];
	// 	}
	// 	if (end < start) {
	// 		for (int j = 0; j < end; j++) {
	// 			new_array[i] = q[j];
	// 			i++;
	// 		}
	// 	}
	// 	start = 0;
	// 	q = new_array;
	// }
	
	public void printQueue() {
		for (String s: q) {
			System.out.println(s);
		}
	}

//	Queue client
	public static void main(String[] args) {
		Queue q = new Queue();
		Scanner sc = new Scanner(System.in);
        int ch;
        
        do{
            System.out.println("\nEnter Choice:\n1. Print queue\n2. Enquue\n3. Dequeue \n4. Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1 : q.printQueue();
                         break;
            
                case 2 : System.out.println("Enter data-");
                         String y = sc.next();
                         q.enqueue(y);
                         break;
                case 3 : q.dequeue();
                         break;
               
                case 4:  System.exit(0);
                           break;
                default : System.out.println(" Wrong choice choose again "); 
            }
        }
        while(ch!=4);
        sc.close();
    }
	}