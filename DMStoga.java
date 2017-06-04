package chat;

import javax.swing.*;
import java.awt.*;

/**
 * Created by erudi on 6/1/2017.
 */
public class DMStoga {
    private JPanel textClient;
    private JTextPane clientText;
    private JTextField userEntry;
    private JButton logIn;
    private JTextField IPAddressTextField;
    private JPasswordField password;
    private JTextField Username;
    private JProgressBar progressBar1;
    private JEditorPane loginEditorPane;
    private JTextField recipientTextField;

    public static void main(String[] args) {
        JFrame frame = new JFrame("DMStoga");
        frame.setContentPane(new DMStoga().textClient);
        frame.setPreferredSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
