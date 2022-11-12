
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



class GUI
{
    JFrame frame;
    JButton ok;
    JTextField text;
    JLabel label;
    
    public void init()
    {
        frame = new JFrame();
        ok = new JButton("ok");
        text = new JTextField("                                  ");
        label = new JLabel("hallo");
        frame.add(ok);
        frame.add(text);
        frame.add(label);
        frame.setLayout(new FlowLayout());
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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
