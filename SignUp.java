import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp {
    private JTextField nametextfield;
    private JTextField mobiletextfield;
    private JTextField emailtextfield;
    private JTextField usernametextfield;
    private JPasswordField ConfirmPassword;
    private JPasswordField Password;
    private JCheckBox showPasswordCheckBox;
    private JCheckBox showCPasswordCheckBox1;
    private JButton confirmButton;
    private JPanel Registration;
    private JButton backButton;
    private JFrame signUpFrame;



    public SignUp() {
        signUpFrame = new JFrame("SignUp");
        signUpFrame.setContentPane(Registration);
        signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signUpFrame.pack();
        signUpFrame.setVisible(true);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
