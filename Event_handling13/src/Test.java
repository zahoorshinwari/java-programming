
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JTextField;


class GUI extends MouseAdapter
{
    JFrame frame;
    JTextField text;
    public void init()
    {
        frame = new JFrame("Mouse Adapter");
        text = new JTextField("my name is zahoor" , 15);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(text);
        text.addMouseListener(this);
        
    }

   

    public void mouseEntered(MouseEvent e) {
        text.setBackground(Color.red);
        text.setForeground(Color.black);
    }

    public void mouseExited(MouseEvent e) {
        text.setBackground(Color.yellow);
        text.setForeground(Color.black);
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
