//Program: Generic methods are a very efficient way to handle multiple datatypes using a single method. This problem will test your knowledge on Java Generic methods.
// Let's say you have an integer array and a string array. You have to write a single method printArray that can print all the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

// You are given code in the editor. Complete the code so that it prints the following lines:
// 1
// 2
// 3
// Hello
// World

//constraint: Do not use method overloading because your answer will not be accepted.
import java.util.*;
public class JavaGenerics {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Integer[] array = {1, 2, 3};
        String[] str1 = {"Hello", "World"};      
        printAll(array);
        printAll(str1);
        
    }
    public static <E> void printAll(E[] data){//created a generic method using <E>
        for(E t: data){
            System.out.println(t);
        }

    }
}