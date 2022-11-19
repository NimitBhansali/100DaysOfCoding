//Program- To implement Java Swing and JFrames with Labels,textfields and button

import javax.swing.*;                                         //imported swing providing classes for java swing API

public class FirstSwing {  
   public static void main(String[] args) {  
      JFrame f=new JFrame("First Swing Example");       //creating instance of JFrame  
      JLabel l1,l2;  
      JTextField t1,t2;
      JButton b; 

      l1=new JLabel("First Label.");   
      l1.setBounds(50,50, 100,30);         //Setting the label-1 to the co-ordinates specified

      l2=new JLabel("Second Label.");  
      l2.setBounds(50,100, 100,30);        //Setting the label-2 to the co-ordinates specified
      
       
      t1=new JTextField("First Text Field Enter data");  
      t1.setBounds(150,50, 200,30);         //Setting the TextBox-1 to the co-ordinates specified
      t2=new JTextField("Second Text Field Enter data");  
      t2.setBounds(150,100, 200,30);        //Setting the TextBox-2 to the co-ordinates specified
        
          
      b=new JButton("Submit");                         //creating instance of JButton  
      b.setBounds(110,150,100, 40);      //x axis, y axis, width, height  
           
      f.add(l1); f.add(l2);                 //adding label in JFrame
      f.add(t1); f.add(t2);                 //adding TextBox in JFrame
      f.add(b);                             //adding button in JFrame
      f.setSize(400,500);     //400 width and 500 height  
      f.setLayout(null);           //using no layout managers  
      f.setVisible(true);                //making the frame visible          
    }  
}  