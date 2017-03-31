package com.library;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginGUI {

	private static final Insets insets = new Insets(0, 0, 0, 0);

	public JPanel drawLogin(){
		Utilities util = new Utilities();
		Data data = new Data();
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		
		//Display Header
		JLabel header = new JLabel("Library Management Login");
			header.setFont(new Font("Arial", Font.BOLD, 24));
			header.setForeground(Color.darkGray);
			util.addComponent(panel, header, 0, 0, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		//First Row
		JLabel un = new JLabel("Username: ");
			util.addComponent(panel, un, 0, 1, 1, 1, GridBagConstraints.EAST, GridBagConstraints.NONE);
		JTextField username = new JTextField(20);
			util.addComponent(panel, username, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.NONE);
		//Second Row
		 JLabel pw = new JLabel("Password: ");
		 	util.addComponent(panel, pw, 0, 2, 1, 1, GridBagConstraints.NORTHEAST, GridBagConstraints.NONE);
		JPasswordField password = new JPasswordField(20);
			util.addComponent(panel, password, 1, 2, 1, 1, GridBagConstraints.NORTHWEST, GridBagConstraints.NONE);
		//Third Row
		JLabel error = new JLabel();
			util.addComponent(panel, error, 0, 3, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.NONE);
		JButton loginButton = new JButton("Login");
			util.addComponent(panel, loginButton, 1, 3, 1, 1, GridBagConstraints.NORTH, GridBagConstraints.NONE);
	
		//Adds logic to button
		loginButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {	
				Librarian lib = data.login(username.getText(), password.getPassword());
				if(lib != null){
					//forward to appropriate GUI?
					LibrarianGUI libGUI = new LibrarianGUI();
					libGUI.initialView(lib);
					
				}else{
					error.setFont(new Font("Arial", Font.BOLD, 15));
					error.setForeground(Color.RED);
					error.setText("Incorrect");
				}}});
		return panel;
	}
}
