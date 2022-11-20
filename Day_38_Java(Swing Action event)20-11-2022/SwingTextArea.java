import javax.swing.*;
import java.awt.event.*;

public class SwingTextArea implements ActionListener {      //implemented interface ActionListener for action event occurence
    JLabel l1, l2;
    JTextArea area;
    JButton b;

    SwingTextArea() {                                     //constructor calls auto matically when obj is created
        JFrame f = new JFrame();
        l1 = new JLabel();
        l2 = new JLabel();
        area = new JTextArea();
        b = new JButton("Count Words");             // button added with name

        l1.setBounds(50, 25, 100, 30);
        l2.setBounds(160, 25, 100, 30);
        area.setBounds(20, 75, 250, 200);
        b.setBounds(80, 300, 120, 30);
        b.addActionListener(this);                       // this programs action event is called with ActionListener method
        f.add(l1);
        f.add(l2);
        f.add(area);
        f.add(b);
        f.setSize(450, 450);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {        // ActionEvent method
        String text = area.getText();                       //Took text of text area into string variable 
        String words[] = text.split("\\s");          //string array named word is created with space seperated 
        l1.setText("Words: " + words.length);               //array length is counted text length
        l2.setText("Characters: " + text.length());         //text length is counted wiht string length
    }

    public static void main(String[] args) {
        new SwingTextArea();                                //class object called
        }
}

