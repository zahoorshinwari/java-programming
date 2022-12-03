import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;


class GUI implements MouseListener
{
    JFrame frame;
    JButton click , press , release , entered , exit;
    
    public void init()
    {
        frame = new JFrame("mouse listener");
        click = new JButton("click");
        press = new JButton("press");
        release = new JButton("release");
        entered = new JButton("entered");
        exit = new JButton("exit");
        frame.setLayout(new FlowLayout());
        frame.add(click);
        frame.add(press);
        frame.add(release);
        frame.add(entered);
        frame.add(exit);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        click.addMouseListener(this);
        press.addMouseListener(this);
        release.addMouseListener(this);
        entered.addMouseListener(this);
        exit.addMouseListener(this);
        
    }

       
    public GUI()
            {
               init(); 
            }
    
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == click)
            JOptionPane.showMessageDialog(null, "you have clicked the button");
    }

    
    public void mousePressed(MouseEvent e) {
        if(e.getSource() == press)
            System.out.println("you have press on the button");
    }

    
    public void mouseReleased(MouseEvent e) {
        if(e.getSource() == release)
            System.out.println("you have release the button");
    }

    
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == entered)
            JOptionPane.showMessageDialog(null, "you have entered into the dimention of the button");
    }

    
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == exit)
            System.out.println("you have exited from the dimention of the button");
        System.exit(0);
    }
}
public class Test {


    public static void main(String[] args) {
            new GUI();
    }
    
}
