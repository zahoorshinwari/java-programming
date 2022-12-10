
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


class GUI extends WindowAdapter
{
    JFrame frame;
    public void init()
    {
      frame = new JFrame("window Adapter");
      frame.setVisible(true);
      frame.setSize(400,400);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.addWindowListener(this);
    }

    public void windowOpened(WindowEvent e) {
        if(e.getSource() == frame)
            JOptionPane.showMessageDialog(frame, "welcome");
    }

    public void windowClosing(WindowEvent e) {
        if(e.getSource() == frame)
            JOptionPane.showMessageDialog(frame , "good bye");
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
