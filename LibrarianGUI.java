package com.library;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LibrarianGUI {
	private static final Insets insets = new Insets(0, 0, 0, 0);
	public void initialView(Librarian lib) {
		
		Utilities util = new Utilities();
		
		Main.frame.getContentPane().removeAll();
		Main.frame.revalidate();
		Main.frame.repaint();
		
		JPanel panel = new JPanel();
		//panel.setLayout(new GridLayout(2,3));
		panel.setLayout(new GridBagLayout());
//change back to gridlayout
		
		JLabel header = new JLabel("Librarian");
		header.setFont(new Font("Arial", Font.BOLD, 24));
			util.addComponent(panel, header, 0, 0, 2, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		JLabel name = new JLabel("Hello, "+lib.getName());
			util.addComponent(panel, name, 1, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		JButton addViewButton = new JButton("Add/View Books");
			util.addComponent(panel, addViewButton, 2, 0, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		JButton issueBookButton = new JButton("Issue Books");
			util.addComponent(panel, issueBookButton, 2, 1, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		JButton returnBookButton = new JButton("Return Books");
			util.addComponent(panel, returnBookButton, 2, 2, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		JButton logoutButton = new JButton("Logout");
			util.addComponent(panel, logoutButton, 2, 3, 1, 1, GridBagConstraints.CENTER, GridBagConstraints.NONE);
		
		panel.add(header);
		panel.add(name);
		panel.add(addViewButton);
		panel.add(issueBookButton);
		panel.add(returnBookButton);
		panel.add(logoutButton);
		
		Main.frame.add(panel);
		Main.frame.revalidate();
		Main.frame.repaint();
	}
}
