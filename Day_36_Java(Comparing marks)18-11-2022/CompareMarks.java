//Program- To Check and compare marks of 3 students ,show the highest scorer with name and percentage.

import java.util.Scanner;

public class CompareMarks {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of all 3 Student- ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();                              //taken input of names
        int m1,m2,m3,Totalmark1=0,Totalmark2=0,Totalmark3=0;

        System.out.println("Enter 5 Suject marks of - "+ s1);
            for(int i=0;i<5;i++){
                m1=sc.nextInt();                               //taking first students marks
                Totalmark1 += m1;
            }
            float per1=Totalmark1/5;

         System.out.println("Enter 5 Suject marks of - "+ s2);
            for(int j=0;j<5;j++){
                m2=sc.nextInt();                               //taking second students marks
                Totalmark2 += m2;
            }
            float per2=Totalmark2/5;
            
         System.out.println("Enter 5 Suject marks of - "+ s3);
            for(int i=0;i<5;i++){
                m3=sc.nextInt();                              //taking third students marks
                Totalmark3 += m3;   
            }
            float per3=Totalmark3/5;
            sc.close();
            //comparing all 3 students marks 
        if (Totalmark1>Totalmark2 && Totalmark1>Totalmark3)             
            System.out.println(s1 +" has the highest percentage of "+per1+"%");

        else if(Totalmark2>Totalmark1 && Totalmark2>Totalmark3)
            System.out.println(s2 +" has the highest percentage of "+per2+"%");

        else 
            System.out.println(s3 +" has the highest percentage of "+per3+"%");
        
    }
        
}
   //Sample Input 1
// Enter Name of all 3 Student- 
// Ankit
// Akarsh
// Sujit
// Enter 5 Suject marks of - Ankit
// 33
// 34 
// 22
// 33
// 44
// Enter 5 Suject marks of - Akarsh
// 44
// 22
// 44
// 56
// 22
// Enter 5 Suject marks of - Sujit
// 77
// 55
// 88
// 66
// 77

   //Sample Output 1
// Sujit has the highest percentage of 72.0%
