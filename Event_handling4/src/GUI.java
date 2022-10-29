import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUI implements ActionListener 
{
    
    JFrame frame;
    JLabel first , second , third;
    JTextField firstnumber , secondnumber , result;
    JButton plus , mul ;
    int firstoperand , secondoperand , answer;
    String val;
    
    public void init()
    {
        frame = new JFrame();
        first = new JLabel("first number");
        second = new JLabel("second number");
        third = new JLabel ("result");
        firstnumber = new JTextField(10);
        secondnumber = new JTextField(10);
        result = new JTextField(10);
        
        plus = new JButton("+");
        mul = new JButton("x");
        
        frame.setLayout(new FlowLayout());
        
        frame.add(first);
        frame.add(firstnumber);
        frame.add(second);
        frame.add(secondnumber);
        System.out.println();
        frame.add(plus);
        frame.add(mul);
        frame.add(third);
        frame.add(result);
        frame.setSize(120,220);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        plus.addActionListener(this);
        mul.addActionListener(this);
    }
    public GUI()
    {
        init();
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        val = firstnumber.getText();
        firstoperand = Integer.parseInt(val);
        val = secondnumber.getText();
        secondoperand = Integer.parseInt(val);
        if (ae.getSource() == plus)
        {
            answer = firstoperand + secondoperand;
        }
        if (ae.getSource()== mul)
        {
            answer = firstoperand * secondoperand;
        }
        result.setText(answer + " ");
    }
}