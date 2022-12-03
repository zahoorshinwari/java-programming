import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

class GUI implements MouseListener
{
    JFrame frame;
    JTextField text;
    
    public void init()
    {
        frame = new JFrame("change text color");
        text = new JTextField("my name is zahoor",20);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(text);
        text.addMouseListener(this);
    }
    public GUI()
            {
                init();
            }

    
    public void mouseClicked(MouseEvent e) {
       }

   
    public void mousePressed(MouseEvent e) {
       }

    
    public void mouseReleased(MouseEvent e) {
    }

   
    public void mouseEntered(MouseEvent e) {
        text.setBackground(Color.yellow);
        text.setForeground(Color.green);
    }

    
    public void mouseExited(MouseEvent e) {
        text.setBackground(Color.blue);
        text.setForeground(Color.black);
    }
    
}
public class Test {

    public static void main(String[] args) {
        new GUI();
    }
    
}
