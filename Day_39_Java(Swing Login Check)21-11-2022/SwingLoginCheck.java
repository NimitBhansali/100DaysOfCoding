    //Program- To implement login check using Swing class components
import javax.swing.*;
import java.awt.event.*;

public class SwingPasswordField {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Check");               //Title for frame 
        JLabel label = new JLabel();                              
        label.setBounds(60, 150, 200, 50);
        final JPasswordField value = new JPasswordField();        //Password textfield
        value.setBounds(100, 75, 100, 30);
        JLabel l1 = new JLabel("Username:");
        l1.setBounds(20, 20, 80, 30);
        JLabel l2 = new JLabel("Password:");
        l2.setBounds(20, 75, 80, 30);
        JButton b = new JButton("Login");
        b.setBounds(100, 120, 80, 30);
        final JTextField text = new JTextField();
        text.setBounds(100, 20, 100, 30);
        f.add(value);
        f.add(l1);
        f.add(label);
        f.add(l2);
        f.add(b);
        f.add(text);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = new String(text.getText());               //geting input of textfield into username variable
                String pass = new String (value.getPassword());             //geting input of Password textfield into pass variable
                if(username.equals("nimit") && pass.equals("123"))  //used .equals() method to check the login credentials
                    label.setText("Login Succesfull..");
                else 
                    label.setText("Login Failed..");
            }
        });
    }
}