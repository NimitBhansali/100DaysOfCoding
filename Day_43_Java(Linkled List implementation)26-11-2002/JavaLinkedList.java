//Implement Linked List with all methods in menu driven form.
import java.util.*;
class JavaLinkedList{
    //Creating a node
    Node head;          //creating head which stores address
    class Node{
        int data;       
        Node next;      
        Node(int data){
            this.data=data;
            this.next=null;
        }   
    }
    //---------------Adding node at First-----------------
    public void addFirst(int data){
        Node newNode= new Node(data);  //creating a new node 
        if(head==null){                 //if list is empty 
            head = newNode;
            return;
        }
        newNode.next= head;
        head=newNode;    
    }
    //---------------Adding node at last-----------------
    public void addLast(int data){
        Node newNode= new Node(data);   //creating a new node 
        
        if(head==null){                 //if list is empty        
            head = newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //---------------Deleting node at First-----------------
    public void deleteFirst(){
        if(head==null){                 
            System.out.println("Empty List can not delete");
            return;
        }
        head=head.next;
    }
   
    //---------------Deleting node at last-----------------
    public void deleteLast(){
        if(head==null){
            System.out.println("Empty List can not delete");
            return;
        }
        else if(head.next==null){           //if only one node in list
            head = null;
            return;
        }
        Node lastNode=head.next;
        Node secondLastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLastNode=secondLastNode.next;
        }
        secondLastNode.next=null;   
    }
        
    //---------------Printing list-----------------------
    public void printList(){
        if(head==null){
            System.out.println("Empty List ");
            return;
        }
        Node currNode=head;
        while(currNode != null){
            System.out.print(currNode.data+ "-->");
            currNode=currNode.next;    
        }
        System.out.print("NULL"); 
    }



    public static void main(String[] args) {
        JavaLinkedList list= new JavaLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch;
        
        do{
            System.out.println("\nEnter Choice:\n1.Print List\n2.Add in beginning\n3.Add at last\n4.Delete from Beginning\n5.Delete at last\n6. Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1 : list.printList();
                         break;
                case 2 : System.out.println("Enter data-");
                         int x = sc.nextInt();
                         list.addFirst(x);
                         break;
                case 3 : System.out.println("Enter data-");
                         int y = sc.nextInt();
                         list.addLast(y);
                         break;
                case 4 : list.deleteFirst();
                         break;
                case 5 : list.deleteLast();
                         break;
                case 6:  System.exit(0);
                         break;
                default : System.out.println("Wrong choice choose again"); 
            }
        }
        while(ch!=6);
        sc.close();
    }
}