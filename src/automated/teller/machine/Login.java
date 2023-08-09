package automated.teller.machine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {
    
    JButton login, signup;
    JTextField idTextField;
    JPasswordField pinTextField;
    
    Login(){
        
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/provider.png"));
        Image i2 = icon.getImage().getScaledInstance(100, 90, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(180, 12, 100, 100);
        setLayout(null);
        add(label);
        
        JLabel  text = new JLabel("Welcome to ATM");
        text.setFont(new Font("Osward", Font.BOLD, 39));
        text.setBounds(300, 43, 400, 40);
        add(text);
        
        JLabel  user_id = new JLabel("ID : ");
        user_id.setFont(new Font("Ralway", Font.BOLD, 30));
        user_id.setBounds(220, 150, 150, 30);
        add(user_id);
        
        idTextField = new JTextField();
        idTextField.setFont(new Font("Arial", Font.BOLD, 15));
        idTextField.setBounds(310, 150, 250, 30);
        add(idTextField);
        
        JLabel  user_pin = new JLabel("PIN : ");
        user_pin.setFont(new Font("Ralway", Font.BOLD, 30));
        user_pin.setBounds(220, 220, 250, 30);
        add(user_pin);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(310, 220, 250, 30);
        add(pinTextField);
        
        login = new JButton("SUBMIT");
        login.setBounds(280, 310, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);
        
        signup = new JButton("SIGN UP");
        signup.setBounds(410, 310, 100, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image c = i.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon I = new ImageIcon(c);
        JLabel image = new JLabel(I);
        image.setBounds(630, 350, 100, 100);
        add(image);
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("icons/backbg.png"));
        Image i22 = i11.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon I1 = new ImageIcon(i22);
        JLabel image2 = new JLabel(I1);
        image2.setBounds(0, 0, 850, 480);
        add(image2);
        
        setTitle("ATM");
        
        getContentPane().setBackground(Color.LIGHT_GRAY);
        setSize(850,480);
        setVisible(true); 
        setLocation(450,200);
    }
    
//    public void actionPerfromed(ActionEvent ae){
//        if(ae.getSource() == login){
//            
//        }else if(ae.getSource() == signup){
//            
//        }
//    }
    public static void main(String args[]){
    new Login();   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()== login){
            Conn c = new Conn();
            String cnum = idTextField.getText();
            String pinnum = pinTextField.getText();
            String q = "select *from login where cardnumber = '"+cnum+"' and pinnumber = '"+pinnum+"'";
            try{
                ResultSet rs = c.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pinnum).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Incorrect Details");
                }
            }
            catch(Exception ae){
                System.out.print(ae);
            }
        }
        else if (e.getSource() == signup){
            setVisible(false);
            new SIGNUP().setVisible(true);
        }
        
        //throw new UnsupportedOperationException("Not supported yet.");
        
    }
    
}
