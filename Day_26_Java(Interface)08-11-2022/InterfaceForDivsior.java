//Program- You are given an interface AdvancedArithmetic which contains a method signature int divisor_sum(int n).
//         You need to write a class called MyCalculator which implements the interface.
//         divisorSum function just takes an integer as input and return the sum of all its divisors.
//         For example divisors of 6 are 1, 2, 3 and 6, so divisor_sum should return 12.
//         You just need to write the MyCalculator class only. Your class shouldn't be public.
//Constraint- The value of n will be at most 1000.
 
import java.util.*;
interface AdvancedArithmetic{      //interface with just one divisor_sum() method
  int divisor_sum(int n);
}
//Write your code here only this below class is created by me.
class MyCalculator implements AdvancedArithmetic{       //implemented a interface in class MyCalculator 
    public int divisor_sum(int n){                      //declared method same as interface
        int sum = 0;                                    
        for (int i = 1; i<=n;i++){                      //loop goes from 1 to n 
            if (n % i == 0){                            //checks if every number upto n is the part of its divisor
                sum = sum + i;                          //that value is added to sum 
            }
        }
        return sum;                     
    }
}

class InterfaceForDivsior{
    public static void main(String []args){
        MyCalculator my_calculator = new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(my_calculator.divisor_sum(n) + "\n");
      	sc.close();
    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o){
        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++){
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
// Sample Input-
//   6
// Sample Output-
//   I implemented: AdvancedArithmetic
//   12
