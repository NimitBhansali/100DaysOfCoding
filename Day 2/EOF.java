// problem 9th Java End of File
import java.util.*;

public class EOF {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
          Scanner sc = new Scanner(System.in);
          int i = 0;

          while(sc.hasNext())
            {
                i++;
                System.out.printf(i+" "+sc.nextLine()+"\n");
            }

           sc.close();
    }
}
