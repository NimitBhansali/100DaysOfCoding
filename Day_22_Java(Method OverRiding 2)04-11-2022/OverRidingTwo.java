// Program-  When a method in a subclass overrides a method in superclass, it is still possible to call the overridden method using super keyword.
//           If you write super.func() to call the function func(), it will call the method that was defined in the superclass.

//OUTPUT-     You are given a partially completed code in the editor. Modify the code so that the code prints the following text:
// Hello I am a motorcycle, I am a cycle with an engine.
// My ancestor is a cycle who is a vehicle with pedals

import java.util.*;
import java.io.*;

class BiCycle{                                            //Class BiCycle created with some methods
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{                       //class MotorCycle created with properties of BiCycle class(inheritance)
	String define_me(){                                        
		return "a cycle with an engine.";
	}
	
	MotorCycle(){                                          //Constructor of the class is created 
		System.out.println("Hello I am a motorcycle, I am "+ define_me());        //MotorCycle's define_me method  is called here

		String temp=super.define_me(); //Fix this line                            //temp has string returned from superclass(BiCycle) define_me() (method)

		System.out.println("My ancestor is a cycle who is "+ temp );                //printed some string
	}
	
}
class OverRidingTwo{
	public static void main(String []args){
		MotorCycle M=new MotorCycle();                 //object M is created of MotorCycle class 
	}
}
//Output
//  Hello I am a motorcycle, I am a cycle with an engine.
//  My ancestor is a cycle who is a vehicle with pedals.