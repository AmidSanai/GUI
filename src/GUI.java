import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI implements ActionListener {
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
    public static void main(String[] args) {
        JPanel panel = new JPanel();
        //frame
        JFrame frame = new JFrame();
        frame.setSize(300, 175);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        panel.setLayout(null);
        //user label
        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);
        //user text
        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);
        //password label
        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);
        //password text
        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);
        //button
        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);
        //success message
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        //here makes frame visible
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String user = userText.getText();
        String password = passwordText.getText();
        if (user.equalsIgnoreCase("amid") && password.equalsIgnoreCase("123456")) {
            success.setText("Login successful!");
        }
    }
}
