import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI implements ActionListener
{
    JFrame frame;
    JButton ok;
    public void init()
    {
        frame = new JFrame("event handling");
        ok = new JButton("ok");
       
        frame.add(ok);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         ok.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == ok)
        JOptionPane.showMessageDialog(frame , "you have click ok button");
    }
    public GUI()
    {
        init();
    }
    
}
public class Test {

  
    public static void main(String[] args) {
        new GUI();
    }
    
}
