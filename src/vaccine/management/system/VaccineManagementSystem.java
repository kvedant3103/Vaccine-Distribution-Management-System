package vaccine.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

public class VaccineManagementSystem extends JFrame implements ActionListener{

   VaccineManagementSystem()
   {
       setTitle("Vaccine Management System");
        setBounds(250,25,1024,536); // takes setsize and setlocation in single command
      
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Vaccine/Management/System/icons/first.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1024,536,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        //JLabel l1 = new JLabel(i1);
        l3.setBounds(0,0,1024,536);
        add(l3);
       
       
       JLabel l2 = new JLabel("Vaccination Drive");
       l2.setBounds(220,0,1000,70);
       l2.setForeground(Color.WHITE);
       l2.setFont(new Font("serif",Font.PLAIN,70));
       l3.add(l2);
       
       JButton b1 = new JButton("NEXT");
       b1.setBackground(Color.CYAN);
       b1.setForeground(Color.BLACK);
       b1.setBounds(700,430,120,30);
       b1.addActionListener(this);
       l3.add(b1);
       
       
       setLayout(null);
       setVisible(true);
   }
    public void actionPerformed(ActionEvent ae){
                new Login().setVisible(true);
                this.setVisible(false);
                  System.out.println("hello");
      }          
    public static void main(String[] args) {
        
         new VaccineManagementSystem();
    }
    
}
