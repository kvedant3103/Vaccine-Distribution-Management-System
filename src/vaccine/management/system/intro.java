package vaccine.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class intro extends JFrame implements ActionListener{
    
    JButton b1,b2,b3,b4,b5,b6,b7;
    intro()
    {
        setTitle("Vaccine Management System");
        setBounds(300,25,800,700);
        
        
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Vaccine/Management/System/icons/vac.jpg"));
        Image i2 = i1.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,800,800);
        l3.setBackground(Color.WHITE);
        add(l3);
        
        
        b1 = new JButton("COVID WARRIORS");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.CYAN);
        b1.setBounds(220,100,150,50);
        b1.addActionListener(this);
        l3.add(b1);
        
        
        b2 = new JButton("SENIOR CITIZENS");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.CYAN);
        b2.setBounds(220,200,150,50);
        b2.addActionListener(this);
        l3.add(b2);
      
        b3 = new JButton("MIDDLE AGED");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.CYAN);
        b3.setBounds(220,300,150,50);
        b3.addActionListener(this);
        l3.add(b3);
        
        b4 = new JButton("YOUTHS");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.CYAN);
        b4.setBounds(220,400,150,50);
        b4.addActionListener(this);
        l3.add(b4);
        
        b5 = new JButton("CHILDEREN");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.CYAN);
        b5.setBounds(220,500,150,50);
        b5.addActionListener(this);
        l3.add(b5);
        
        //getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setVisible(true);
    }
    
      public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == b1)
        {
           new covidwarriors().setVisible(true);
           this.setVisible(false);
        }else if(ae.getSource()==b2){
            new seniorcit().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b3){
            new middle().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b4){
            new youth().setVisible(true);
            this.setVisible(false);
        }else if(ae.getSource()==b5){
            new child().setVisible(true);
            this.setVisible(false);
        }   
    }
    
    
    public static void main(String[] args) {
                new intro().setVisible(true);			
	}
}
