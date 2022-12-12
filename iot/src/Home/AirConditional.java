package Home;

import java.util.Scanner;

public class AirConditional {
	boolean h_acStatus = false;
	double h_actmp = 24.0;
	boolean airclean = false;
	int windpower = 1;
	String acmode;
	public boolean isH_acStatus() {
		return h_acStatus;
	}
	public void setH_acStatus(boolean h_acStatus) {
		if(h_acStatus) {
			System.out.println("Your A/C is on");
		} else {
			System.out.println("Your A/C is off");
		}
		this.h_acStatus = h_acStatus;
	}
	public double getH_actmp() {
		return h_actmp;
	}
	public void setH_actmp(double h_actmp) {
		if(18.0 < h_actmp && h_actmp < 28.0) {
			System.out.println("Your A/C temerature set in " + h_actmp + "' C");
			this.h_actmp = h_actmp;
		} else {
			System.out.println("Try to set temperature in 18.0` C ~ 28.0` C");
		}
	}
	public boolean isAirclean() {
		return airclean;
	}
	public void setAirclean(boolean airclean) {
		this.airclean = airclean;
	}
	public int getWindpower() {
		return windpower;
	}
	public void setWindpower(int windpower) {
		System.out.println("Wind Power has been set in " + windpower + " level");
		this.windpower = windpower;
	}
	public String getAcmode() {
		return acmode;
	}
	public void setAcmode(String acmode) {
		this.acmode = acmode;
	}
	
	public void acIOT() {
		Scanner sc = new Scanner(System.in);
		String select = "Select Menu : ";
		
		while(true) {
			
			System.out.println("Set your A/C");
			String acStatus = (isH_acStatus()) ? "ON" : "OFF";
			System.out.println("ON / OFF : " + acStatus);
			if(isH_acStatus()) {
				System.out.println("Wind Power : " + getWindpower());
				if(getAcmode() != null) {
					System.out.println("A/C Mode : " + getAcmode());
				}
			}
			System.out.println("Now Temperature : " + getH_actmp());
			System.out.println("1. ON / OFF | 2. Set Temperature | 3. Set Mode | 4. Set Wind Power | 5. Exit");
			System.out.print(select);
			int ms = sc.nextInt();
			switch (ms) {
			case 1:
				if(isH_acStatus()) {
					setH_acStatus(false);
				} else {
					setH_acStatus(true);
				}
				break;
			
			case 2:
				System.out.print("Set A/C Temperature in : ");
				double actmp = sc.nextDouble();
				if(isH_acStatus()) {
					setH_actmp(actmp);
				} else {
					setH_acStatus(true);;
					setH_actmp(actmp);
				}
				break;
				
			case 3:
				System.out.println("Set Mode");
				System.out.println("1. A/C Mode | 2. Heater Mode | 3. Air Clean Mode | 4. Exit");
				System.out.print(select);
				int msd = sc.nextInt();
				switch (msd) {
				case 1:
					System.out.println("Set A/C Mode");
					setAcmode("A/C");
					setH_actmp(20.0);
					break;
					
				case 2:
					System.out.println("Set Heater Mode");
					setAcmode("Heater");
					setH_actmp(26.0);
					break;
					
				case 3:
					System.out.println("Set Air Clean Mode");
					setAcmode("Air Clean");
					setAirclean(true);
					break;
					
				case 4:
					break;
				}
				break;
				
			case 4:
				System.out.println("Set Wind Power");
				if(isH_acStatus()) {
					System.out.println("Now : " + getWindpower());
					System.out.println("Set Wind Power in 1 ~ 5");
					System.out.print(select);
					int wp = sc.nextInt();
					
					if(1 < wp && wp < 5) {
						setWindpower(wp);
					} else {
						System.out.println("Please check your set and try again");
					}
				} else {
					System.out.println("Your A/C is off. Please turn on the A/C and try again");
				}
				break;
	
			case 5:
				break;
			}
			break;
		}
	}

}
