// A wind chill warning for communities including Leh and Gulmarg, Kashmir, is forecast to remain in effect until 12 p.m on December 12, 2020.
// People were afraid to go out and were in complete lockdown. Can you please help them to calculate the wind chill factor to help them? 
//Windchill factor is the felt air temperature on exposed skin due to the wind. The wind chill temperature is always lower than the air temperature and is calculated as per the following formula. 
    //WCF = 35.74 + 0.6215t + (0.4275t - 35.75) * v^0.16).
//Program-  Write a Java program to receive values of temperature and wind velocity and calculate the Wind Chill Factor.
// Input format
// The input consists of two integers.
// The first integer corresponds to the temperature of the wind and the second integer corresponds to the wind velocity.

// Output format
// The output consists of a float value that corresponds to the Wind Chill Factor.
import java.util.*;
import java.lang.Math;
public class WindChillFactor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature value-");
        int temp=sc.nextInt();
        System.out.println("Enter Wind Velocity value-");
        int windV=sc.nextInt();
        double wcf;
        System.out.println("Wind Chill Factor is- ");
        wcf=(35.74 + (0.6215*temp)+(((0.4275*temp)-35.75)* (Math.pow(windV, 0.16))));
        System.out.format("%.4f",wcf);
        sc.close();
    }
}
//Sample Input:
// Enter Temperature value-
// 35
// Enter Wind Velocity value-
// 20
//Sample Output:
// Wind Chill Factor is- 
// 23.9213