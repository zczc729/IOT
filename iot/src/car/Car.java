package car;


public class Car {
	boolean engineStatus = false;
	double acTemp = 24.0;
	boolean acStatus = false;
	
	
	
	
	public boolean isAcStatus() {
		return acStatus;
	}

	public void setAcStatus(boolean acStatus) {
		this.acStatus = acStatus;
	}

	public boolean isEngineStatus() {
		return engineStatus;
	}

	public void setEngineStatus(boolean engineStatus) {
		this.engineStatus = engineStatus;
	}

	public double getAcTemp() {
		return acTemp;
	}

	public void setAcTemp(double acTemp) {
		this.acTemp = acTemp;
	}

	// Start/Stop Engine
	public void startEngine(int choice) {
		if(choice == 1) {
			if(engineStatus) {
				System.out.println("Your Car is alreay started");
			} else {
				System.out.println("Your Car is started");
				engineStatus = true;
			}
		} else {
			if(!engineStatus) {
				System.out.println("Your Car is already stoped");
			} else {
				System.out.println("Your Car is stoped");
				engineStatus = false;
			}
		}
	}

	// Set your A/C temperature
	public void setAC(double choice) {
		if(!acStatus) {
			acStatus = true;
		}
		acTemp = choice;
	}
	
	
}
