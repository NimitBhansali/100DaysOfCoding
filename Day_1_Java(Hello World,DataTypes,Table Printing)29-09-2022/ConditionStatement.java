// If else 3rd Problem conditional statements to automate decision-making processes
 
import java.util.*;
public class ConditionStatement {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        if(n%2==1)
            System.out.println("Weird");
        else if(n%2==0 && n>=2 && n<=5 )
            System.out.println("Not Weird");
        else if(n%2==0 && n>=6 && n<=20 )
            System.out.println("Weird");
        else 
            System.out.println("Not Weird");
        scanner.close();
    }
}
