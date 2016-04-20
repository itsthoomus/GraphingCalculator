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
	
	private float xTranslation = 0.0f;
	private float yTranslation = 0.0f;
	
	private int panelSize;
	
	private float gridSize = 10.0f;
	
	private Point [] functionPoints;
	private Point [] axisPoints;
	private Point [] axisScalePoints;
	
	private Point [] screenFunctionPoints;
	private Point [] screenAxisPoints;
	private Point [] screenAxisScalePoints;


	
	public ScreenPanel(int x, int y, int panelSize){
		super();
		this.panelSize = panelSize;
		this.setBounds(x, y, panelSize, panelSize);
		
		

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
		
		if (screenFunctionPoints != null){
		
			for (Point p: screenFunctionPoints){
				
				g2.fillRect((int) p.getX(), (int) p.getY(), 1, 1);
				
			}
		}


		// draw x and y axis
		if (screenAxisPoints != null){
			
			g2.drawLine((int) screenAxisPoints[0].getX(), (int) screenAxisPoints[0].getY(), (int) screenAxisPoints[1].getX(), (int) screenAxisPoints[1].getY());
			g2.drawLine((int) screenAxisPoints[2].getX(), (int) screenAxisPoints[2].getY(), (int) screenAxisPoints[3].getX(), (int) screenAxisPoints[3].getY());
		}
		
		// draw scale ticks
		if (screenAxisScalePoints != null){
			for (int i=0; i< screenAxisScalePoints.length; i+=2){
				g2.drawLine((int) screenAxisScalePoints[i].getX(), (int) screenAxisScalePoints[i].getY(), (int) screenAxisScalePoints[i+1].getX(), (int) screenAxisScalePoints[i+1].getY());
			}
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
			
			
			
			int x = Math.round((gridSize/2.0f + (plottables.get(i).getX() - xTranslation))/(gridSize/(float)this.getPanelSize()));
			int y = Math.round((gridSize/2.0f - (plottables.get(i).getY() - yTranslation))/(gridSize/(float)this.getPanelSize()));
			
	
			
			screenPoints[i] = new Point(x,y);
			
			
		}
		
		return screenPoints;

		

	}
	
	
	private Point [] createScreenAxisPoints(Point [] points){
		
		Point [] screenPoints = new Point [points.length];
		
		for (int i =0; i< screenPoints.length;i++){

			int x = Math.round((gridSize/2.0f + (points[i].getX() - xTranslation))/(gridSize/(float)this.getPanelSize()));
			int y = Math.round((gridSize/2.0f - (points[i].getY() - yTranslation))/(gridSize/(float)this.getPanelSize()));
			
	
			
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

		update();
				
	}
	

	/**
	 * Given a factor in the form of a float, this function scales the screen by that factor
	 * @param factor the factor the screen will be scaled by
	 */
	public void scale(float factor){
		this.gridSize = this.gridSize * factor;
	}
	
	/**
	 * given an x-value and a y-value, this function translates the view of screen by that amount
	 * e.g. 3,4 translates the screen up and to the right 3,4 by translating the actual function down and to the left -3, -4
	 * @param x horizontal translation
	 * @param y vertical translation
	 */
	public void translate(float x, float y){
		this.xTranslation+=x;
		this.yTranslation+=y;
	}
	
	
	/**
	 * Call to update the screen after a change.
	 * Updates internal function and axis points as well as screen values.
	 * Also repaints and revalidates.
	 */
	public void update(){
		
		if (functionPoints!= null){
			screenFunctionPoints = createScreenPoints(functionPoints);
		}
		
		axisPoints = new Point[]{
			new Point(-gridSize/2.0f + xTranslation, 0.0f),
			new Point(gridSize/2.0f + xTranslation, 0.0f),
			new Point(0.0f, -gridSize/2.0f  + yTranslation),
			new Point(0.0f, gridSize/2.0f  + yTranslation),
		};
		
		axisScalePoints = new Point[4*((int)gridSize+1)];
		
		for (int i = 0; i<(axisScalePoints.length/2); i+=2){
			axisScalePoints[i] = new Point(xTranslation + i/2-(axisScalePoints.length/8), gridSize/80.0f);
			axisScalePoints[i+1] = new Point(xTranslation + i/2-(axisScalePoints.length/8), -gridSize/80.0f);
		}
		
		for (int i = axisScalePoints.length/2; i<axisScalePoints.length; i+=2){
			axisScalePoints[i] = new Point(gridSize/80.0f, yTranslation + i/2-(axisScalePoints.length/8) - axisScalePoints.length/4);
			axisScalePoints[i+1] = new Point(-gridSize/80.0f, yTranslation + i/2-(axisScalePoints.length/8) - axisScalePoints.length/4);
		}
		
		screenAxisPoints = createScreenAxisPoints(axisPoints);
		screenAxisScalePoints = createScreenAxisPoints(axisScalePoints);
		
		
		repaint();
		revalidate();
		
	}
	
	public int getPanelSize(){
		return panelSize;
	}
	
	
	
	

	
	

}
