//Program - To implement stack using linked list all methods with menu driven
import java.util.Scanner; 
public class StackSinglyLinkedList { 
    Node top;
     class Node { 
      int val;
     Node next;
      Node(int x) {
         val = x; 
         next = null;
      }
     }
     public void push(int x) { 
        Node ptr = new Node(x);
         if (top == null)
          {
             top=ptr; 
             return; 
        }
         else{ 
            ptr.next=top; 
            top=ptr;
            } 
            System.out.println("Item pushed");
         }

         public void pop()
         { 
            Node ptr; 
            if(top==null)
            { 
                System.out.println("UNDERFLOW"); 
            }
             else{
                 top=top.next;
                 }
                  System.out.println("Item popped");
                 }


                 public void display()
                 {
                     Node ptr=top;
                      if (ptr==null)
                      {
                         System.out.println("Stack is empty");
                         }
                          else
                          {
                             System.out.println("Printing Stack elements");
                              while(ptr!=null){
                                 System.out.println(" | "+ptr.val+ " | ");
                                  ptr=ptr.next; 
                                }
                             
                            }
                         
                    }

                    public static void main(String[] args) {
                        Scanner sc=new Scanner(System.in);
                        StackSinglyLinkedList s=new StackSinglyLinkedList();
                        int flag=0;
                            while(flag==0){
                                System.out.println("1.Push");
                                System.out.println("2.Pop");
                                System.out.println("3.Display");
                                System.out.println("4.Exit");
                                int ch=sc.nextInt();
                                switch (ch) {
                                    case 1:
                                        System.out.println("Enter the element to be inserted-");
                                        s.push(sc.nextInt());
                                        break;
                                    case 2:
                                        s.pop();
                                        break;
                                    case 3:
                                        s.display();
                                        break;
                                    case 4:
                                        flag=1;
                                        break;
                                    default:System.out.println("Wrong Input!!");
                                        break;
                                } 
                            }  
                    }
                }