package jwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUpForm extends JFrame implements ActionListener {
    private JLabel labelHeader, labelFooter;
    private JLabel labelUsername, labelPassword, labelConfirmPassword, labelFullname, labelEmail;
    private JTextField fieldFullname;
    private JTextField fieldEmail;
    private JPasswordField fieldConfirmPassword;
    private JTextField fieldUsername;
    private JPasswordField fieldPassword;
    private JButton buttonLogin, buttonSignUp, exit;
    
    public SignUpForm() {

        setSize(500, 650 );

        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // title
        labelHeader = new JLabel("SIGN UP!");
        labelHeader.setBounds(145,0, 175, 100);
        labelHeader.setFont(new Font("Serif", Font.BOLD, 40));
        labelHeader.setForeground(new Color(0, 0, 204));

        // fullname
        labelFullname = new JLabel("Fullname:");
        labelFullname.setFont(new Font("ARIAL", Font.PLAIN, 15));
        labelFullname.setBounds(20, 120, 300, 30);

        // fieldfullname
        fieldFullname = new JTextField(20); 
        fieldFullname.setBounds(150, 120, 300, 33);
        fieldFullname.setForeground(new Color(0, 0, 204));
        fieldFullname.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));

        // email
        labelEmail = new JLabel("Email:");
        labelEmail.setFont(new Font("Serif", Font.PLAIN, 20));
        labelEmail.setBounds(20, 170, 300, 30);

        // fieldemail
        fieldEmail = new JTextField(20); 
        fieldEmail.setBounds(150, 170, 300, 33);
        fieldEmail.setForeground(new Color(0, 0, 204));
        fieldEmail.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
        
        // username
        labelUsername = new JLabel("Username:");
        labelUsername.setFont(new Font("ARIAL", Font.PLAIN, 15));
        labelUsername.setBounds(20, 220, 300, 30);

        // fielusername
        fieldUsername = new JTextField(20); 
        fieldUsername.setBounds(150, 220, 300, 33);
        fieldUsername.setForeground(new Color(0, 0, 204));
        fieldUsername.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));

        // password
        labelPassword = new JLabel("Password:");
        labelPassword.setFont(new Font("ARIAL", Font.PLAIN, 15));
        labelPassword.setBounds(20, 270, 280, 30);
        
        // fieldpassword
        fieldPassword = new JPasswordField();
        fieldPassword.setBounds(150, 270, 300, 33);
        fieldPassword.setForeground(new Color(0, 0, 204));
        fieldPassword.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));

        // confirmpassword
        labelConfirmPassword = new JLabel("Confirm Password:");
        labelConfirmPassword.setFont(new Font("ARIAL", Font.PLAIN, 15));
        labelConfirmPassword.setBounds(20, 320, 280, 30);

        // fieldconfirmpassword
        fieldConfirmPassword = new JPasswordField();
        fieldConfirmPassword.setBounds(150, 320, 300, 33);
        fieldConfirmPassword.setForeground(new Color(0, 0, 204));
        fieldConfirmPassword.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
        
        //button login & signup
        buttonSignUp = new JButton("SignUp");
        buttonSignUp.setBounds(200, 370, 200, 40);
        buttonSignUp.setFont(new Font("ARIAL", Font.PLAIN, 14));
        buttonSignUp.setForeground(Color.WHITE);
        buttonSignUp.setBackground(new Color(102, 102, 102));
        buttonSignUp.setBorder(BorderFactory.createEmptyBorder());
        buttonSignUp.setBorder(null);


        buttonLogin = new JButton("Login now");
        buttonLogin.setBounds(285, 420, 70, 30);
        buttonLogin.setFont(new Font("Serif", Font.PLAIN, 15));
        buttonLogin.setForeground(new Color(0, 102, 0));
        buttonLogin.setBackground(new Color(238, 238, 238));
        buttonLogin.setBorder(BorderFactory.createEmptyBorder());

        //footer
        labelFooter = new JLabel("Allready have an account?");
        labelFooter.setBounds(135, 420, 300, 30);
        labelFooter.setFont(new Font("Serif", Font.BOLD, 12));
        labelFooter.setBackground(new Color(102, 102, 102));
        labelFooter.setBorder(BorderFactory.createEmptyBorder());
       
        exit = new JButton("EXIT");
        exit.setBounds(220, 550, 40, 30);
        exit.setFont(new Font("ARIAL", Font.BOLD,15));
        exit.setForeground(new Color(0, 102, 0));
        exit.setBackground(new Color(255, 255, 255));
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setBorder(null);

        Container container = getContentPane();
        container.setBackground(new Color(238, 238, 238));
        container.setLayout(null);
        
        container.add(labelHeader);
        container.add(labelFooter);
        container.add(labelFullname);
        container.add(fieldFullname);
        container.add(labelEmail);
        container.add(fieldEmail);
        container.add(labelUsername);
        container.add(fieldUsername);
        container.add(labelPassword);
        container.add(fieldPassword);
        container.add(labelConfirmPassword);
        container.add(fieldConfirmPassword);
        container.add(buttonLogin);
        container.add(buttonSignUp);
        container.add(exit);
        
        buttonLogin.addActionListener(this);
        buttonSignUp.addActionListener(this);
        exit.addActionListener(this);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
            String username = fieldUsername.getText();
            String fullname = fieldFullname.getText();
            String email = fieldEmail.getText();
            String password = new String(fieldPassword.getPassword());
            String confirmPassword = new String(fieldConfirmPassword.getPassword());

            if(e.getSource().equals(exit)){
                dispose();

            }else if (e.getSource().equals(buttonLogin)){
                new LogInForm();
                dispose();
                
            }else if (username.equals("admin") && password.equals("password") &&  fullname.equals("John Carlo Samson Ramos") && email.equals("ramos.caloyjohn@gmail.com") && confirmPassword.equals("password")) {
                JOptionPane.showMessageDialog(null, "Sign Up successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid!");
            }
        }
    
    
    public static void main(String[] args) {
        new SignUpForm();
    }
}
