package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class SignupTwo extends JFrame implements ActionListener
 {
	 JLabel  Formno,additionalDetails,religion,category,Income, Education,Qualification,Occupation,PanNumber,AdharNumber,SeniorCitzen,ExistingAccount;
	 JTextField  PanNumbert,AdharNumbert;
	 JComboBox  cb_religion,cb_category,cb_Income,cb_Education,cb_Occupation ;
	 JRadioButton eYes,eNo,sYes,sNo;
	 JButton  next;
         String formno;
	 long random;
	 
	 
	 Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);

    SignupTwo(String formno){
        
        this.formno = formno;
	setLayout(null);
        setTitle("New Account Application Form - Page 2");
  
        additionalDetails = new JLabel ("Page 1: AdditionalDetails");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290,60,600,30);
        add(additionalDetails);
        
        religion = new JLabel ("Religion");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100,120,100,30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        cb_religion = new JComboBox(valReligion);
        cb_religion.setBounds(300,120,400,30);
        cb_religion.setBackground(Color.WHITE);
        add(cb_religion);
        
        category = new JLabel ("Category");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100,170,200,30);
        add(category);
        
        String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        cb_category = new JComboBox(valcategory);
        cb_category.setBounds(300,170,400,30);
        cb_category.setBackground(Color.WHITE);
        add(cb_category);
        
        Income = new JLabel ("Income");
        Income.setFont(new Font("Raleway", Font.BOLD, 20));
        Income.setBounds(100,220,200,30);
        add(Income); 
        
        String Incomeval[] = {"NULL", "<1,50,000", "<2,50,000", "<5,00,000", "up to 10,00,000"};
        cb_Income = new JComboBox(Incomeval);
        cb_Income.setBounds(300,220,400,30);
        cb_Income.setBackground(Color.WHITE);
        add(cb_Income);
        
        Education = new JLabel ("Educational");
        Education.setFont(new Font("Raleway", Font.BOLD, 20));
        Education.setBounds(100,270,200,30);
        add(Education);
        
        Qualification = new JLabel ("Qualification");
        Qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        Qualification.setBounds(100,295,200,30);
        add(Qualification);
        
        String Educationval[] = {"intermediate", "under graduate", "post graduate", "Other"};
        cb_Education = new JComboBox(Educationval);
        cb_Education.setBounds(300,295,400,30);
        cb_Education.setBackground(Color.WHITE);
        add(cb_Education);
        
        Occupation = new JLabel ("Occupation");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        Occupation.setBounds(100,370,200,30);
        add(Occupation);
        
        String Occupationval[] = {"Salaried", "Self Employed", "BusinessMen", "Student","Retired","Entrepreneur"};
        cb_Occupation = new JComboBox(Occupationval);
        cb_Occupation.setBounds(300,370,200,30);
        cb_Occupation.setBackground(Color.WHITE);
        add(cb_Occupation);
        
        PanNumber = new JLabel ("Pan Number");
        PanNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        PanNumber.setBounds(100,420,200,30);
        add(PanNumber);
        
        PanNumbert = new JTextField();
        PanNumbert.setFont(new Font("Raleway", Font.BOLD, 14));
        PanNumbert.setBounds(300,420,400,30);
        add(PanNumbert);
        
        AdharNumber = new JLabel ("Adhar Number:");
        AdharNumber.setFont(new Font("Raleway", Font.BOLD, 20));
        AdharNumber.setBounds(100,470,200,30);
        add(AdharNumber);
        
        AdharNumbert = new JTextField();
        AdharNumbert.setFont(new Font("Raleway", Font.BOLD, 14));
        AdharNumbert.setBounds(300,470,400,30);
        add(AdharNumbert);
        
        SeniorCitzen = new JLabel ("Senior Citzen:");
        SeniorCitzen.setFont(new Font("Raleway", Font.BOLD, 20));
        SeniorCitzen.setBounds(100,520,200,30);
        add(SeniorCitzen);
        
        sYes = new JRadioButton("Yes");
        sYes.setBounds(300,520,50,30);
        sYes.setBackground(Color.WHITE);
        add(sYes);
        
        sNo = new JRadioButton("No");
        sNo.setBounds(370, 520,100,30);
        sNo.setBackground(Color.WHITE);
        add(sNo);
        
        ButtonGroup SeniorCitzen = new ButtonGroup();
        SeniorCitzen.add(sYes);
        SeniorCitzen.add(sNo);
        
        ExistingAccount = new JLabel ("Existing Account");
        ExistingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
        ExistingAccount.setBounds(100,570,200,30);
        add(ExistingAccount);
        
        eYes = new JRadioButton("Yes");
        eYes.setBounds(300,570,50,30);
        eYes.setBackground(Color.WHITE);
        add(eYes);
        
        eNo = new JRadioButton("No");
        eNo.setBounds(370, 570,100,30);
        eNo.setBackground(Color.WHITE);
        add(eNo);
        
        ButtonGroup ExistingAccount = new ButtonGroup();
        ExistingAccount.add(eYes);
        ExistingAccount.add(eNo);
              
        
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620,610,80,30);
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
      String sreligion = (String)cb_religion.getSelectedItem();
      String scategory = (String)cb_category.getSelectedItem();
       String sIncome = (String)cb_Income.getSelectedItem();
       String sEducation = (String)cb_Education.getSelectedItem();
       String sOccupation = (String)cb_Occupation.getSelectedItem();
        String SeniorCitzen = null;
        if(sYes.isSelected()){
            SeniorCitzen = "Yes";
        }
        else if (sNo.isSelected()){
            SeniorCitzen = "No";
        }
        
        String ExistingAccount = null;
        if(eYes.isSelected()){
            ExistingAccount = "Yes";
        }
        else if(eNo.isSelected()){
            ExistingAccount = "No";
        }
        
        String sPanNumber = PanNumber.getText();
        String sAdharNumber = AdharNumber.getText();
               
        try{
            
             Conn c = new Conn();
             String query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sIncome+"','"+sEducation+"','"+sOccupation+"','"+sPanNumber+"','"+sAdharNumber+"','"+SeniorCitzen+"','"+ExistingAccount+"')";
             c.s.executeUpdate(query);            
            
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
    
}