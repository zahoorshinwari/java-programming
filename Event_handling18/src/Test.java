
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



class GUI
{
    JFrame frame1;
    public void init()
    {
        frame1 = new JFrame("ananymous inner classes");
        frame1.setVisible(true);
        frame1.setSize(400,400);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.addWindowListener(new WindowAdapter()
        {
            public void windowOpened(WindowEvent e)
            {
                JOptionPane.showMessageDialog(frame1, "welcome");
            }
        });
        
        frame1.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                JOptionPane.showMessageDialog(frame1, "Good bye");
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
