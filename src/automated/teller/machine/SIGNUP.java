
package automated.teller.machine;

import javax.swing.*;
import java.awt.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
import java.awt.event.*;

public class SIGNUP extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField, fnameTextField, emailTextField, addressTextField, 
            cityTextField, stateTextField, pincodeTextField;
    JRadioButton m, f, married, unmarried; 
    
    JButton submit;
    
    JDateChooser dateChooser;
    
    JComboBox c1;
    
    SIGNUP(){
        setLayout(null);
        
        Random rand = new Random();
        random = Math.abs((rand.nextLong() % 9000L) +1000L);
        
        JLabel frm_no = new JLabel("APPLICATION NO. " + random);
        frm_no.setForeground(Color.BLACK);
        frm_no.setFont(new Font("Arial", Font.BOLD, 38));
        frm_no.setBounds(140, 20, 550, 40);
        add(frm_no);
        
        JLabel Detail = new JLabel("Personal Details ");
        Detail.setForeground(Color.BLACK);
        Detail.setFont(new Font("Arial", Font.BOLD, 22));
        Detail.setBounds(280, 80, 400, 30);
        add(Detail);
        
        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("Arial", Font.BOLD, 22));
        name.setForeground(Color.BLACK);
        name.setBounds(110, 140, 100, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 300, 30);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name : ");
        fname.setFont(new Font("Arial", Font.BOLD, 22));
        fname.setForeground(Color.BLACK);
        fname.setBounds(110, 190, 200, 30);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Arial", Font.BOLD, 14));
        fnameTextField.setBounds(300, 190, 300, 30);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date of Birth : ");
        dob.setFont(new Font("Arial", Font.BOLD, 22));
        dob.setForeground(Color.BLACK);
        dob.setBounds(110, 240, 200, 30);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 300, 30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);
        
        JLabel gender = new JLabel("Gender : ");
        gender.setFont(new Font("Arial", Font.BOLD, 22));
        gender.setForeground(Color.BLACK);
        gender.setBounds(110, 290, 200, 30);
        add(gender);
        
        m = new JRadioButton("Male");
        m.setBounds(300, 290, 60, 30);
        m.setBackground(Color.lightGray);
        add(m);
        
        f = new JRadioButton("Female");
        f.setBounds(450, 290, 100, 30);
        f.setBackground(Color.lightGray);
        add(f);
        
        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(m);
        gendergroup.add(f);
        
        JLabel email = new JLabel("Email : ");
        email.setFont(new Font("Arial", Font.BOLD, 22));
        email.setForeground(Color.BLACK);
        email.setBounds(110, 340, 200, 30);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Arial", Font.BOLD, 14));
        emailTextField.setBounds(300, 340, 300, 30);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status : ");
        marital.setFont(new Font("Arial", Font.BOLD, 22));
        marital.setForeground(Color.BLACK);
        marital.setBounds(110, 390, 200, 30);
        add(marital);
        
        
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.lightGray);
//        married.setOpaque(false);
//        married.setContentAreaFilled(false);
//        married.setBorderPainted(false);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.lightGray);
        add(unmarried);
        
        ButtonGroup marriedgroup = new ButtonGroup();
        marriedgroup.add(married);
        marriedgroup.add(unmarried);
        
        
        JLabel Religion = new JLabel("Religion:");
        Religion.setFont(new Font("Arial", Font.BOLD, 22));
        Religion.setForeground(Color.BLACK);
        Religion.setBounds(110, 440, 200, 30);
        add(Religion);
        
        
        String religion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox(religion);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBounds(300, 440, 100, 30);
        add(c1);
         
        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Arial", Font.BOLD, 22));
        address.setForeground(Color.BLACK);
        address.setBounds(110, 490, 200, 30);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Arial", Font.BOLD, 14));
        addressTextField.setBounds(300, 490, 300, 30);
        add(addressTextField);
        
        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Arial", Font.BOLD, 22));
        city.setForeground(Color.BLACK);
        city.setBounds(110, 540, 200, 30);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Arial", Font.BOLD, 14));
        cityTextField.setBounds(300, 540, 300, 30);
        add(cityTextField);
        
        JLabel state = new JLabel("State : ");
        state.setFont(new Font("Arial", Font.BOLD, 22));
        state.setForeground(Color.BLACK);
        state.setBounds(110, 590, 200, 30);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Arial", Font.BOLD, 14));
        stateTextField.setBounds(300, 590, 300, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pincode : ");
        pincode.setFont(new Font("Arial", Font.BOLD, 22));
        pincode.setForeground(Color.BLACK);
        pincode.setBounds(110, 640, 200, 30);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Arial", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 640, 300, 30);
        add(pincodeTextField);
        
        submit = new JButton("Continue");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Arial", Font.BOLD, 14));
        submit.setBounds(630, 700, 100, 30);
        submit.addActionListener(this);
        add(submit);
        
//        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/bg2.jpg"));
//        Image c = i.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
//        ImageIcon I = new ImageIcon(c);
//        JLabel image = new JLabel(I);
//        image.setBounds(0, 0, 850, 800);
//        add(image);
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        
        
    }
   public static void main(String args[]){
       new SIGNUP();
   } 

    @Override
    public void actionPerformed(ActionEvent e) {
        String frm_no = "" + random ;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = "";
        if(m.isSelected()){ 
            gender = "Male";
        }else if(f.isSelected()){ 
            gender = "Female";
        }
            
        String email = emailTextField.getText();
        String marital = "";
        if(married.isSelected()){ 
            marital = "Married";
        }else if(unmarried.isSelected()){ 
            marital = "Unmarried";
        }
        String religion = (String)c1.getSelectedItem();
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String pincode = pincodeTextField.getText();
        String state = stateTextField.getText();
        
        try{
            Conn c = new Conn();
                String query = "insert into signup values('"+frm_no+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"','"+religion+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SIGNUP_Additional(frm_no).setVisible(true);
                
        }catch (Exception ae){
              ae.printStackTrace();
        }
//        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
