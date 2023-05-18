package jwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LogInForm extends JFrame implements ActionListener {
    private JLabel labelHeader, labelFooter;
    private JLabel labelUsername, labelPassword;
    private JTextField fieldUsername;
    private JPasswordField fieldPassword;
    private JButton buttonLogin, buttonSignUp, exit;
    
    public LogInForm() {

        setSize(450, 600 );
        setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // title
        labelHeader = new JLabel("LOGIN!");
        labelHeader.setBounds(140,1, 175, 100);
        labelHeader.setFont(new Font("Serif", Font.BOLD, 40));
        labelHeader.setForeground(new Color(0, 102, 0));
        
        //username
        labelUsername = new JLabel("Username:");
        labelUsername.setFont(new Font("ARIAL", Font.PLAIN, 15));
        labelUsername.setBounds(20, 170, 300, 30);

        //fieludername
        fieldUsername = new JTextField(20); 
        fieldUsername.setBounds(95, 170, 300, 33);
        fieldUsername.setForeground(new Color(0, 102, 0));
        fieldUsername.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));

        //password
        labelPassword = new JLabel("Password:");
        labelPassword.setFont(new Font("ARIAL", Font.PLAIN, 15));
        labelPassword.setBounds(20, 220, 280, 30);
        
        //fieldpassword
        fieldPassword = new JPasswordField();
        fieldPassword.setBounds(95, 220, 300, 33);
        fieldPassword.setForeground(new Color(0, 102, 0));
        fieldPassword.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
        
        //button login & signup
        buttonLogin = new JButton("Login");
        buttonLogin.setBounds(130, 270, 200, 40);
        buttonLogin.setFont(new Font("ARIAL", Font.PLAIN, 14));
        buttonLogin.setForeground(Color.WHITE);
        buttonLogin.setBackground(new Color(0, 102, 0));
        buttonLogin.setBorder(BorderFactory.createEmptyBorder());
        buttonLogin.setBorder(null);


        buttonSignUp = new JButton("Sign up");
        buttonSignUp.setBounds(255, 320, 50, 30);
        buttonSignUp.setFont(new Font("Serif", Font.PLAIN, 15));
        buttonSignUp.setForeground(new Color(0, 102, 0));
        buttonSignUp.setBackground(new Color(238, 238, 238));
        buttonSignUp.setBorder(BorderFactory.createEmptyBorder());

        //footer
        labelFooter = new JLabel("Don't have a account?");
        labelFooter.setBounds(135, 320, 300, 30);
        labelFooter.setFont(new Font("Serif", Font.BOLD, 12));
        labelFooter.setBackground(new Color(102, 102, 102));
        labelFooter.setBorder(BorderFactory.createEmptyBorder());
       
        exit = new JButton("EXIT");
        exit.setBounds(200, 400, 40, 30);
        exit.setFont(new Font("ARIAL", Font.BOLD,15));
        exit.setForeground(new Color(0, 102, 0));
        exit.setBackground(new Color(2238, 238, 238));
        exit.setBorder(BorderFactory.createEmptyBorder());
        exit.setBorder(null);

        Container container = getContentPane();
        container.setBackground(new Color(238, 238, 238));
        container.setLayout(null);
        
        container.add(labelHeader);
        container.add(labelFooter);
        container.add(labelUsername);
        container.add(fieldUsername);
        container.add(labelPassword);
        container.add(fieldPassword);
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
            String password = new String(fieldPassword.getPassword());

            if(e.getSource().equals(exit)){
                dispose();

            }else if (e.getSource().equals(buttonSignUp)){
                new SignUpForm();
                dispose();
                
            }else if (username.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(null, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password.");
            }
        }
    
    
    public static void main(String[] args) {
        new LogInForm();
    }
}
