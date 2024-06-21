
package quiz.application;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton start ,back ;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Simple Quiz");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC" , Font.BOLD, 28));
        heading.setForeground(Color.RED);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma" , Font.PLAIN, 16));
        rules.setText(
                "<html>"+ 
                "1. You are trained to be a programmer and not a story teller, answer point to point" + "<br><br>" +
                "2. Do not unnecessarily smile at the person sitting next to you" + "<br><br>" +
                "3. You may have lot of options in life but here all the questions are compulsory" + "<br><br>" +
                "4. Read all the questions carefully and then choose correct option" + "<br><br>" +
                "5. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                "6. May you know more than what james gosling knows, Good Luck" + "<br><br>" +
                
            "<html>"
);

        
    
        add(rules);
         back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setBackground(Color.RED);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setBackground(Color.RED);
        start.addActionListener(this);
        add(start);
        
        
        
     setSize(800, 650);
     setLocation(350, 100);
     setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
       if (ae.getSource() == start){
           setVisible(false);
           new Quiz(name);
       } else {
           setVisible(false);
           new Login();
       }
    }
   
    public static void main(String[] args) {
        new Rules("User");
    }
}
