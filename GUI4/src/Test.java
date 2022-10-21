import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;
class Calculator_GUI
{
    JFrame frame;
    JTextField text;
    JLabel label;
    JPanel panel;
    
    JButton button0, button1, button2,button3,button4, button5,button6,button7, button8,button9,buttonplus, buttonminus,buttonmul,buttondivide,buttonequal,buttoncancel;
    
    public void init()
{
    frame = new JFrame("calculator");
    text = new JTextField(10);
    label = new JLabel("my calculator");
    panel = new JPanel();
    
    
    button0 = new JButton("0");
    button1 = new JButton("1");
button2 = new JButton("2");
button3 = new JButton("3");
button4 = new JButton("4");
button5 = new JButton("5");
button6 = new JButton("6");
button7 = new JButton("7");
button8 = new JButton("8");
button9 = new JButton("9");
buttonplus = new JButton("+");
buttonminus = new JButton("-");
buttonmul = new JButton("*");
buttondivide = new JButton("/");
buttonequal = new JButton("=");
buttoncancel = new JButton("c");

panel.setLayout(new GridLayout(4,4));

panel.add(button1);
panel.add(button2);
panel.add(button3);
panel.add(buttonplus);
panel.add(button4);
panel.add(button5);
panel.add(button6);
panel.add(buttonminus);
panel.add(button7);
panel.add(button8);
panel.add(button9);
panel.add(buttonmul);
panel.add(buttoncancel);
panel.add(button0);
panel.add(buttondivide);
panel.add(buttonequal);


frame.add(text,BorderLayout.NORTH);
frame.add(panel,BorderLayout.CENTER);
frame.add(label,BorderLayout.SOUTH);

frame.setVisible(true);
frame.setSize(300,400);
frame.setResizable(false);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public Calculator_GUI()
{
init();
}
}

public class Test {

    public static void main(String[] args) {
       new Calculator_GUI();
    }
    
}
