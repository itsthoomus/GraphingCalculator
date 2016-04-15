package app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Screen extends JPanel{
	
	private float scaleFactor;
	private float xTranslation;
	private float yTranslation;
	
	private float [] [] orderedPairs;

	
	public Screen(int x, int y, int width, int height){
		super();
		this.setBounds(x, y, width, height);
//		this.setBackground(Color.WHITE);
	}

	


	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
//		 draw stroke
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		g2.drawRect(1, 1, 283, 283);
		
		g2.setStroke(new BasicStroke(1));
		
		
		

	}
	
	private int [] toScreenCoords(float [] [] coords){
		return null;
	}
	
	public void passFunctionCoords(float [] xCoords, float [] yCoords){
		
	}
	

	
	public void scale(float factor){
		this.scaleFactor = this.scaleFactor * factor;
	}
	
	public void translate(float x, float y){
		this.xTranslation+=x;
		this.yTranslation+=y;
	}
	
	public void update(){
		repaint();
		revalidate();
		
	}
	
	
	

	
	

}
