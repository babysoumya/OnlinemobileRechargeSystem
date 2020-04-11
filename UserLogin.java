
import javax.swing.*;
import java.awt.event.*;

public class UserLogin {
    private JPanel UserLogin;
    private JTextField usertext;
    private JTextField loginTextField;
    private JButton forgotPasswordButton;
    private JButton signupButton;
    private JCheckBox showPasswordCheckBox;
    private JButton backButton;
    private JButton loginbutton;
    private JPasswordField passwordField;
    private JTextField passwordtext;
    private JFrame LoginFrame;
    public String password = "baby";

    public UserLogin() {
        LoginFrame = new JFrame("Login");
        LoginFrame.setContentPane(UserLogin);
        LoginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LoginFrame.pack();
        LoginFrame.setVisible(true);

        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un = usertext.getText();
                String pswd = passwordField.getText();
                if (un.contains("venu") && pswd.contains(password)) {
                    LoginFrame.dispose();
                    user u = new user();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Invalid Login");
                    usertext.setText(null);
                    passwordField.setText(null);
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginFrame.dispose();
                Welcome W = new Welcome();
            }
        });

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginFrame.dispose();
                SignUp S = new SignUp();
            }
        });

        showPasswordCheckBox.setSelected(false);
        passwordField.setEchoChar('*');
        showPasswordCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(showPasswordCheckBox.isSelected()){
                    passwordField.setEchoChar((char)0);
                }
                else{
                    passwordField.setEchoChar('*');
                }
            }
        });

        forgotPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                LoginFrame.dispose();
                FPassword F = new FPassword();
            }
        });

    }

}
