package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JTextField userText, passwordText;
    Choice loginChoice;
    JButton loginButton, cancelButton, signUpButton;

    Login(){
        super("Login");
        getContentPane().setBackground(Color.GREEN);
        JLabel username = new JLabel("USERNAME");
        username.setBounds(300,60,100,20);
        add(username);
        userText = new JTextField();
        userText.setBounds(400,60,150,20);
        add(userText);

        JLabel password = new JLabel("PASSWORD");
        password.setBounds(300,100,100,20);
        add(password);
        passwordText = new JTextField();
        passwordText.setBounds(400, 100,150,20);
        add(passwordText);

        JLabel loggin = new JLabel("Log in As");
        loggin.setBounds(300,140,100,20);
        add(loggin);
        loginChoice = new Choice();
        loginChoice.add("Admin");
        loginChoice.add("Customer");
        loginChoice.setBounds(400, 140, 150 , 20);
        add(loginChoice);

        loginButton = new JButton("Login");
        loginButton.setBounds(330,180,100,20);
        add(loginButton);

        cancelButton= new JButton("Cancel");
        cancelButton.setBounds(460,180,100,20);
        add(cancelButton);

        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(400, 215,100,20);
        add(signUpButton);

        ImageIcon profileOne = new ImageIcon(ClassLoader.getSystemResource("icon/profile.png"));
        Image profileTwo = profileOne.getImage().getScaledInstance(250, 250 , Image.SCALE_DEFAULT);
        ImageIcon fprofileOne = new ImageIcon(profileTwo);
        JLabel profileLabel = new JLabel(fprofileOne);
        profileLabel.setBounds(5,5,250,250);
        add(profileLabel);


        setSize(640,300);
        setLocation(400,200);
        setLayout(null);

        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}

