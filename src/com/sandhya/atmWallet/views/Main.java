package com.sandhya.atmWallet.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class Main {

	private JFrame frmPocketAtmWallet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmPocketAtmWallet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPocketAtmWallet = new JFrame();
		frmPocketAtmWallet.setForeground(new Color(153, 51, 0));
		frmPocketAtmWallet.setTitle("Pocket ATM Wallet");
		frmPocketAtmWallet.getContentPane().setBackground(new Color(255, 204, 204));
		frmPocketAtmWallet.setBounds(100, 100, 450, 148);
		frmPocketAtmWallet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frmPocketAtmWallet.getContentPane().setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Pocket ATM Wallet");
		lblNewLabel.setForeground(new Color(255, 102, 102));
		lblNewLabel.setFont(new Font("Labor Union", Font.PLAIN, 26));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 3;
		gbc_lblNewLabel.gridy = 1;
		frmPocketAtmWallet.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblWeTrustIn = new JLabel("We trust in the way you trust us");
		lblWeTrustIn.setForeground(new Color(255, 102, 102));
		lblWeTrustIn.setFont(new Font("Apple Chancery", Font.PLAIN, 13));
		GridBagConstraints gbc_lblWeTrustIn = new GridBagConstraints();
		gbc_lblWeTrustIn.insets = new Insets(0, 0, 5, 5);
		gbc_lblWeTrustIn.gridx = 3;
		gbc_lblWeTrustIn.gridy = 3;
		frmPocketAtmWallet.getContentPane().add(lblWeTrustIn, gbc_lblWeTrustIn);
		
		Component verticalGlue = Box.createVerticalGlue();
		GridBagConstraints gbc_verticalGlue = new GridBagConstraints();
		gbc_verticalGlue.insets = new Insets(0, 0, 5, 5);
		gbc_verticalGlue.gridx = 2;
		gbc_verticalGlue.gridy = 4;
		frmPocketAtmWallet.getContentPane().add(verticalGlue, gbc_verticalGlue);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Welcome .. !");
		lblNewJgoodiesLabel.setForeground(new Color(255, 51, 102));
		GridBagConstraints gbc_lblNewJgoodiesLabel = new GridBagConstraints();
		gbc_lblNewJgoodiesLabel.gridheight = 2;
		gbc_lblNewJgoodiesLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewJgoodiesLabel.gridx = 3;
		gbc_lblNewJgoodiesLabel.gridy = 7;
		frmPocketAtmWallet.getContentPane().add(lblNewJgoodiesLabel, gbc_lblNewJgoodiesLabel);
		
		JButton btnSignUp = new JButton("Sign Up");
		btnSignUp.setHorizontalAlignment(SwingConstants.TRAILING);
		btnSignUp.setForeground(new Color(204, 204, 0));
		btnSignUp.setBackground(new Color(255, 204, 0));
		btnSignUp.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		GridBagConstraints gbc_btnSignUp = new GridBagConstraints();
		gbc_btnSignUp.insets = new Insets(0, 0, 5, 5);
		gbc_btnSignUp.gridx = 2;
		gbc_btnSignUp.gridy = 12;
		frmPocketAtmWallet.getContentPane().add(btnSignUp, gbc_btnSignUp);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setForeground(new Color(0, 102, 0));
		btnSignIn.setBackground(new Color(51, 204, 51));
		btnSignIn.setFont(new Font("Lucida Grande", Font.PLAIN, 10));
		GridBagConstraints gbc_btnSignIn = new GridBagConstraints();
		gbc_btnSignIn.anchor = GridBagConstraints.SOUTH;
		gbc_btnSignIn.insets = new Insets(0, 0, 5, 5);
		gbc_btnSignIn.gridx = 4;
		gbc_btnSignIn.gridy = 12;
		frmPocketAtmWallet.getContentPane().add(btnSignIn, gbc_btnSignIn);
	}

}
