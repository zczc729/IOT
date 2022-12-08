package car;


public class Car {
	boolean engineStatus = false;
	double acTemp = 24.0;
	boolean acStatus = false;
	
	
	
	
	public boolean isAcStatus() {
		return acStatus;
	}

	public void setAcStatus(boolean acStatus) {
		if(acStatus) {
			System.out.println("Your car A/C is stared");
		} else {
			System.out.println("Your car A/C is stoped");
		}
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

	
	
}
