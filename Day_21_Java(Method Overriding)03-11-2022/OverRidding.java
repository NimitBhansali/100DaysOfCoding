//Program- Complete the code in your editor by writing an overridden getNumberOfTeamMembers method that prints the same statement as the
//         superclass' getNumberOfTeamMembers method, except that it replaces n with 11  (the number of players on a Soccer team).
//Note: When overriding a method, you should precede it with the @Override annotation. 
//      The parameter(s) and return type of an overridden method must be exactly the same as those of the method inherited from the supertype.
import java.util.*;
class Sports{                                                           //Class Sports created with some methods
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{                                            //class Soccer created with properties of Sports class(inheritance)
    @Override                                                           //When overriding a method, you should precede it with the @Override annotation.
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
        System.out.println("Each team has 11 players in "+ getName());
    }
}

public class OverRidding{	
    public static void main(String []args){
        Sports c1 = new Sports();                                       //object(c1) is created of sports class
        Soccer c2 = new Soccer();                                       //object(c2) is created of soccer class
        System.out.println(c1.getName());                               
        c1.getNumberOfTeamMembers();                                    //c1 object is used to access methods of there class(sports)
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();                                    //c2 object is used to access methods of there class(soccer)
	}
 }
// Output Format (When executed, your completed code should print the following):

   //  Generic Sports
   //  Each team has n players in Generic Sports
   //  Soccer Class
   //  Each team has 11 players in Soccer Class