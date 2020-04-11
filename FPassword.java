import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FPassword {
    private JTextField usertext;
    private JButton confirmButton;
    private JPanel FpasswordPanel;
    private JFrame FpasswordFrame;

    public FPassword() {
        FpasswordFrame = new JFrame("FPassword" );
        FpasswordFrame.setContentPane(FpasswordPanel);
        FpasswordFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FpasswordFrame.pack();
        FpasswordFrame.setVisible(true);

        confirmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String un = usertext.getText();
                if(un.contains("venu")){
                    FpasswordFrame.dispose();
                    OTP O = new OTP();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Username");
                    usertext.setText(null);
                }
            }
        });
    }
}
