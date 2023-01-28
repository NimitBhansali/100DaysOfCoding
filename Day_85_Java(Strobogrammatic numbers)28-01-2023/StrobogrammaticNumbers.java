import java.util.Scanner;

public class StrobogrammaticNumbers {
    public static void main(String[] args) {
        int ld , res = 0, flag =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        String s = Integer.toString(n);
        int length = s.length();
        if (length == 1){
            if(s.charAt(0)=='0' || s.charAt(0)=='1' || s.charAt(0)=='8')
                System.out.println(n+" is a Strobogrammatic number");
            else System.out.println(n+" is not Strobogrammatic number");
        }
        else {
            char [] ch = s.toCharArray();

            for (int i = 0; i <s.length() ; i++) {
                if (ch[i] == '2' || ch[i] == '3' || ch[i] == '4' || ch[i] == '5' || ch[i] == '7'){
                flag =1;
                }
                else{
                    while (n>0){
                                ld = n % 10;
                                if (ld == 6){
                                    ld=9;
                                }
                                else if (ld==9)
                                {
                                    ld=6;
                                }
                                res = (res*10)+ld;
                                n/=10;
                    }
                }
            }
            if(res == temp && flag == 0)
            System.out.println(temp+" is Strobogrammatic number");
            else
                System.out.println(temp+" is not Strobpgrammatic number");
        }
    }
}
