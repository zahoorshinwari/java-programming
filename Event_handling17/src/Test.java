
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



class GUI 
{
    JFrame frame;
    JButton ok , cancel;
    
    public void init()
    {
        frame = new JFrame("using ananymous classes");
        ok = new JButton("ok");
        cancel = new JButton("cancel");
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(ok);
        frame.add(cancel);
        
        ok.addActionListener(new ActionListener()
        {   
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == ok)
                    JOptionPane.showMessageDialog( frame, "you have clicked ok button");
    } 
        });
        
        
        cancel.addActionListener(new ActionListener()
        {  
            public void actionPerformed(ActionEvent e){
                int choice = JOptionPane.showConfirmDialog(frame, "Do you really want to cancel?" , "Exit Application", JOptionPane.YES_NO_OPTION);
                   if (choice == 0)
                   System.exit(0);
        } 
        });
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
