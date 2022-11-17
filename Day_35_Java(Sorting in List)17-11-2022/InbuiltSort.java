//Program - To sort the list using inbuilt methods of collection class 

import java.util.*;  

class InbuiltSort{  
  public static void main(String args[]){  
  //Creating a list of string  
  List<String> list1=new ArrayList<String>();  
  Scanner sc = new Scanner(System.in);
  System.out.println("How many string element you have to store-");
  int n= sc.nextInt();
  for (int i=0;i<n;i++) {
    list1.add(sc.next());     //taking string input in list
   } 
   
           //Sorting the list  
  Collections.sort(list1);  
    
  //Creating a list of numbers  
  List<Integer> list2=new ArrayList<Integer>();  
  System.out.println("How many integer element you have to store-");
  int n1= sc.nextInt();
  for(int i=0;i<n1;i++) {
    list2.add(sc.nextInt());;    //taking number input in list
   }  
   sc.close();

           //Sorting the list  
   Collections.sort(list2);  
    
   //Traversing list1 through the for-each loop 
   System.out.println("Sorting Strings..."); 
   for(String ele:list1)  
      System.out.println(ele);  
   //Traversing list2 through the for-each loop 
   System.out.println("Sorting numbers..."); 
    for(Integer number:list2)  
      System.out.println(number);  
   }  
   
}  
// Sample Input 1
// How many string element you have to store-
// 4
// Hello
// world
// hello 
// word
// How many integer element you have to store-
// 6
// 22
// 11
// 33
// 55
// 44
// 66

// Sample Output 1
// Sorting Strings...
// Hello
// hello
// word
// world
// Sorting numbers...
// 11
// 22
// 33
// 44
// 55
// 66