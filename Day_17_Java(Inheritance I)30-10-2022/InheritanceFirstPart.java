//Program- Use Inheritance and add a sing method to the Bird class, then modify the main method accordingly so that the code prints the following lines:
//         I am walking
//         I am flying
//         I am singing
// its simple program from hacker rank --- LETS SOLVE IT
//No test cases just had to build a method in Bird class as sing().
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Animal{
	void walk(){                                //walk method with its instructions
		System.out.println("I am walking");
	}
}

class Bird extends Animal{                      //extends keyword is used in inheritance to derive property from Base class(Animal)
	void fly(){                                 //fly method with its instructions
		System.out.println("I am flying");
	}
    void sing(){                                //sing method with its instructions
        System.out.println("I am singing");
    }
}
public class InheritanceFirstPart{
   public static void main(String args[]){
	  Bird bird = new Bird();                   //object(bird) created for Bird class 
	  bird.walk();                              //object used to call methods*
	  bird.fly();
      bird.sing();
   }
}
//Sample Output: 
//  I am walking
//  I am flying
//  I am singing