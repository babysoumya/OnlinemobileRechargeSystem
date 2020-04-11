import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class NPassword {
    private JPasswordField passwordField1;
    private JCheckBox showPasswordCheckBox;
    private JPasswordField passwordField2;
    private JButton confirmButton;
    private JPanel NPasswordPanel;
    private JFrame NPasswordFame;

    public NPassword() {
        NPasswordFame = new JFrame("NPasswprd");
        NPasswordFame.setContentPane(NPasswordPanel);
        NPasswordFame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        NPasswordFame.pack();
        NPasswordFame.setVisible(true);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String P1 = passwordField1.getText();
                String P2 = passwordField2.getText();
                if (P1.endsWith(P2)){
                    NPasswordFame.dispose();
                    UserLogin U = new UserLogin();
                    U.password = P1;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Passwords does not match");
                    passwordField1.setText(null);
                    passwordField2.setText(null);
                }
            }
        });

        showPasswordCheckBox.setSelected(false);
        passwordField1.setEchoChar('*');
        showPasswordCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(showPasswordCheckBox.isSelected()){
                    passwordField1.setEchoChar((char)0);
                }
                else{
                    passwordField1.setEchoChar('*');
                }
            }
        });

    }
}
