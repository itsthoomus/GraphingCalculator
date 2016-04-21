package app;

/**
 * connects the logic of the program with what is visible
 * creates instances of the model (containing the logic) and the view (display code)
 * 
 * @author alexbie
 *
 */
public class Controller {
	
	private Model model;
	private View view;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}
	
	public void control(){
		
		view.screenPanel.passFunctionCoords(model.getXValues(), model.getSineYValues());
		
	}

}
