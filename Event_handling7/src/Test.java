
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


class GUI implements WindowListener
{
    JFrame frame1,frame2;
    
    public void init()
    {
        frame1 = new JFrame("EXIT_ON_CLOSE");
        frame1.setVisible(true);
        frame1.setSize(500, 500);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame2 = new JFrame("DISPOSE_ON_CLOSE");
        frame2.setVisible(true);
        frame2.setSize(500, 500);
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.addWindowListener(this);
        frame2.addWindowListener(this);
    }
    
    public GUI()
    {
        init();
    }


    public void windowOpened(WindowEvent e) {
        if(e.getSource()== frame1)
           JOptionPane.showMessageDialog(frame1,"Welcome");
   }


    public void windowClosing(WindowEvent e) {
        if(e.getSource() == frame1)
            JOptionPane.showMessageDialog(frame1,"Good Bye");
   }


    public void windowClosed(WindowEvent e) {
        
   }


    public void windowIconified(WindowEvent e) {
        if(e.getSource() == frame1)
            System.out.println("Window has been iconified");
   }


    public void windowDeiconified(WindowEvent e) {
        if(e.getSource() == frame1)
            System.out.println("Window has been De-iconified");
   }


    public void windowActivated(WindowEvent e) {
        if(e.getSource() == frame1)
            System.out.println("Window has been activated");
   }


    public void windowDeactivated(WindowEvent e) {
        if(e.getSource() == frame1)
            System.out.println("Window has been De-activated");
   }
}
public class Test {

    public static void main(String[] args) {
        new GUI();
    }
    
}
