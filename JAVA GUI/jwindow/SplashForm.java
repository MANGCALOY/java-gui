package jwindow;

import javax.swing.*;
import java.awt.*;

public class SplashForm extends JWindow{

    public SplashForm(){

        JLabel label = new JLabel(new ImageIcon("groot.jpg"));
        getContentPane().add(label, BorderLayout.CENTER);
        ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("groot.jpg").getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT));
        label.setIcon(imageIcon1);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        dispose();
    }
    public static void main(String[] args) {
        new SplashForm();
        new LogInForm();
    }
    
}
