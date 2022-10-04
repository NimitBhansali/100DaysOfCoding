
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// Probelm 10- Java Static initialization block

public class  JavaStaticBlock{
     static boolean flag=false;
     static int B,H; 
     static{
         
     Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if(B<=0 || H<=0){
            flag=false;
System.out.println("java.lang.Exception: Breadth and height must be positive");
        } 
        else{
            flag = true;
        }    
         
     }
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

