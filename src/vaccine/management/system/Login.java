package vaccine.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    
    
    JLabel l1,l2;
    JButton b1,b2;
    JTextField t1;
    JPasswordField t2;
    Login()
    {
        setTitle("Vaccine Management System");
        setBounds(400,250,600,300);
        
        
        
        l1 = new JLabel("Username");
        l1.setBounds(40,20,100,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(40,70,100,30);
        add(l2);
        
        t1 = new JTextField();
        t1.setBounds(150,20,150,30);
        add(t1);
        
        t2 = new JPasswordField();
        t2.setBounds(150,70,150,30);
        add(t2);
        
        b1 = new JButton("LOGIN");
        b1.setBounds(40,140,120,30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("CANCEL");
        b2.setBounds(180,140,120,30);
       // b2.setFont(new Font("Times New Roman",Font.BOLD,15));
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Vaccine/Management/System/icons/sec.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(350,20,200,200);
        add(l3);
        
        getContentPane().setBackground(Color.WHITE);
        
        
        setLayout(null);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == b1)
        {
            try{
            Conn c1 = new Conn();
            String u = t1.getText();
            String v = t2.getText();
            
            String q = "select * from login where username='"+u+"' and password='"+v+"'";
            
            ResultSet rs = c1.s.executeQuery(q);  // s is a createstatement object in conn class
            if(rs.next()){

                 new intro().setVisible(true);
                 this.setVisible(false);
                 System.out.println("Success");
                 System.out.println(ae.getSource());
            }else{
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(true);
                t1.setText("");
                t2.setText("");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        }else if(ae.getSource()==b2){
            System.exit(0);
        }
    }
    
    
    
     public static void main(String[] args) {
                new Login().setVisible(true);			
	}
}


