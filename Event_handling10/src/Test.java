import javax.swing.JFrame;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

class GUI implements MouseMotionListener
{
    JFrame frame;
    public void init()
    {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addMouseMotionListener(this);
    }
    public GUI()
    {
        init();
    }

    public void mouseDragged(MouseEvent arg0) {
           System.out.println("Mouse pointer was dragged on the frame");
    }

    public void mouseMoved(MouseEvent arg0) {
        System.out.println("Mouse pointer was moved on the frame");
    }
    
}

public class Test {

    public static void main(String[] args) {
            new GUI();
    }
    
}
