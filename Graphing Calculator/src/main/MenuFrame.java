package main;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import scilogic.ScientificCalculator;

public class MenuFrame extends JFrame {
	
	public MenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,  300);
		this.setLayout(null);
		setVisible(true);
		this.setResizable(false);
		this.setTitle("Graphing Calculator");
		
		MenuPanel panel = new MenuPanel();
		panel.setBounds(0, 0, 600, 300);
		panel.setVisible(true);
		add(panel);
		repaint();
	}
	
	class MenuPanel extends JPanel implements ActionListener {
		
		public MenuPanel() {
			JButton sciButton = new JButton("Scientific Mode");
			JButton graphButton = new JButton("Graphing Mode");
			sciButton.setBounds(75, 150, 200, 100);
			sciButton.setActionCommand("sci");
			sciButton.addActionListener(this);
			graphButton.setBounds(350, 150, 200, 100);
			add(sciButton);
			add (graphButton);
		}
		
		
		@Override
		public void paintComponent(Graphics g) {
			Font font = new Font("Impact", Font.BOLD, 65);
			g.setFont(font);
			g.drawString("Graphing Calculator", 35, 65);
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("sci")) {
				ScientificCalculator.createAndShowGUI();
			}
			
		}
	}

	

}
