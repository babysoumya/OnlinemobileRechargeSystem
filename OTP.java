import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OTP {
    private JTextField OTPText;
    private JButton confirmButton;
    private JButton resendOTPButton;
    private JPanel OTPPanel;
    private JButton backButton;
    private JFrame OTPFrame;

    public OTP() {
        OTPFrame= new JFrame("OTP");
        OTPFrame.setContentPane(OTPPanel);
        OTPFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        OTPFrame.pack();
        OTPFrame.setVisible(true);
        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String otp = OTPText.getText();
                if(otp.contains("2189")){
                    OTPFrame.dispose();
                    NPassword N = new NPassword();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid OTP");
                    OTPText.setText(null);
                }
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OTPFrame.dispose();
                FPassword F = new FPassword();
            }
        });

        resendOTPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                OTPText.setText(null);
            }
        });
    }
}
