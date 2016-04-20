package app;

/**
 * contains all the data and logic
 * the controller links the values provided by the model to what is shown in the view
 *
 */
public class Model {
	
	public float [] getXValues(){
		float [] result = new float [500000];
		for (int i = -250000; i< 250000;i++){
			result[i+250000] = i/1000.0f;
		}
		return result;
		
	}
	
	public float [] getSineYValues(){
		
		float [] result = new float [500000];
		
		for (int i = -250000; i<250000;i++){
//			result[i+50000] = (float) Math.sin(i/1000.0f);
			result[i+250000] = (float) Math.pow((i/1000.0f),2);
		}
		
		return result;
	}
	
	
	
}
		


