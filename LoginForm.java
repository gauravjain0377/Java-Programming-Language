import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame implements ActionListener {

    JLabel userLabel, passLabel;
    JTextField userText;
    JPasswordField passText;
    JButton loginButton;

    public LoginForm() {
        setTitle("Login Form");
        setSize(350, 200);
              setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
      

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 30, 80, 25);
        add(userLabel);

        userText = new JTextField();
        userText.setBounds(150, 30, 150, 25);
        add(userText);

        
        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 70, 80, 25);
        add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(150, 70, 150, 25);
        add(passText);

        
        loginButton = new JButton("Login");
        loginButton.setBounds(120, 110, 100, 30);
        loginButton.addActionListener(this); 
        add(loginButton);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = new String(passText.getPassword());

        
        if (username.equals("admin") && password.equals("1234")) {
            JOptionPane.showMessageDialog(this, "Login Successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Username or Password.");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
