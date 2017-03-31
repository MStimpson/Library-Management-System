package com.library;

import javax.swing.JFrame;

public class Main {
	public static JFrame frame;
	public static void main(String args[]){
		frame = new JFrame("Library Manager");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		LoginGUI lg = new LoginGUI();
		frame.add(lg.drawLogin());
		
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
}
