package app;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicArrowButton;

/**
 * This class handles all the graphical elements of the program, containing all functions used to display things on the screen.
 * The controller links this with the underlying logic from the model.
 * @author alexbie
 */
public class View {
	
	// background and frame
	public JPanel background;
	public JFrame frame;
	public ScreenPanel screenPanel;
	
	//panel to hold buttons
	public JPanel movementButtons;
	
	//buttons for moving, tracing, and zooming\
	public JButton leftButton;
	public JButton upButton;
	public JButton rightButton;
	public JButton downButton;
	
	public JButton traceMoveToggleButton;
	public JButton zooomInButton;
	public JButton zoomOutButton;
	
	
	public View(){
		
		init();
	}
	
	private void init(){
		//create the frame
		frame = new JFrame("GDC");
		frame.setSize(300, 680);
		frame.setLayout(null);
		
		
		//set some default settings
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setResizable(false);
		
		
		//add components
		addComponents();

		update();
	}

	public void update() {
		frame.validate();
		frame.repaint();
		
	}
	
	// add all the components including the dice, buttons, and chart + labels
	private void addComponents() {
		
		
		screenPanel = new ScreenPanel(7,7,280);
		frame.add(screenPanel);
		
		movementButtons = new JPanel();
		movementButtons.setBounds(7, 290, 280, 50);;
		movementButtons.setBackground(Color.BLACK);
		frame.add(movementButtons);
		
		upButton = new JButton(new ImageIcon("res/up-arrow.png"));
		upButton.setSize(5, 5);
		upButton.setBounds(0, 0, 10, 10);
		movementButtons.add(upButton);
		
		
	
		
	}
	
}
