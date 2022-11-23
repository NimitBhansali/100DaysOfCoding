import java.awt.event.*;
import javax.swing.*;
class SwingTemperature extends JFrame implements ActionListener
{
	JFrame f;
	JButton ButtonConvert;
	JTextField txtfld1,txtfld2;
	JLabel label1,label2;
	SwingTemperature()
	{
		f = new JFrame("Temperature");
		ButtonConvert = new JButton("Convert");
		label1 = new JLabel("Enter Value: ");
		label1.setBounds(20,50,150,40);
		txtfld1 = new JTextField();
		txtfld1.setBounds(100,50,150,30);
		label2 = new JLabel("Value in F");
		label2.setBounds(20,100,150,30);
		txtfld2 = new JTextField();
		txtfld2.setBounds(100,100,150,30);
		txtfld2.setEditable(false);
		ButtonConvert.setBounds(30,150,95,40);
		ButtonConvert.addActionListener(this);
		f.add(ButtonConvert);
		f.add(txtfld1);
		f.add(txtfld2);
		f.add(label1);
		f.add(label2);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		double Celcius = Double.parseDouble(txtfld1.getText());  //takes value in double datatype
		if(e.getSource()==ButtonConvert) 						 //event source activates == button clicked
		{
			double cel = (Celcius*1.8)+32;							//formula for celcius to farenheit
			String Fahren = String.valueOf(cel);					//converted value of double to string
			txtfld2.setText(Fahren);							//set text(farenheit) to field 2 
		}
	}
	public static void main(String args[])
	{
		new SwingTemperature();
	}
}