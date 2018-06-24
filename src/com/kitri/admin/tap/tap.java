package com.kitri.admin.tap;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

public class tap extends JFrame {

	private JPanel contentPane;
	private JPanel bread;
	private JPanel cake;
	private JPanel drink;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tap frame = new tap();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tap() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 101, 725, 334);
		contentPane.add(panel);
		
		JTabbedPane tab = new JTabbedPane(JTabbedPane.TOP);
		panel.add(tab);
//		
//		tab.addTab("»§",bread);
//		bread.setLayout(new BorderLayout(0, 0));
//		tab.addTab("ÄÉŸå",cake);
//		tab.addTab("À½·á",drink);
		
		
	}
}
