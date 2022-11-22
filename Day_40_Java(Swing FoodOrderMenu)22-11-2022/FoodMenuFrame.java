//Program-    To Design a Frame with Swing components for Food order billing system.
//Constraint-    Tax required to add should be 5% on total amount of Bill before adding tax.
import javax.swing.*;  
import java.awt.event.*;  
public class FoodMenuFrame extends JFrame implements ActionListener{  
        // extended Jframe & implemented action listioner
    JLabel l;  
    JCheckBox cb1,cb2,cb3,cb4;  
    JButton b;  
    FoodMenuFrame(){         
        l=new JLabel("Food Ordering System");     
        l.setBounds(50,50,300,20);  
        cb1=new JCheckBox("Pizza @ 100");  
        cb1.setBounds(100,80,150,20);  
        cb2=new JCheckBox("Burger @ 30");  
        cb2.setBounds(100,110,150,20);  
        cb3=new JCheckBox("Pasta @ 90");  
        cb3.setBounds(100,140,150,20);
        cb4=new JCheckBox("Noodles @ 80");  
        cb4.setBounds(100,170,150,20);  
        b=new JButton("Order");
        b.setBounds(100,220,80,30);  
        b.addActionListener(this);                          //button click action event 
        add(l);add(cb1);add(cb2);add(cb3);add(cb4);add(b);  //added all the component to frames 
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
        setDefaultCloseOperation(EXIT_ON_CLOSE);  
    }  
    public void actionPerformed(ActionEvent e){  
        float amount=0;
        double gst=0;  
        String msg="";  
        if(cb1.isSelected()){                       //checking if checkbnox is selected or not
            amount+=100;  
            msg="Pizza:    100\n";  
        }  
        if(cb2.isSelected()){  
            amount+=30;  
            msg+="Burger:  30\n";  
        }  
        if(cb3.isSelected()){  
            amount+=90;  
            msg+="Pasta:   90\n";  
        }  
        if(cb4.isSelected()){  
            amount+=80;  
            msg+="Noodles: 80\n";  
        }  
        
        msg+="---------------------------\n"; 
        gst=amount*0.05;                          //tax value calculated
        amount +=gst;
                  //
        JOptionPane.showMessageDialog(this,msg+"Tax:     "+gst+"\nTotal:   "+amount);
 
    }  
    public static void main(String[] args) {  
        new FoodMenuFrame();  
    }  
}  