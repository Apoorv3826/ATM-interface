
package automated.teller.machine;

import java.awt.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PinChange extends JFrame implements ActionListener{
    
    JButton change, back;
    JTextField pin;
    String pinnumber;
    
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l2 = new JLabel(i3);
        l2.setBounds(0, 0, 900, 900);
        add(l2);
        
        JLabel text = new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(250,270,500,35);
        l2.add(text);
        
        JLabel pintext = new JLabel("CHANGE YOUR PIN");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System", Font.BOLD, 16));
        pintext.setBounds(155,320,180,25);
        l2.add(pintext);
        
        pin = new JTextField();
        pin.setFont(new Font("Raleway", Font.BOLD, 25));
        pin.setBounds(330, 320, 180, 25);
        l2.add(pin);
        
        change = new JButton("CHANGE");
        change.setBounds(355,390,150,30);
        change.addActionListener(this);
        l2.add(change);
        
        back = new JButton("BACK");
        back.setBounds(355,424,150,30);
        back.addActionListener(this);
        l2.add(back);
        
        
        setSize(900, 900);
        setLocation(300,0);
        setVisible(true);
    }
    public static void main(String args[]){
        new PinChange("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == change){
            try{
               String npin = pin.getText();
               
               if(npin.equals("")){
                   JOptionPane.showMessageDialog(null, "PIN cannot be empty!");
                   return;
               }
               Conn c = new Conn();
               String query1 = "update bank set pin = '"+npin+"' where pin='"+pinnumber+"'";
               String query2 = "update login set pinnumber = '"+npin+"' where pinnumber='"+pinnumber+"'";
               String query3 = "update signuptwo set pin = '"+npin+"' where pin='"+pinnumber+"'";
               
               c.s.executeUpdate(query1);
               c.s.executeUpdate(query2);
               c.s.executeUpdate(query3);
               
               JOptionPane.showMessageDialog(null, "PIN changed succesfully");
               
               setVisible(false);
               new Transactions(npin).setVisible(true);
               
            }catch(Exception ae){
                System.out.println(ae);
            }
        }
        else{
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
}
