package app;

/**
 * contains all the data and logic
 * the controller links the values provided by the model to what is shown in the view
 *
 */
public class Model {
	
	public float [] getXValues(){
		float [] result = new float [10000];
		for (int i = -5000; i< 5000;i++){
			result[i+5000] = i/100.0f;
		}
		return result;
		
	}
	
	public float [] getSineYValues(){
		
		float [] result = new float [10000];
		
		for (int i = -5000; i< 5000;i++){
			result[i+5000] = (float) Math.sin(i/100.0f);
		}
		
		return result;
	}
	
	
	
}
		


