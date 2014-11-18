package com.attilax.seo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.birosoft.liquid.LiquidLookAndFeel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class sw2 {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		
	     UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");  
	     LiquidLookAndFeel.setLiquidDecorations(true); 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sw2 window = new sw2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sw2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 778, 441);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 752, 393);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblUrl = new JLabel("url");
		lblUrl.setBounds(23, 21, 18, 15);
		panel.add(lblUrl);
		
		textField = new JTextField();
		textField.setBounds(78, 21, 570, 21);
		panel.add(textField);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "ÎÄ×Ö", "±êÌâ", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setBounds(649, 20, 93, 23);
		panel.add(btnNewButton);
		
		table = new JTable();
		table.setBounds(36, 353, 650, -243);
		panel.add(table);
		 
		
		 
	}
}
