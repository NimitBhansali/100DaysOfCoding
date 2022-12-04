//Implement a Queue using Linked List with all methods in menu driven form.
import java.util.*;

class QueueLL{
    Node rear = null;
    Node front =null;
    class Node{   
        int data;       
        Node next;      
        Node(int data){   //Creating a node of queue
            this.data=data;
            this.next=null;
        }   
    }

    //---------------Adding node at Rear-----------------
    public void Enqueue(int data){
        Node newNode= new Node(data);   //creating a new node 
        
        if(rear==null){                 //if list is empty        
            rear=front = newNode;
            return;
        }
        this.rear.next=newNode;
        this.rear=newNode;
    }

    //---------------Deleting node from front -----------------
    public void Dequeue(){
        if(this.front==null){                 
            System.out.println("Queue is empty");
            return;
        }
        Node temp = this.front;
        this.front=this.front.next;
        if (this.front == null){
           this.rear = null;
        }
        System.out.println("Dequeued "+ temp.data);
    }

    //---------------printing front element----------------
    void peek(){
        if(this.front==null){                 
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front Element- "+front.data);
    }

    //---------------Printing Queue-----------------------
    public void printQueue(){
        if(this.front==null){
            System.out.println("Empty Queue ");
            return;
        }
        Node currNode=front;
        System.out.print("FRONT --> ");
        while(currNode != rear){
            System.out.print(currNode.data+ " <--");
            currNode=currNode.next;    
        }
        System.out.print(currNode.data+ " <--");
        System.out.print("REAR"); 
    }

    public static void main(String[] args) {
        QueueLL Qlist= new QueueLL();
        Scanner sc = new Scanner(System.in);
        int ch;
        
        do{
            System.out.println("\nEnter Choice:\n1. Print Queue\n2. Enqueue\n3. Dequeue\n4. Peek\n5. Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1 : Qlist.printQueue();
                         break;
                case 2 : System.out.println("Enter data-");
                         int y = sc.nextInt();
                         Qlist.Enqueue(y);
                         break;
                case 3 : Qlist.Dequeue();
                         break;
                case 4 : Qlist.peek();
                         break;
                case 5:  System.exit(0);
                         break;
                default : System.out.println("Wrong choice choose again"); 
            }
        }
        while(ch!=5);
        sc.close();
    }
}
// ---------OUTPUT----------
// Enter Choice:
// 1. Print Queue
// 2. Enqueue
// 3. Dequeue
// 4. Peek
// 5. Exit
// 2
// Enter data-
// 22

// Enter Choice:
// 1. Print Queue
// 2. Enqueue
// 3. Dequeue
// 4. Peek
// 5. Exit
// 2
// Enter data-
// 33

// Enter Choice:
// 1. Print Queue
// 2. Enqueue
// 3. Dequeue
// 4. Peek
// 5. Exit
// 1

// FRONT --> 22 <--33 <--REAR

// Enter Choice:
// 1. Print Queue
// 2. Enqueue
// 3. Dequeue
// 4. Peek
// 5. Exit
// 3
// Dequeued 22

// Enter Choice:
// 1. Print Queue
// 2. Enqueue
// 3. Dequeue
// 4. Peek
// 5. Exit
// 1
// FRONT --> 33 <--REAR

// Enter Choice:
// 1. Print Queue
// 2. Enqueue
// 3. Dequeue
// 4. Peek
// 5. Exit
// 5            