package com.sandhya.atmWallet.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SignIn extends JFrame {


	private JPanel contentPane;
	private static SignIn SIGN_IN = null;
 
	/**
	 * Create the frame.
	 */
	private SignIn() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	public static SignIn getInstance() {
		if(SIGN_IN == null) SIGN_IN = new SignIn();
		return SIGN_IN;
	}


}
