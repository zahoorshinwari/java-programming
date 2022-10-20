
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;


class GUI
{
    JFrame frame;
    JButton north, south, east, west, center;
    public void init()
    {
        frame = new JFrame("border layout example");
        north = new JButton("north");
        south = new JButton("south");
        east = new JButton("east");
        west = new JButton("west");
        center = new JButton("center");
        // 5 is space between the button in the border in row wise
        // 50 is space between the button in the colomn wise
        // we can increase and decrease the size and by default there will be no space between them
        frame.setLayout(new BorderLayout(5,50));
        frame.add(north,BorderLayout.NORTH);
        frame.add(south,BorderLayout.SOUTH);
        frame.add(east,BorderLayout.EAST);
        frame.add(west,BorderLayout.WEST);
        frame.add(center,BorderLayout.CENTER);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        
    }
    public GUI()
    {
        init();
    }
}
public class test {

    
    public static void main(String[] args) {
       
        new GUI();
    }
    
}
