
package automated.teller.machine;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class SIGNUP_Additional extends JFrame implements ActionListener {
    
    JTextField PANTextField ,aadharTextField;
    JButton submit;
    JRadioButton sy, sn, r1, r2 ;
    JCheckBox ck1, ck3, ck4, ck5, ck6;
    JComboBox c2;
    String frm_no;
    
    SIGNUP_Additional(String frm_no){
        
        this.frm_no = frm_no;
        setLayout(null);
        
        setTitle("ADDITIONAL DETAILS");
        
        JLabel additionalDetail = new JLabel("Additional Details ");
        additionalDetail.setFont(new Font("Arial", Font.BOLD, 22));
        additionalDetail.setBounds(320, 30, 400, 30);
        add(additionalDetail);
        
        
        JLabel income = new JLabel("Income : ");
        income.setFont(new Font("Arial", Font.BOLD, 22));
        income.setBounds(110, 90, 200, 30);
        add(income);
        
        String sal[] = {"Null","<1,00,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c2 = new JComboBox(sal);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        c2.setBounds(300, 90, 150, 30);
        add(c2);
        
        JLabel PAN = new JLabel("PAN No. : ");
        PAN.setFont(new Font("Arial", Font.BOLD, 22));
        PAN.setBounds(110, 140, 200, 30);
        add(PAN);
        
        PANTextField = new JTextField();
        PANTextField.setFont(new Font("Arial", Font.BOLD, 14));
        PANTextField.setBounds(300, 140, 300, 30);
        add(PANTextField);
        
        JLabel aadhar = new JLabel("Aadhaar No. : ");
        aadhar.setFont(new Font("Arial", Font.BOLD, 22));
        aadhar.setBounds(110, 190, 200, 30);
        add(aadhar);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Arial", Font.BOLD, 14));
        aadharTextField.setBounds(300, 190, 300, 30);
        add(aadharTextField);
        
        JLabel senior = new JLabel("Senior Citizen : ");
        senior.setFont(new Font("Arial", Font.BOLD, 22));
        senior.setBounds(110, 240, 200, 30);
        add(senior);
        
        sy = new JRadioButton("Yes");
        sy.setBounds(300, 240, 60, 30);
        sy.setBackground(Color.lightGray);
        add(sy);
        
        sn = new JRadioButton("No");
        sn.setBounds(450, 240, 120, 30);
        sn.setBackground(Color.lightGray);
        add(sn);
        
        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(sy);
        seniorgroup.add(sn);
        
        JLabel accountType = new JLabel("Account Type : ");
        accountType.setFont(new Font("Arial", Font.BOLD, 22));
        accountType.setBounds(110, 290, 200, 30);
        add(accountType);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Arial", Font.BOLD, 16));
        r1.setBackground(Color.lightGray);
        r1.setBounds(115, 340, 150, 30);
        add(r1);
        
        r2 = new JRadioButton("Current Account");
        r2.setFont(new Font("Arial", Font.BOLD, 16));
        r2.setBackground(Color.lightGray);
        r2.setBounds(330, 340, 150, 30);
        add(r2);
          
        ButtonGroup Accountgroup = new ButtonGroup();
        Accountgroup.add(r1);
        Accountgroup.add(r2);
        
        JLabel serviceType = new JLabel("Services required : ");
        serviceType.setFont(new Font("Arial", Font.BOLD, 22));
        serviceType.setBounds(110, 390, 220, 30);
        add(serviceType);
        
        ck1 = new JCheckBox(" ATM CARD");
        ck1.setBackground(Color.WHITE);
        ck1.setFont(new Font("Raleway", Font.BOLD, 16));
        ck1.setBounds(115, 440, 220, 30);
        ck1.setBackground(Color.lightGray);
        add(ck1);
        
        ck3 = new JCheckBox(" Mobile Banking");
        ck3.setBackground(Color.WHITE);
        ck3.setFont(new Font("Raleway", Font.BOLD, 16));
        ck3.setBounds(330, 440, 220, 30);
        ck3.setBackground(Color.lightGray);
        add(ck3);
        
        ck4 = new JCheckBox(" EMAIL Alerts");
        ck4.setBackground(Color.WHITE);
        ck4.setFont(new Font("Raleway", Font.BOLD, 16));
        ck4.setBounds(115, 500, 220, 30);
        ck4.setBackground(Color.lightGray);
        add(ck4);
       
        ck5 = new JCheckBox(" E-Statement");
        ck5.setBackground(Color.WHITE);
        ck5.setFont(new Font("Raleway", Font.BOLD, 16));
        ck5.setBounds(330, 500, 220, 30);
        ck5.setBackground(Color.lightGray);
        add(ck5);
        
        ck6 = new JCheckBox(" I hereby declares that the above entered details correct to the best of my knowledge.",true);
        ck6.setBackground(Color.WHITE);
        ck6.setFont(new Font("Raleway", Font.BOLD, 15));
        ck6.setBounds(110, 600, 700, 30);
        ck6.setBackground(Color.lightGray);
        add(ck6);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Arial", Font.BOLD, 15));
        submit.setBounds(370,660,100,30);
        submit.addActionListener(this);
        add(submit);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        setSize(850,850);
        setLocation(350,10);
        setVisible(true);
        
        
    }
    
     public static void main(String args []){
         new SIGNUP_Additional("");
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Income = (String)c2.getSelectedItem();
        String scitizen = null;
        if(sy.isSelected()){
            scitizen = "Yes";
        }
        else if(sn.isSelected()){
            scitizen = "No";
        }
        
        String account = "";
        if(r1.isSelected()){
            account = "Saving Account";
        }
        else if(r2.isSelected()){
            account = "Current Account";
        }
        Random ran = new Random();
        String cardno = ""+Math.abs((ran.nextLong() % 90000000L) + 5040936000000000L);
        String pinno = ""+Math.abs((ran.nextLong() % 9000L) + 1000L);
        
        String facility = "";
        if(ck1.isSelected()){
            facility = facility + "ATM Card";
        }
        else if(ck3.isSelected()){
            facility = facility + " Mobile Banking";
        }
        else if(ck4.isSelected()){
            facility = facility + " Email Alerts";
        }
        
        else if(ck5.isSelected()){
            facility = facility + " E-Statement";
        }
        
        String pan = PANTextField.getText();
        String Adh = aadharTextField.getText();
        
        try{
            Conn c = new Conn();
                String query1 = "insert into signuptwo values('"+frm_no+"','"+Income+"','"+scitizen+"','"+pan+"','"+Adh+"','"+account+"','"+facility+"','"+cardno+"','"+pinno+"')";
                String query2 = "insert into login values('"+frm_no+"','"+cardno+"','"+pinno+"')";
                
                
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null, "Card no. : " + cardno + "\n Pin: " + pinno);
                setVisible(false);
                new Login().setVisible(true);
                
        }catch (Exception ae){
              ae.printStackTrace();
        }
        
        
    }
    
}
