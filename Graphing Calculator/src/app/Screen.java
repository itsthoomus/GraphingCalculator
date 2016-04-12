package app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class Screen extends JPanel{
	
	private float scaleFactor;
	private float xTranslation;
	private float yTranslation;
	
	public Screen(int x, int y, int width, int height){
		super();
		this.setBounds(x, y, width, height);
		this.setBackground(Color.WHITE);
	}



	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		// draw stroke
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
	}
	

}
