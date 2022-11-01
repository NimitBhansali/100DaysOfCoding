//Program- You have to create another class that extends the abstract class. Then you can create an instance of the new class.
//         --Notice that setTitle method is abstract too and has no body. That means you must implement the body of that method in the child class.
//         --In the editor, we have provided the abstract Book class and a Main class. 
//         --In the Main class, we created an instance of a class called MyBook. Your task is to write just the MyBook class.
//Constraints---- Your class mustn't be public.
           // its simple program from hacker rank --- LETS SOLVE IT
//No test cases just needed to build a class which extends abstract class Book and abstract method.
import java.util.*;
abstract class Book{                                    //abstract class is created with keyword abstract
	String title;                                       
	abstract void setTitle(String s);                   //abstract method is created with keyword abstract
	String getTitle(){                                  //string type method
		return title;                                   
	}
}
class MyBook extends Book{                              //class (MyBook) created with properties of abstract class(Book)
    void setTitle(String s){
        title = s;
    }
}
public class JavaAbstractClass{	
	public static void main(String []args){
		//Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
		Scanner sc=new Scanner(System.in);
		String title=sc.nextLine();
		MyBook new_novel=new MyBook();                                     //object(new_novel) created of class MyBook
		new_novel.setTitle(title);                                                                                  
		System.out.println("The title is: "+new_novel.getTitle());
      	sc.close();		
	}
}
// Sample Input 1
   // A tale of two cities

// Sample Output 1
  // The title is: A tale of two cities

// Sample Input 2
   // Sonar tori

// Sample Output 2
  // The title is: Sonar tori
