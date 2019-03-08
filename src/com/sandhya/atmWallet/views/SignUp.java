package com.sandhya.atmWallet.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private static SignUp SIGN_UP = null;
 
	/**
	 * Create the frame.
	 */
	private SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	public static SignUp getInstance() {
		if(SIGN_UP == null) SIGN_UP = new SignUp();
		return SIGN_UP;
	}

}
