package car;

import java.util.Scanner;

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
	
	public void carIOT() {
		Scanner sc = new Scanner(System.in);
		String select = "Select Menu : ";
		
		while(true) {
			
			System.out.println("Set your car");
			System.out.println("1. Start / Stop Engine | 2. set A/C | 3. Exit");
			System.out.print(select);
			int myselect = sc.nextInt();
			if(myselect == 1) {
				// Set Engine
				System.out.println("1. Start Engine | 2. Stop Engine | 3. Exit");
				System.out.print(select);
				int ms = sc.nextInt();
				if(ms == 3) {
					break;
				} else {
					if(ms == 1 || ms == 2) {
						startEngine(ms);
					} else {
					}
				}
			} else if(myselect == 2) {
				// Set A/C
				System.out.println("Set your A/C");
				String acStatus = (isAcStatus()) ? "ON" : "OFF";
				System.out.println("ON / OFF : " + acStatus);
				System.out.println("Now Temperature : " + getAcTemp());
				System.out.println("1. ON / OFF | 2. Set Temperature | 3. Exit");
				System.out.print(select);
				int ms = sc.nextInt();
				if(ms == 1) { // Set A/C ON / OFF
					if(isAcStatus()) {
						setAcStatus(false);
					} else {
						setAcStatus(true);
					}
				} else if(ms == 2) { // Set A/C Temperature
					System.out.print("Set A/C Temperature in : ");
					double actmp = sc.nextDouble();
					if(isAcStatus()) {
						setAcTemp(actmp);
					} else {
						setAcStatus(true);
						setAcTemp(actmp);
					}
				}
			} else if(myselect == 3) {
				break;
			}
		}
	}

	
	
}
