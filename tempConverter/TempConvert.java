import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConvert extends JFrame {
    private Container pane;
    private JButton b1, b2;
    private JLabel l;
    private JTextField t;

    private 

    public TempConvert() {
	this.setTitle("Temperature Converter");
	this.setSize(300,300);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	pane = this.getContentPane();
	pane.setLayout(new FlowLayout());
	
	b1 = new JButton("FtoC");
	b2 = new JButton("CtoF");
	l = new JLabel("Result",null,JLabel.CENTER);
	t = new JTextField(5);

	pane.add(t);
	pane.add(b1);
	pane.add(b2);
	pane.add(l);;
    }

    private class CalculateButtonHandler implements ActionListener {
	b1.addActionListener(this);
	b2.addActionListener(this);
	public void actionPerformed(ActionEvent e) {
	    double temp = Double.parseDouble(t.getText());
	}
	    

    public static double FtoC(double temp) {
	return (temp-32)*5/9;
    }

    public static double CtoF(double temp) {
	return 9/5 * temp + 32;
    }
    
    public static void main(String[] args) {
	TempConvert tc = new TempConvert();
	tc.setVisible(true);
    }
}
