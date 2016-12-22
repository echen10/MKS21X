import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConvert extends JFrame implements ActionListener {
    private Container pane;
    private JButton b1, b2;
    private JLabel l;
    private JTextField t;

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

	b1.addActionListener(this);
	b1.setActionCommand("toCelsius");
	b2.addActionListener(this);
	b2.setActionCommand("toFahrenheit");
	
	pane.add(t);
	pane.add(b1);
	pane.add(b2);
	pane.add(l);;
    }

    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	double temp = Double.parseDouble(t.getText());
	String newTemp;
	if ( event.equals("toCelsius") ) {
	    newTemp = FtoC(temp) + "";
	    l.setText(newTemp);
	}
	else {
	    newTemp = CtoF(temp) + "";
	    l.setText(newTemp);
	}
    }

    public static double FtoC(double temp) {
	return (temp-32)*5/9.0;
    }

    public static double CtoF(double temp) {
	return 9/5.0 * temp + 32;
    }

    public static void main(String[] args) {
	TempConvert tc = new TempConvert();
	tc.setVisible(true);
    }
}
