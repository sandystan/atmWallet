package com.sandhya.atmWallet.views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import com.sandhya.atmWallet.views.oldClasses.User;

public class Main extends JFrame implements ActionListener {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private static Main main;
	JLabel appName, welcomeMsg, developedBy;
	JButton btnSignUp;
	JPanel mainPannel;

	public Main() {
		appName = new JLabel("POCKECT ATM WALLET");
		welcomeMsg = new JLabel("We trust in the way you trust us");
		btnSignUp = new JButton("Sign_Up");
		mainPannel = new JPanel();

		mainPannel.add(appName);
		mainPannel.add(welcomeMsg);
		mainPannel.add(btnSignUp);
		
		btnSignUp.addActionListener(this);
		mainPannel.setBackground(new Color(34, 49, 63));
		appName.setForeground(new Color(228, 251, 254));
		welcomeMsg.setForeground(new Color(228, 251, 254));
		//developedBy.setForeground(new Color(228, 251, 254));
		btnSignUp.setBackground(new Color(228, 251, 254));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		getContentPane().add(mainPannel);
	}

	public static void main(String[] args) {
		main = new Main();
		main.setVisible(true);
		main.setSize(500, 500);
		main.setBackground(new Color(34, 49, 63));
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
