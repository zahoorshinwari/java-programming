import javax.swing.*;
import javax.swing.JFrame;
import java.awt.GridLayout;
class GUI
{
    JFrame frame;
    JButton one, two , three, four, five;
    
    public void init()
    {
        frame = new JFrame();
        one = new JButton("one"); two = new JButton("two");three = new JButton("three");four = new JButton("four"); five = new JButton("five");
        frame.add(one);frame.add(two);frame.add(three);frame.add(four);frame.add(five);
       frame.setLayout(new GridLayout(2,5,50,20));
       frame.setVisible(true);
       frame.setSize(400,400);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setResizable(false);
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
