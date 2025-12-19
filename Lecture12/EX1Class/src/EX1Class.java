import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EX1Class implements ActionListener {
    private JButton button;
    private JButton button2;
    void main() {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setSize(300,300);
        button = new JButton("Click Me 1");
        button2 = new JButton("Click Me 2");


        button.addActionListener(this);
        button2.addActionListener(this);
        frame.add(button);
        frame.add(button2);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            System.out.println("Clicked from Button 1");

        }else if(e.getSource() == button2){
            System.out.println("Clicked from Button 2");

        }

    }
}
