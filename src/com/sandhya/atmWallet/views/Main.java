package com.sandhya.atmWallet.views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.sandhya.atmWallet.views.oldClasses.Login;
import com.sandhya.atmWallet.views.oldClasses.Sign_up;
import com.sandhya.atmWallet.views.oldClasses.User;

public class Main extends JFrame implements ActionListener{
	 private static Main main;
	    JLabel l1,l2,l3;
	    JTextField t1;
	    JPasswordField t2;
	    JButton b;
	    JPanel p;
	    public Main(){
	        l1 = new JLabel("User Name : ");
	        l2 = new JLabel("PIN : ");
	        l3 = new JLabel("");
	        t1 = new JTextField(10);
	        t2 = new JPasswordField(8);
	        b = new JButton("Sign_Up");
	        p = new JPanel();
	        p.add(l1);
	        p.add(t1);
	        p.add(l2);
	        p.add(t2);
	        p.add(l3);
	        p.add(b);
	        b.addActionListener(this);
	        p.setBackground(new Color(34,49,63));
	        l1.setForeground(new Color(228,251,254));
	        l2.setForeground(new Color(228,251,254));
	        l3.setForeground(new Color(228,251,254));
	        b.setBackground(new Color(228,251,254));
	        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	        getContentPane().add(p);
	    }
	    public static void main(String[] args) {
	        main = new Main();
	        main.setVisible(true);
	        main.setSize(500,500);
	        main.setBackground(new Color(34,49,63));
	    }
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        User ur = new User();
		/*
		 * ur.sign_up(t1.getText(),Integer.parseInt(t2.getText())); m.setVisible(false);
		 * Login lg = new Login(ur,this); lg.setVisible(true); lg.setSize(500,500);
		 */
	    }
}
