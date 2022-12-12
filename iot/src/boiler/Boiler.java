package boiler;

import java.util.Scanner;

public class Boiler {
	double boTemp = 20.0;
	boolean boStatus = false;
	String boMode = "Boiler";
	
	

	public double getBoTemp() {
		return boTemp;
	}

	public void setBoTemp(double boTemp) {
		System.out.println("Your boiler temperature set in " + boTemp + "' C");
		this.boTemp = boTemp;
	}

	public boolean isBoStatus() {
		return boStatus;
	}

	public void setBoStatus(boolean boStatus) {
		if(isBoStatus()) {
			System.out.println("Your boiler is off");
		} else {
			System.out.println("Your boiler is on");
		}
		this.boStatus = boStatus;
	}

	public String getBoMode() {
		return boMode;
	}

	public void setBoMode(String boMode) {
		System.out.println("Your boiler mode set in " + boMode);
		this.boMode = boMode;
	}
	
	

	public void boIOT() {
		Scanner sc = new Scanner(System.in);
		String select = "Select Menu : ";
		
		while(true) {
			
			System.out.println("Set your Boiler");
			String bost = (isBoStatus()) ? "ON" : "OFF";
			
			System.out.println("ON / OFF : " + bost);
			if(isBoStatus()) {
				System.out.println("Temperature : " + getBoTemp());
				System.out.println("Mode : " + getBoMode());
			}
			
			System.out.println("1. ON / OFF | 2. Set Temperature | 3. Set Mode | 4. Exit");
			System.out.print(select);
			int myselect = sc.nextInt();
			
			switch (myselect) {
			case 1:
				if(!isBoStatus()) {
					setBoStatus(true);
				} else {
					setBoStatus(false);
				}
				break;
				
			case 2:
				System.out.println("Set your boiler Temperature");
				System.out.print("Set in : ");
				double dbtmp = sc.nextDouble();
				
				if(dbtmp < 18.0 || 28.0 < dbtmp) {
					System.out.println("Set temperature in 18.0 ~ 28.0");
				} else {
					setBoTemp(dbtmp);
				}
				break;
				
			case 3: 
				System.out.println("Set your boiler mode");
				System.out.println("1. Boiler | 2. Go Out | 3. Exit");
				System.out.print(select);
				int ms = sc.nextInt();
				
				switch (ms) {
				case 1:
					boMode = "Boiler";
					break;
					
				case 2: 
					boMode = "Go Out";
					break;
					
				case 3:
					break;
				}
				setBoMode(boMode);
				break;

			default:
				break;
			}
			break;
		}
		
	}

}
