package app;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Screen extends JPanel{
	
	private float xTranslation;
	private float yTranslation;
	
	private float gridSize = 10.0f;
	
	private float [] functionCoordinateXValues;
	private float [] functionCoordinateYValues;
	
	private int [] [] screenFunctionCoordinates;
	
	private float [] axisCoordinateXValues;
	private float [] axisCoordinateYValues;
	
	private int [] [] screenAxisCoordinates;


	
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
		g2.drawRect(0, 0, 279, 279);
		
		g2.setStroke(new BasicStroke(1));
		
		
		

	}
	
	/**
	 * takes 2 arrays representing a set of ordered pairs and converts them into a 2d integer array of pixel coordinates
	 * @param coords a 2-d float array carrying the ordered pairs of the function
	 * @return the 2-d integer array carrying the actual pixel coordinates to draw
	 */
	private int [] [] createScreenCoords(float [] xCoords, float [] yCoords){
		
		int [] [] screenCoords = new int [2] [xCoords.length];
		
		for (int i =0; i< screenCoords[0].length;i++){
			
			if ((xTranslation-(gridSize/2.0f))< xCoords[i])&& )
			
			
			*(280.0 /this.gridSize)
		}
		
		
		
		
		
		return screenCoords;
	}
	
	/**
	 * takes a set of ordered pairs through 2 arrays, one carrying the x-coordinates and one 
	 * carrying the corresponding y-coordinates
	 * 
	 * @param xCoords the x-values of the ordered pairs
	 * @param yCoords the y-values of the ordered pairs
	 */
	public void passFunctionCoords(float [] xCoords, float [] yCoords){
		
		this.functionCoordinateXValues = xCoords;
		this.functionCoordinateYValues = yCoords;
				
	}
	

	
	public void scale(float factor){
		this.gridSize = this.gridSize * factor;
	}
	
	public void translate(float x, float y){
		this.xTranslation+=x;
		this.yTranslation+=y;
	}
	
	/**
	 * takes an arraylist of integers and converts it into a regular integer array
	 * @param list arraylist of integers
	 * @return the equivalent integer array
	 */
	private int[] createIntegerArray(ArrayList<Integer> list){
		int [] result = new int [list.size()];
		
		for (int i =0; i< list.size(); i++){
			result[i] = list.get(i);
		}
		
		return result;
	}
	
	public void update(){
		
		screenFunctionCoordinates = createScreenCoords(functionCoordinateXValues, functionCoordinateYValues);
		
		
		
		repaint();
		revalidate();
		
	}
	
	
	

	
	

}
