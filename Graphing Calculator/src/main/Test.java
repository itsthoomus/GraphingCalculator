package main;

import app.Controller;
import app.Model;
import app.View;

public class Test {
	public static void main(String args[]) {
		View view = new View();
		view.update();
		Model model = new Model();
		Controller controller = new Controller(model, view);
		controller.control();
		
	}
}
