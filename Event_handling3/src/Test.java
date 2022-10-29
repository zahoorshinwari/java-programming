
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;





class GUI implements ActionListener
{
    JFrame frame;
    JButton ok;
    JButton exit;
    public void init()
    {
        frame = new JFrame();
        ok = new JButton("ok");
        exit = new JButton("exit");
        frame.setLayout(new FlowLayout());
        frame.add(ok);
        frame.add(exit);
        frame.setVisible(true);
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ok.addActionListener(this);
        exit.addActionListener(this);
        
        
    }
    
    public GUI()
    {
        init();
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == ok)
        
        JOptionPane.showMessageDialog(frame , "you have click ok button");
        
        if(ae.getSource() == exit)
        {
            JOptionPane.showMessageDialog(frame , "you have click exit button");
        
       int choice = JOptionPane.showConfirmDialog(frame , "Do you really want to exit?" , "Exit Application" , JOptionPane.YES_NO_OPTION);
       if(choice == 0)
           System.exit(0);
        }
    }
}
public class Test {

    public static void main(String[] args) {
        
        new GUI();
        
    }
    
}
