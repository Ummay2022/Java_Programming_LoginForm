import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;


public class Login extends JFrame{
    final private Font mainFont = new Font("Century Gothic", Font.BOLD, 10 ); 
    JLabel lbUserName, lbPassword;
    JTextField tfUserName;
    JPasswordField jpPassword;
    JButton btnLogin, btnClear;

    public void LoadForm(){
        lbUserName = new JLabel("User Name:");
        lbUserName.setFont(mainFont);

        lbPassword = new JLabel("Password:");
        lbPassword.setFont(mainFont);

        tfUserName = new JTextField();
        tfUserName.setFont(mainFont);

        jpPassword = new JPasswordField();
        jpPassword.setFont(mainFont);

        btnLogin = new JButton("Login");
        btnLogin.setFont(mainFont);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String userName = tfUserName.getText();
                String password = new String(jpPassword.getPassword());

                if(userName.equals("Admin") && password.equals("1234")){
                    JOptionPane.showMessageDialog(rootPane, "Login Sucessful");
                else {
                    JOptionPane.showMessageDialog(rootPane, "Login failed!");
                }
                }
                
            }
        });


        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(1, 4, 5, 5));

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 2, 5, 5));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));




        setTitle( "Login Form");
        setSize(500,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(200, 100));
        setVisible(true);

    }
    public static void main(String[] args) throws Exception {
        Login main = new Login();
        main.LoadForm();
    }
}
