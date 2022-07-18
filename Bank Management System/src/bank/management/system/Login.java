package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JLabel JLabel1,JLabel2,JLabel3;
    JTextField JTextField1;
    JPasswordField pf2;
    JButton login,clear,signup;
    Login()
    {
      setTitle("Autoatic Taller Machine");
      
      setLayout(null);
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
      Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2);
      JLabel label = new JLabel(i3);
      label.setBounds(70, 10,100,100);
      add(label);
      
      JLabel1 = new JLabel("WELCOME TO ATM");
      JLabel1.setFont(new Font("Osward", Font.BOLD, 38));
      JLabel1.setBounds(200, 40, 450,40);
      add(JLabel1);
      
      JLabel2 = new JLabel("Card No:");
      JLabel2.setFont(new Font("Raleway", Font.BOLD, 28));
      JLabel2.setBounds(120,150,375,30);
      add(JLabel2);
      
      JTextField1 = new JTextField(15);
      JTextField1.setBounds(300, 150, 230, 30);
      JTextField1.setFont(new Font("Arial", Font.BOLD,14));
      add(JTextField1);
      
      JLabel3 = new JLabel("PIN:");
      JLabel3.setFont(new Font("Raleway", Font.BOLD, 28));
      JLabel3.setBounds(120, 220, 250, 30);
      add(JLabel3);
      
      
      pf2 = new JPasswordField(15);
      pf2.setBounds(300, 220, 230, 30);
      pf2.setFont(new Font("Arial", Font.BOLD,14));
      add(pf2);
      
      login = new JButton("SIGN IN");
      login.setBackground(Color.BLACK);
      login.setForeground(Color.WHITE);
      
      clear = new JButton("CLEAR");
      clear.setBackground(Color.BLACK);
      clear.setForeground(Color.WHITE);
      
      signup = new JButton("SIGN UP");
      signup.setBackground(Color.BLACK);
      signup.setForeground(Color.WHITE);
      
      setLayout(null);
      
      login.setFont(new Font("Arial", Font.BOLD,14));
      login.setBounds(300, 300, 100, 30);
      add(login);
      
      clear.setFont(new Font("Arial", Font.BOLD,14));
      clear.setBounds(430, 300, 100, 30);
      add(clear);
      
      signup.setFont(new Font("Arial", Font.BOLD,14));
      signup.setBounds(300, 350, 230, 30);
      add(signup);
        
      
      login.addActionListener(this);
      clear.addActionListener(this);
      signup.addActionListener(this);
//      clear.addKeyListener(this);
      getContentPane().setBackground(Color.WHITE);
      
        setSize(800,480);   
        setVisible(true);
        setLocation(200,100);
    }
    
//    public void keyEvents(KeyEvent ke){
//    clear.addKeyListener((KeyListener) this);
//    }
    
    public void actionPerformed(ActionEvent ae)
    {
        
            
            if(ae.getSource()==login)
            {
                
            }
            else if(ae.getSource()==clear){
                JTextField1.setText("");
                pf2.setText("");
            }
            else if(ae.getSource()==signup){
                setVisible(false);
                new SignupOne().setVisible(true);
                
            }
        
        
        
    }
    public static void main(String args[])
    {
        new Login().setVisible(true);
    }
    
}
