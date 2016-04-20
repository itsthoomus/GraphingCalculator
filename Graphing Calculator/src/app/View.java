package app;


import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author 
 *
 */
public class View {
	
	// background and frame
	public JPanel background;
	public JFrame frame;
	public ScreenPanel screenPanel;
	
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
	
		
	}
	
}
