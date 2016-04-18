package app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ScreenPanel extends JPanel{
	
	private float xTranslation;
	private float yTranslation;
	
	private int panelSize;
	
	private float gridSize = 10.0f;
	
	private Point [] functionPoints;
	private Point [] axisPoints;
	
	private Point [] screenFunctionPoints;
	private Point [] screenAxisPoints;


	
	public ScreenPanel(int x, int y, int panelSize){
		super();
		this.panelSize = panelSize;
		this.setBounds(x, y, panelSize, panelSize);

		
		update();
	}

	


	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
		// draw stroke
		Graphics2D g2 = (Graphics2D) g;
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		g2.drawRect(0, 0, 279, 279);
		
		// reset stroke
		g2.setStroke(new BasicStroke(1));
		
		// draw function from points
		
		for (Point p: screenFunctionPoints){
			g2.drawOval((int)p.getX(), (int)p.getY(), 1, 1);
		}
		
		
		
		

	}
	
	/**
	 * takes a Point array representing a set of ordered pairs and converts them into a Point array of pixel coordinates
	 * @param points a 2-d Point array carrying the ordered pairs of the function
	 * @return the Point array carrying the actual pixel coordinates to draw
	 */
	private Point [] createScreenPoints(Point [] functionPoints){
		
		ArrayList<Point> plottables = new ArrayList<>();
		
		
		
		
		for (int i =0; i< functionPoints.length;i++){
			
			if ((xTranslation-(gridSize/2.0f)< functionPoints[i].getX()) && (xTranslation+(gridSize/2.0f)> functionPoints[i].getX())){
				if ((yTranslation-(gridSize/2.0f)< functionPoints[i].getY()) && (yTranslation+(gridSize/2.0f)> functionPoints[i].getY())){
					plottables.add(functionPoints[i]);
				}
			}

			
		}
		
		Point [] screenPoints = new Point [plottables.size()];
		
		for (int i =0; i< screenPoints.length;i++){
			
			int x = Math.round((gridSize/2.0f + (plottables.get(i).getX() - xTranslation))/this.getPanelSize());
			int y = Math.round((gridSize/2.0f - (plottables.get(i).getY() - yTranslation))/this.getPanelSize());
			
			screenPoints[i] = new Point(x,y);
			
		}
		
		return screenPoints;

		

	}
	
	/**
	 * takes a set of ordered pairs through 2 arrays, one carrying the x-coordinates and one 
	 * carrying the corresponding y-coordinates
	 * 
	 * passes them over the screen as part of a Point array
	 * 
	 * @param xCoords the x-values of the ordered pairs
	 * @param yCoords the y-values of the ordered pairs
	 */
	public void passFunctionCoords(float [] xCoords, float [] yCoords){
		
		functionPoints = new Point [xCoords.length];
		
		for (int i =0; i< xCoords.length;i++){
			functionPoints[i] = new Point(xCoords[i], yCoords[i]);
		}

				
	}
	

	
	public void scale(float factor){
		this.gridSize = this.gridSize * factor;
	}
	
	public void translate(float x, float y){
		this.xTranslation+=x;
		this.yTranslation+=y;
	}
	
	
	public void update(){
		
		screenFunctionPoints = createScreenPoints(functionPoints);
		
		repaint();
		revalidate();
		
	}
	
	public int getPanelSize(){
		return panelSize;
	}
	
	
	

	
	

}
