
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLogin {
    private JButton Login;
    private JPanel UserLogin;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField loginTextField;
    private JButton forgotPasswordButton;
    private JButton signupButton;
    private JCheckBox showPasswordCheckBox;
    private JButton backButton;
    private JFrame LoginFrame;

    public UserLogin() {
        LoginFrame = new JFrame("Login");
        LoginFrame.setContentPane(UserLogin);
        LoginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        LoginFrame.pack();
        LoginFrame.setVisible(true);
        Login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null,"Hello World");
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Welcome W = new Welcome();
                LoginFrame.dispose();
            }
        });
    }

}
