import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingDemo extends JFrame implements ActionListener {
    private JLabel nameLabel;
    private JTextField textField;
    private JTextArea textArea;
    private JButton startButton;
    private JButton resetButton,exitButton;
    private JTextField ageField;
    private JLabel statusLabel;
    public SwingDemo(){
        setTitle("Simple GUI Swing app");
        setSize(600,500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nameLabel = new JLabel("Enter your name!");
        textField = new JTextField(30);
        textArea = new JTextArea(10,40);
        ageField = new JTextField(5);
        startButton = new JButton("Start");
        startButton.addActionListener(this);
        resetButton = new JButton("Reset");
        resetButton.addActionListener(this);
        exitButton = new JButton("Exit");
        exitButton.addActionListener(this);
        statusLabel = new JLabel("Redy");

        //Top Panel
        JPanel topPanel = new JPanel( new FlowLayout());
        topPanel.add(nameLabel);
        topPanel.add(textField);
        topPanel.add(new JLabel("Age: "));
        topPanel.add(ageField);
        add(topPanel,BorderLayout.NORTH);
        //Center Panel
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane,BorderLayout.CENTER);
        //Button Panel
        JPanel buttonPanel = new JPanel( new FlowLayout());
        buttonPanel.add(startButton);
        buttonPanel.add(resetButton);
        buttonPanel.add(exitButton);

        JPanel bottomPanel = new JPanel();
        bottomPanel.add(statusLabel);
        buttonPanel.add(bottomPanel);
        add(buttonPanel,BorderLayout.SOUTH);

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startButton){
            String name = textField.getText().trim();
            String ageString = ageField.getText();
            textArea.setText("");

            if (name.length()<2){
                textArea.setText("Error: Name should contain more than 2 characters");
            }
            int age;
            try{
                age = Integer.parseInt(ageField.getText());
                if(age<2||age>120){
                    throw new NumberFormatException();
                }
                if(!name.trim().isEmpty()){
                    textArea.append("Hello" + name);
                    textArea.append("Age: " + age);
                }
            }catch (NumberFormatException ex){
                textArea.setText("Error: Age should be a number ");
            }


        }else if(e.getSource() == resetButton){
            textArea.setText("");
            textField.setText("");
            ageField.setText("");

        }else if(e.getSource() == exitButton){
            System.exit(0);
        }

    }
}
