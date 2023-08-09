
package automated.teller.machine;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;

public class Withdrawl extends JFrame implements ActionListener {
    
    JTextField amount;
    JButton b6,b7;
    String pin;
    Withdrawl(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 900);
        add(l2);
        
        JLabel text = new JLabel("Enter the Withdraw amount");
        text.setBounds(220,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        l2.add(text);
        
        amount = new JTextField();
        amount.setFont(new Font("Arial", Font.BOLD,22));
        amount.setBounds(170, 350, 320, 25);
        l2.add(amount);
        
        b6 = new JButton("WITHDRAW");
        b7 = new JButton("BACK");
        
        b6.setBounds(355,460,150,30);
        l2.add(b6);
        
        b7.setBounds(355,495,150,28);
        l2.add(b7);
        
        b6.addActionListener(this);
        b7.addActionListener(this);
        
        setSize(900, 900);
        setLocation(300,0);
        setVisible(true);
        
        
    }
    
    public static void main(String args []){
     new Withdrawl("");   
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b6){
            String num = amount.getText();
                try{
                Conn c = new Conn();
                String q = "insert into bank2 values('"+pin+"','Withdraw','"+num+"')";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Amount Withdrawl Succesfully");
                setVisible(false);
                new Transactions("").setVisible(true);
                
            }catch(Exception ae){
                System.out.print(ae);
            }
    }
        else if(e.getSource() == b7){
            setVisible(false);
            new Transactions("").setVisible(true);
        }
    }
    
}

