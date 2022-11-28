//Implement Circular Singly Linked List with all methods in menu driven form.
import java.util.*;
class CircularSinglyLinkedList{
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
            newNode.next=head; 
            return;
        }
        Node temp=head;
        while(temp.next != head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next= head;
        head=newNode;    
    }
    //---------------Adding node at last-----------------
    public void addLast(int data){
        Node newNode= new Node(data);   //creating a new node 
        
        if(head==null){                 //if list is empty        
            head = newNode;
            newNode.next=head;
            return;
        }
        Node currNode=head;
        while(currNode.next != head){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        newNode.next=head;
    }
    //---------------Deleting node at First-----------------
    public void deleteFirst(){
        if(head==null){                      
            System.out.println("Empty List can not delete");
            return;
        }
        else if(head.next==head){    //if list has only one node
            head=null;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=head){
            lastNode=lastNode.next;

        }
        lastNode.next=head.next;
        head=lastNode.next;
    }
   
    //---------------Deleting node at last-----------------
    public void deleteLast(){
        if(head==null){
            System.out.println("Empty List can not delete");
            return;
        }
        else if(head.next==head){           //if only one node in list
            head = null;
            return;
        }
        Node secondLastNode=head;
        while(secondLastNode.next.next!=head){
            secondLastNode=secondLastNode.next;

        }
        secondLastNode.next=head;  
    }
    //-------------------Search an element----------------
    public void search(Scanner sc){
        Node temp=head;
        int i=0,flag=0,item;
        if(head==null){
            System.out.println("Empty list can not search");
            return;
        }
        System.out.println("Enter element you want to search");
        item=sc.nextInt();
        if(head.data==item){
            System.out.println("Element "+item+" Found at "+(i+1)+" position");
            flag=1;
        }
        else{
            while(temp.next!=head){
                if(temp.data==item){
                    System.out.println("Element found at position "+(i+0));
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
                i++;
                temp=temp.next;
            }
            if(temp.data==item){        //for last element
                System.out.println("Element found at position "+(i+1));
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Element not Found in List");
        }

    }
        
    //---------------Printing list-----------------------
    public void printList(){
        if(head==null){
            System.out.println("Empty List ");
            return;
        }
        Node currNode=head;
        while(currNode.next != head){
            System.out.print(currNode.data+ "-->");
            currNode=currNode.next;    
        }
        System.out.print(currNode.data+ "-->");
        System.out.print("HEAD"); 
    }



    public static void main(String[] args) {
        CircularSinglyLinkedList Clist= new CircularSinglyLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch;
        
        do{
            System.out.println("\n Enter Choice:\n1. Print List\n2. Add in beginning\n3. Add at last\n4. Delete from Beginning\n5. Delete at last\n6. Search \n7. Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1 : Clist.printList();
                         break;
                case 2 : System.out.println("Enter data-");
                         int x = sc.nextInt();
                         Clist.addFirst(x);
                         break;
                case 3 : System.out.println("Enter data-");
                         int y = sc.nextInt();
                         Clist.addLast(y);
                         break;
                case 4 : Clist.deleteFirst();
                         break;
                case 5 : Clist.deleteLast();
                         break;
                case 6 : Clist.search(sc);
                         break;
                case 7 : System.exit(0);
                         break;
                default : System.out.println("Wrong choice choose again"); 
            }
        }
        while(ch!=7);
        sc.close();
    }
}
