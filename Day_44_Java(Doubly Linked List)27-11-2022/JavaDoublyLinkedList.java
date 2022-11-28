//Implement Doubly Linked List with all methods in menu driven form.
import java.util.*;
class JavaDoublyLinkedList{
    //Creating a node
    Node head;          //creating head which stores address
    class Node{
        int data;       
        Node next;   
        Node prev;   
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
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
     //---------------Adding node at element after you wanted to insert-----------------
     public void addSpecific(int data,int pos){
        if(head==null){                 //if list is empty 
            System.out.println("Can not insert at this position list is empty.");
            return;
        }
        
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
            if(temp == null){
                System.out.println("Can not insert at that position cause it does not have thta much elements");
                return;
            }
        }
        Node newNode= new Node(data);  //creating a new node
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next.prev=newNode;
        temp.next=newNode;
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
        newNode.prev=currNode;
    }
    //---------------Deleting node at First-----------------
    public void deleteFirst(){
        if(head==null){                 
            System.out.println("Empty List can not delete");
            return;
        }
        head=head.next;
        head.prev=null;
    }
    //---------------Deleting node at Specific-----------------
    public void delSpecific(int val){
        if(head==null){                 //if list is empty 
            System.out.println("Can not delete list is empty.");
            return;
        }
        
        Node temp=head,temp1;
        while(temp.data != val){
            temp=temp.next;
            if(temp.next == null){
                System.out.println("Can not delete at that position");
                return;
            }
        }
        temp1=temp.next;
        temp.next=temp1.next;
        temp1.next.prev= temp;
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
        Node secondLastNode=head;
        while(secondLastNode.next!=null){
           secondLastNode=secondLastNode.next;
        }
        secondLastNode.prev.next=null;   
    }

    //--------------Searching an Element------------
    public void search(Scanner sc){
        if(head==null){
            System.out.println("Empty list can not search");
            return;
        }
        else{
            Node temp=head;
            int item,flag=0,i=0;
            System.out.println("Enter Element to be searched ");
            item=sc.nextInt();
            while(temp!=null){
                if(temp.data==item){
                    System.out.println("Element found at position "+(i+1));
                    flag=1;
                    break;
                }
                else{
                    flag=0;
                }
                i++;
                temp=temp.next;
            }
            if(flag==0){
                System.out.println("Element not found");
            }
        }
    }
        
    //---------------Printing list-----------------------
    public void printList(){
        if(head==null){
            System.out.println("Empty List ");
            return;
        }
        Node currNode=head;
        System.out.print("NULL");
        while(currNode != null){
            System.out.print(" <--"+currNode.data+ "-->");
            currNode=currNode.next;    
        }
        System.out.print("NULL"); 
    }



    public static void main(String[] args) {
        JavaDoublyLinkedList Dlist= new JavaDoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int ch;
        
        do{
            System.out.println("\nEnter Choice:\n1. Print List\n2. Add in beginning\n3. Add at last\n4. Delete from Beginning\n5. Delete at last\n6. Add at Specific\n7. Delete after specific\n8. Search\n9.Exit");
            ch=sc.nextInt();
            switch(ch){
                case 1 : Dlist.printList();
                         break;
                case 2 : System.out.println("Enter data-");
                         int x = sc.nextInt();
                         Dlist.addFirst(x);
                         break;
                
                case 3 : System.out.println("Enter data-");
                         int y = sc.nextInt();
                         Dlist.addLast(y);
                         break;
                case 4 : Dlist.deleteFirst();
                         break;
                case 5 : Dlist.deleteLast();
                         break;
                case 6 : System.out.println("Enter position after which to add ");
                         int pos = sc.nextInt();
                         System.out.println("Enter data-");
                         int add = sc.nextInt();
                         Dlist.addSpecific(add, pos);
                         break;
                case 7 : System.out.println("Enter data after which to delete ");
                         int pos1 = sc.nextInt();
                         Dlist.delSpecific(pos1);
                         break;
                case 8 : Dlist.search(sc);
                         break;
                case 9:  System.exit(0);
                         break;
                default : System.out.println(" Wrong choice choose again "); 
            }
        }
        while(ch!=9);
        sc.close();
    }
}
