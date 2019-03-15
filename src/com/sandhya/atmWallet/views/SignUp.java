package com.sandhya.atmWallet.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sandhya.atmWallet.dbo.decl.IDBOATM;
import com.sandhya.atmWallet.dbo.decl.IDBOUser;
import com.sandhya.atmWallet.dbo.impl.DBOATM;
import com.sandhya.atmWallet.dbo.impl.DBOUser;
import com.sandhya.atmWallet.models.decl.IATM;
import com.sandhya.atmWallet.models.decl.IUser;
import com.sandhya.atmWallet.models.impl.ATM;
import com.sandhya.atmWallet.models.impl.User;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private static SignUp SIGN_UP = null;
	private JTextField txtUsername;
	private JTextField txtFirstName;
	private JTable table;
	private JTable table_1;
	private JTextField txtLastName;
	private JLabel lblEmailId;
	private JTextField txtEmailId;
	private JLabel txtMobileNumber;
	private JTextField txtMobile;
	private JLabel lblCity;
	private JTextField txtCity;
	private JLabel lblAtmNumer;
	private JTextField txtAtmNumber;
	private JTextField txtPinNumber;
	private JLabel lblPinNumber;
	private JLabel lblErr;

	/**
	 * Create the frame.
	 */
	private SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 200, 450, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPleaseSignHere = new JLabel("Please Sign here");
		lblPleaseSignHere.setBounds(181, 6, 112, 16);
		contentPane.add(lblPleaseSignHere);
		
		txtUsername = new JTextField();
		txtUsername.setToolTipText("Enter the username");
		txtUsername.setBounds(134, 34, 282, 26);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBackground(new Color(102, 204, 204));
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setBounds(21, 39, 82, 16);
		contentPane.add(lblUsername);
		
		txtFirstName = new JTextField();
		txtFirstName.setToolTipText("Enter the firstname");
		txtFirstName.setBounds(132, 69, 282, 26);
		contentPane.add(txtFirstName);
		txtFirstName.setColumns(10);
		
		JLabel lblFirstname = new JLabel("First Name");
		lblFirstname.setBounds(21, 74, 77, 16);
		contentPane.add(lblFirstname);
		
		table = new JTable();
		table.setBounds(346, 75, 1, 1);
		contentPane.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(346, 113, 1, 1);
		contentPane.add(table_1);
		
		JLabel lblLastname = new JLabel("Last Name");
		lblLastname.setBounds(21, 112, 77, 16);
		contentPane.add(lblLastname);
		
		txtLastName = new JTextField();
		txtLastName.setToolTipText("Enter the firstname");
		txtLastName.setColumns(10);
		txtLastName.setBounds(132, 107, 282, 26);
		contentPane.add(txtLastName);
		
		lblEmailId = new JLabel("Email ID");
		lblEmailId.setForeground(Color.BLACK);
		lblEmailId.setBackground(new Color(102, 204, 204));
		lblEmailId.setBounds(21, 145, 82, 16);
		contentPane.add(lblEmailId);
		
		txtEmailId = new JTextField();
		txtEmailId.setToolTipText("Enter the username");
		txtEmailId.setColumns(10);
		txtEmailId.setBounds(134, 140, 282, 26);
		contentPane.add(txtEmailId);
		
		txtMobileNumber = new JLabel("Moblie Number");
		txtMobileNumber.setBounds(22, 180, 98, 16);
		contentPane.add(txtMobileNumber);
		
		txtMobile = new JTextField();
		txtMobile.setToolTipText("Enter the firstname");
		txtMobile.setColumns(10);
		txtMobile.setBounds(132, 175, 282, 26);
		contentPane.add(txtMobile);
		
		lblCity = new JLabel("City");
		lblCity.setBounds(21, 218, 77, 16);
		contentPane.add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setToolTipText("Enter the firstname");
		txtCity.setColumns(10);
		txtCity.setBounds(132, 213, 282, 26);
		contentPane.add(txtCity);
		
		lblAtmNumer = new JLabel("Atm Number");
		lblAtmNumer.setBounds(22, 251, 98, 16);
		contentPane.add(lblAtmNumer);
		
		txtAtmNumber = new JTextField();
		txtAtmNumber.setToolTipText("Enter the firstname");
		txtAtmNumber.setColumns(10);
		txtAtmNumber.setBounds(132, 246, 282, 26);
		contentPane.add(txtAtmNumber);
		
		txtPinNumber = new JTextField();
		txtPinNumber.setToolTipText("Enter the firstname");
		txtPinNumber.setColumns(10);
		txtPinNumber.setBounds(132, 284, 282, 26);
		contentPane.add(txtPinNumber);
		
		lblPinNumber = new JLabel("Pin Number");
		lblPinNumber.setBounds(21, 289, 77, 16);
		contentPane.add(lblPinNumber);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(327, 343, 117, 29);
		contentPane.add(btnCancel);
		
		JButton btnSignup = new JButton("Sign Up");
		btnSignup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				IUser user = new User();
				user.setUsername(txtUsername.getText());
				user.setCity(txtCity.getText());
				user.setFirstName(txtFirstName.getText());	
				user.setLastName(txtLastName.getText());
				user.setMobileNumber(txtMobile.getText());
				user.setEmail(txtEmailId.getText());
				
				IDBOUser userDbController = new DBOUser();
				
				boolean result = userDbController.addUser(user);
				
				if(result) {
					System.out.println("Success User");
					
				}
				else {
					lblErr.setText("OOPS!!! Something's WRONG.");
					return;
				}
				
				user.setUserId(userDbController.getUserId(user.getUsername()));				
				
				userDbController.closeConnection();
				IATM atm = new ATM();
				//One one Relationship between ATM and USER
				atm.setUserId(user.getUserId());
				
				//Assign Properties to ATM
				atm.setAtmNumber(txtAtmNumber.getText());
				atm.setPin(Integer.parseInt(txtPinNumber.getText()));
				IDBOATM atmDBOController = new DBOATM();
				result = atmDBOController.setATM(atm);	
				atmDBOController.closeConnection();
				if(result) {
					System.out.println("Success ATM");
					
				}
				else {
					lblErr.setText("OOPS!!! Something's WRONG.");
					return;
				}
		
			}
		});
		btnSignup.setBounds(6, 343, 117, 29);
		contentPane.add(btnSignup);
		
		lblErr = new JLabel("");
		lblErr.setForeground(new Color(153, 0, 0));
		lblErr.setBounds(21, 315, 395, 26);
		contentPane.add(lblErr);
	}

	public static SignUp getInstance() {
		if (SIGN_UP == null)
			SIGN_UP = new SignUp();
		return SIGN_UP;
	}
}
