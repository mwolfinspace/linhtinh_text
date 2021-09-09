package loginform;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login From Demo");
        JPanel panel = new JPanel(new GridLayout(3, 2, 15, 15));
        // Calling method
        addComponentsToPanel(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(300, 150);
        frame.getContentPane().add(panel);
        frame.setVisible(true);

    }

    public static void addComponentsToPanel(JPanel panel) {
        JLabel userLabel = new JLabel("User");
        JTextField userText = new JTextField();
        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordText = new JPasswordField();

        // Button
        JButton cancelButton = new JButton("Cancel");
        JButton loginButton = new JButton("Login");

        // Adding components to panel
        panel.add(userLabel);
        panel.add(userText);
        panel.add(passwordLabel);
        panel.add(passwordText);
        panel.add(cancelButton);
        panel.add(loginButton);

        // Adding action to buttons
        loginButton.addActionListener((ActionListener) new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (checkData(userText.getText(), passwordText.getPassword())) {
                    JOptionPane.showMessageDialog(panel, "Hello " + userText.getText() + "! Welcome to Java Swing!",
                            "Login Message", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(panel, "Invalid username or password", "Login Message",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static boolean checkData(String userName, char[] cs) {
        String password = new String(cs);
        if (userName.equals("java") && password.equals("123")) {
            return true;
        }
        return false;
    }
}
