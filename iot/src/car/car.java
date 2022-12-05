package car;


public class car {
	boolean engineStatus = false;
	double acTemp = 20.0;
	
	
	// Start/Stop Engine
	public void startEngine(int choice) {
		if(choice == 1) {
			engineStatus = true;
		} else {
			engineStatus = false;
		}
	}

	// Set your A/C temperature
	public void setAC(double choice) {
		acTemp = choice;
	}
	
	
}
