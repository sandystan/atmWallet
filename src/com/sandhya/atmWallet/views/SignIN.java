package com.sandhya.atmWallet.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignIN extends JFrame {


	private JPanel contentPane;
	private static SignIN SIGN_IN = null;
 
	/**
	 * Create the frame.
	 */
	private SignIN() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JCheckBox chckbxMale = new JCheckBox("Male");
		chckbxMale.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Sacndhya is lady");
			}
		});
		contentPane.add(chckbxMale, BorderLayout.WEST);
	}
	public static SignIN getInstance() {
		if(SIGN_IN == null) SIGN_IN = new SignIN();
		return SIGN_IN;
	}


}