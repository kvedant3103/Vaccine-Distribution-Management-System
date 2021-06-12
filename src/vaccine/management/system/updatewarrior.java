/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccine.management.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.event.*;
import java.sql.PreparedStatement;


public class updatewarrior extends JFrame implements ActionListener{
    
    
      JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
      JButton b1,b2,b3,b4;
    updatewarrior()
    {
        setTitle("Vaccine Management System");
          getContentPane().setBackground(Color.WHITE);
        JLabel name = new JLabel("NAME");
        name.setFont(new Font("Tahoma",Font.PLAIN,17));
        name.setBounds(60,80,120,30);
        add(name);
        
        t1 = new JTextField();
        t1.setBounds(230,80,150,30);
        add(t1);
        
        
        
        
        JLabel age = new JLabel("AGE");
        age.setFont(new Font("Tahoma",Font.PLAIN,17));
        age.setBounds(60,130,120,30);
        add(age);
        
        t2 = new JTextField();
        t2.setBounds(230,130,150,30);
        add(t2);
        
        JLabel gender = new JLabel("GENDER");
        gender.setFont(new Font("Tahoma",Font.PLAIN,17));
        gender.setBounds(60,180,120,30);
        add(gender);
        
        


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Vaccine/Management/System/icons/cov.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(400,100,450,400);
        add(l1);
        
        JLabel l2 = new JLabel("UPDATE COVID WARRIORS DETAILS");
        l2.setForeground(Color.BLUE);
        l2.setFont(new Font("Tahoma",Font.PLAIN,20));
        l2.setBounds(460,30,400,30);
        add(l2);
        
          t3 = new JTextField();
          t3.setBounds(230,180,150,30);
          add(t3);
          t3.setEditable(false);
        
                
        JLabel vacc = new JLabel("Vaccine");
        vacc.setFont(new Font("Tahoma",Font.PLAIN,17));
        vacc.setBounds(60,230,150,30);
        add(vacc);
        
          t4 = new JTextField();
          t4.setBounds(230,230,150,30);
          t4.setEditable(false);
          add(t4);
        
        

        JLabel status = new JLabel("Status");
        status.setFont(new Font("Tahoma",Font.PLAIN,17));
        status.setBounds(60,280,120,30);
        add( status);
        
        t5 = new JTextField();
        t5.setBounds(230,280,150,30);
        add(t5);
        
         JLabel des = new JLabel("Designation");
        des.setFont(new Font("Tahoma",Font.PLAIN,17));
        des.setBounds(60,330,120,30);
        add(des);
        
        t6 = new JTextField();
        t6.setBounds(230,330,150,30);
        add(t6);

    
        JLabel phone = new JLabel("PHONE");
        phone.setFont(new Font("Tahoma",Font.PLAIN,17));
        phone.setBounds(60,380,120,30);
        add(phone);
        
        t7 = new JTextField();
        t7.setBounds(230,380,150,30);
        add(t7);
        

        
        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("Tahoma",Font.PLAIN,17));
        email .setBounds(60,430,120,30);
        add(email);
        
        t8 = new JTextField();
        t8.setBounds(230,430,150,30);
        add(t8);
        
        
        JLabel aad = new JLabel("Aadhar");
       aad.setFont(new Font("Tahoma",Font.PLAIN,17));
        aad.setBounds(60,480,120,30);
        add(aad);
        
        t9 = new JTextField();
        t9.setBounds(230,480,150,30);
        add(t9);
        
        JLabel giv = new JLabel("Please enter adhar number!");
        giv.setFont(new Font("Tahoma",Font.PLAIN,17));
        giv.setForeground(Color.RED);
        giv.setBounds(60,510,230,30);
        add(giv);
        
        b1 = new JButton("BACK");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(50,570,120,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("LOGOUT");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(200,570,120,30);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Load Data");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.setBounds(350,570,120,30);
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("Update");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(490,570,120,30);
        b4.addActionListener(this);
        add(b4);
        

     
        
       
        setLayout(null);
        //setBounds(200,200,950,700);
        setBounds(300,25,900,700);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae)
    {   
         if(ae.getSource()==b1){
//           
                 new covidwarriors().setVisible(true);
                 this.setVisible(false);
             
        }
        
        else if(ae.getSource()==b2)
        {
           System.exit(0);
        }
         
         else if(ae.getSource()==b3)
        {
          try
          {
              Conn p = new Conn();
              String sql = "select * from warriors where aadhar = ?";
              PreparedStatement st = p.c.prepareStatement(sql);
              st.setString(1,t9.getText());
              ResultSet rs = st.executeQuery();
//               if(rs.next() == false)
//                {
//                  JOptionPane.showMessageDialog(null,"Record Not Found");
//                }
              while(rs.next())
              {   
//                  System.out.print(rs.next());
                  t1.setText(rs.getString("name"));
                  t2.setText(rs.getString("age"));
                  t3.setText(rs.getString("gender"));
                  t4.setText(rs.getString("vaccine"));
                  t5.setText(rs.getString("status"));
              //  t5.setText(rs.getString("aadhar"));
                 t6.setText(rs.getString("designation"));
                 t7.setText(rs.getString("phone"));
                 t8.setText(rs.getString("email"));
//                 System.out.println(rs.getString("email"));
                
                 
              }
//              System.out.print(rs.next());
              
             
          }catch(Exception e)
          {
              System.out.print(e);
          }
        }
         else if(ae.getSource()==b4)
         {
           String name = t1.getText();
           String age = t2.getText();
           String gender = t3.getText();
           String vaccine = t4.getText();
           String status = t5.getText();
           String designation = t6.getText();
           String phone = t7.getText();
           String email = t8.getText();
//
//           
//           
            String qry = "update warriors set name='"+name+"',age='"+age+"',gender='"+gender+"',vaccine='"+vaccine+"',status='"+status+"',designation='"+designation+"',phone='"+phone+"',email='"+email+"'   where aadhar="+t9.getText();
            try{
                Conn conect = new Conn();
             int i =  conect.s.executeUpdate(qry);
             if(i>0)
              JOptionPane.showMessageDialog(null,"Covid Warriors Record Updated");
            }catch(Exception ee){
//                System.out.println(ee);
//                 JOptionPane.showMessageDialog(null,"Invalid Aadhar");
            }
         }
        
        
    }
      public static void main(String[] args)
    {
        new updatewarrior().setVisible(true);   //object of the class
    }
    
}
