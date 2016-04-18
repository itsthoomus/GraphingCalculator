package app;

public class Controller {
	
	private Model model;
	private View view;
	
	public Controller(Model model, View view){
		this.model = model;
		this.view = view;
	}
	
	public void control(){
		
//		view.update();
		
		view.screenPanel.passFunctionCoords(model.getXValues(), model.getSineYValues());
		
	}

}
