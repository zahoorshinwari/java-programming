import javax.swing.*;
import javax.swing.JFrame;
import java.awt.GridLayout;
class GUI
{
    JFrame frame;
    JButton one, two , three, four, five , six;
    
    public void init()
    {
        frame = new JFrame();
        one = new JButton("one"); two = new JButton("two");three = new JButton("three");four = new JButton("four"); five = new JButton("five"); six = new JButton("six");
        frame.add(one);frame.add(two);frame.add(three);frame.add(four);frame.add(five);frame.add(six);
       frame.setLayout(new GridLayout(2,2,10,10));
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
