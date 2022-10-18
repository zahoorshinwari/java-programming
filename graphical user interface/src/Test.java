/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 92333
 */
import java.awt.FlowLayout;
import javax.swing.*;




class GUI
{
    JFrame frame;
    JButton ok;
    JTextField text;
    JLabel label;

public void init()
{
frame = new JFrame("Gui example");
ok = new JButton("OK");
text = new JTextField("this is the first class of java graphical user interface");
label = new JLabel("hallo");



frame.setLayout(new FlowLayout());
frame.add(ok);
frame.add(label);
frame.add(text);
frame.setVisible(true);
frame.setSize(400,250);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



}

public GUI()
{
    init();
}
}
public class Test {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new GUI();
    }
    
}
