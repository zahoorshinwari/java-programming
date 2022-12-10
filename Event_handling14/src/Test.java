
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


class GUI 
{
    JFrame frame;
    JButton ok , exit;
    
    public void init()
    {
        frame = new JFrame("using multiple interfaces");
        ok = new JButton("ok");
        exit = new JButton("exit");
        frame.setLayout(new FlowLayout());
        frame.add(ok);
        frame.add(exit);
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
        frame.addWindowListener(new WindowHandler());
         ok.addActionListener(new ActionHandler());
        exit.addMouseListener(new MouseHandler());
    }
    
    private class ActionHandler implements ActionListener
    {
       
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame , "you have clicked ok button");

        }
    }
    
    private class WindowHandler extends WindowAdapter
    {
     public void windowOpened(WindowEvent e) {
        if(e.getSource() == frame)
            JOptionPane.showMessageDialog(frame, "welcome");
    }

    
    public void windowClosing(WindowEvent e) {
        if(e.getSource() == frame)
            JOptionPane.showMessageDialog(frame, "Good bye");
    }
    }
    
    
    private class MouseHandler extends MouseAdapter
    {
        public void mouseClicked(MouseEvent e) 
        {   
            System.exit(0);
        }
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
