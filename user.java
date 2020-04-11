import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class user {
    private JButton newRechargeButton;
    private JButton viewProfileButton;
    private JButton updateProfileButton;
    private JButton viewNotificationsButton;
    private JButton viewBillsButton;
    private JButton logoutButton;
    private JPanel userPanel;
    private JFrame userFrame;

    public user() {
        userFrame= new JFrame("user");
        userFrame.setContentPane(userPanel);
        userFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        userFrame.pack();
        userFrame.setVisible(true);
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Are you sure to logout?");
                userFrame.dispose();
                JOptionPane.showMessageDialog(null, "You are successfully logged out!!");
                Welcome W = new Welcome();
            }
        });
    }
}
