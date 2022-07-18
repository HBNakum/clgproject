package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class SignupOne extends JFrame implements ActionListener
 {
	 JLabel  Formno,personalDetails,Name,FatherName,dob, gender,email,marital,address,city,state,country,pincode;
	 JTextField  namet,fathernamet,emailt,addresst,cityt,statet,countryt,pincodet;
	 JDateChooser dateChooser;
	 JRadioButton male,female,married,unmarried,other;
	 JButton  next;
	 long random;
	 
	 
	 Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    SignupOne()
	{
        setLayout(null);
        setTitle("New Account Application Form");
        
         Random ran = new Random();
          random = (Math.abs((ran.nextLong()%9000L) + 1000L));
       
          ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(20, 10,100,100);
        add(label1);
        
        Formno = new JLabel ("Application Form No." + random );
        Formno.setFont(new Font("Raleway", Font.BOLD, 38));
        Formno.setBounds(140, 20, 600,40);
        add(Formno);
        
        personalDetails = new JLabel ("Page 1: PersonalDetails");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290,60,600,30);
        add(personalDetails);
        
        Name = new JLabel ("Name");
        Name.setFont(new Font("Raleway", Font.BOLD, 20));
        Name.setBounds(100,120,100,30);
        add(Name);
        
        namet = new JTextField();
        namet.setFont(new Font("Raleway", Font.BOLD, 14));
        namet.setBounds(300,120,400,30);
        add(namet);
        
        FatherName = new JLabel ("Father's Name:");
        FatherName.setFont(new Font("Raleway", Font.BOLD, 20));
        FatherName.setBounds(100,170,200,30);
        add(FatherName);
        
        fathernamet = new JTextField();
        fathernamet.setFont(new Font("Raleway", Font.BOLD, 14));
        fathernamet.setBounds(300,170,400,30);
        add(fathernamet);
        
        dob = new JLabel ("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100,220,200,30);
        add(dob); 
        
        dateChooser = new JDateChooser();
        dateChooser.setFont(new Font("Raleway", Font.BOLD, 14));
        dateChooser.setBounds(300,220,400,30);
        add(dateChooser);
        
        gender = new JLabel ("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100,270,200,30);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300,270,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(450,270,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        other = new JRadioButton("Other");
        other.setBounds(600,270,180,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(other);
        
        email = new JLabel ("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100,320,200,30);
        add(email);
        
        emailt = new JTextField();
        emailt.setFont(new Font("Raleway", Font.BOLD, 14));
        emailt.setBounds(300,320,400,30);
        add(emailt);
        
        marital = new JLabel ("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100,370,200,30);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300,370,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450,370,120,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        
        address = new JLabel ("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100,420,200,30);
        add(address);
        
        addresst = new JTextField();
        addresst.setFont(new Font("Raleway", Font.BOLD, 14));
        addresst.setBounds(300,420,400,30);
        add(addresst);
        
        city = new JLabel ("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100,470,200,30);
        add(city);
        
        cityt = new JTextField();
        cityt.setFont(new Font("Raleway", Font.BOLD, 14));
        cityt.setBounds(300,470,400,30);
        add(cityt);
        
        state = new JLabel ("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100,520,200,30);
        add(state);
        
        statet = new JTextField();
        statet.setFont(new Font("Raleway", Font.BOLD, 14));
        statet.setBounds(300,520,400,30);
        add(statet);
        
        
        country = new JLabel ("country:");
        country.setFont(new Font("Raleway", Font.BOLD, 20));
        country.setBounds(100,570,200,30);
        add(country);
        
        countryt = new JTextField();
        countryt.setFont(new Font("Raleway", Font.BOLD, 14));
        countryt.setBounds(300,570,400,30);
        add(countryt);
        
        pincode = new JLabel ("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100,620,200,30);
        add(pincode);
        
        pincodet = new JTextField();
        pincodet.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodet.setBounds(300,620,400,30);
        add(pincodet);
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,650,80,30);
        next.addActionListener(this);
        add(next);
        
       getContentPane().setBackground(Color.WHITE);
      
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        String formno = "" + random;
        String name = namet.getText();
        String fname = fathernamet.getText();
        String dob = ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }
        else if (female.isSelected()){
            gender = "Female";
        }
        else if(other.isSelected()){
            gender = "Other";
        }
        String email = emailt.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "married";
        }
        else if(unmarried.isSelected()){
            marital = "Unmarried";
        }
        else if(other.isSelected()){
            marital = "Other";
        }
        String address = addresst.getText();
        String city = cityt.getText();
        String state = statet.getText();
        String pincode = pincodet.getText();
        
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }
            else{
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);  
                
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        new SignupOne();
    }
    
}
