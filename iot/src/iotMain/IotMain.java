package iotMain;

import java.util.Scanner;

import Home.AirConditional;
import car.Car;

public class IotMain {

	public static void main(String[] args) {
		boolean status = false;
		boolean inside = false;
		String select = "Select Menu : ";
		int myselect;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert Menu? : 1. Y / 2. N");
		System.out.print(select);
		int insertMenu = sc.nextInt();
		if(insertMenu == 1) {
			status = true;
			System.out.println("Where are you? : 1. IN / 2. OUT ");
			System.out.print(select);
			int location = sc.nextInt();
			if(location == 1) {
				inside = true;
			}
		}
		
		if(status == true) {
			if (inside) {
				Car car = new Car();
				AirConditional ac = new AirConditional();
				
				
				System.out.println("Welcome to IOT Test");
				
				while(true) {
					System.out.println("Select Menu");
					System.out.println("1. Car | 2. A/C | 3. Boiler | 4. Security | 5. Exit");
					System.out.print(select);
					myselect = sc.nextInt();
					
					switch (myselect) {
					case 1:	// Set about your Car
						System.out.println("Set your car");
						System.out.println("1. Start / Stop Engine | 2. set A/C | 3. Exit");
						System.out.print(select);
						myselect = sc.nextInt();
						if(myselect == 1) {
							// Set Engine
							System.out.println("1. Start Engine | 2. Stop Engine | 3. Exit");
							System.out.print(select);
							int ms = sc.nextInt();
							if(ms == 3) {
								break;
							} else {
								if(ms == 1 || ms == 2) {
									car.startEngine(ms);
								} else {
								}
							}
						} else if(myselect == 2) {
							// Set A/C
							System.out.println("Set your A/C");
							String acStatus = (car.isAcStatus()) ? "ON" : "OFF";
							System.out.println("ON / OFF : " + acStatus);
							System.out.println("Now Temperature : " + car.getAcTemp());
							System.out.println("1. ON / OFF | 2. Set Temperature | 3. Exit");
							System.out.print(select);
							int ms = sc.nextInt();
							if(ms == 1) { // Set A/C ON / OFF
								if(car.isAcStatus()) {
									car.setAcStatus(false);
								} else {
									car.setAcStatus(true);
								}
							} else if(ms == 2) { // Set A/C Temperature
								System.out.print("Set A/C Temperature in : ");
								double actmp = sc.nextDouble();
								if(car.isAcStatus()) {
									car.setAcTemp(actmp);
								} else {
									car.setAcStatus(true);
									car.setAcTemp(actmp);
								}
							}
						}
						break;
						
					case 2:
						System.out.println("Set your A/C");
						String acStatus = (ac.isH_acStatus()) ? "ON" : "OFF";
						System.out.println("ON / OFF : " + acStatus);
						if(ac.isH_acStatus()) {
							System.out.println("Wind Power : " + ac.getWindpower());
							if(ac.getAcmode() != null) {
								System.out.println("A/C Mode : " + ac.getAcmode());
							}
						}
						System.out.println("Now Temperature : " + ac.getH_actmp());
						System.out.println("1. ON / OFF | 2. Set Temperature | 3. Set Mode | 4. Set Wind Power | 5. Exit");
						System.out.print(select);
						int ms = sc.nextInt();
						switch (ms) {
						case 1:
							if(ac.isH_acStatus()) {
								ac.setH_acStatus(false);
							} else {
								ac.setH_acStatus(true);
							}
							break;
						
						case 2:
							System.out.print("Set A/C Temperature in : ");
							double actmp = sc.nextDouble();
							if(ac.isH_acStatus()) {
								ac.setH_actmp(actmp);
							} else {
								ac.setH_acStatus(true);;
								ac.setH_actmp(actmp);
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
								ac.setAcmode("A/C");
								ac.setH_actmp(20.0);
								break;
								
							case 2:
								System.out.println("Set Heater Mode");
								ac.setAcmode("Heater");
								ac.setH_actmp(26.0);
								break;
								
							case 3:
								System.out.println("Set Air Clean Mode");
								ac.setAcmode("Air Clean");
								ac.setAirclean(true);
								break;
								
							case 4:
								break;
							}
							break;
							
						case 4:
							System.out.println("Set Wind Power");
							if(ac.isH_acStatus()) {
								System.out.println("Now : " + ac.getWindpower());
								System.out.println("Set Wind Power in 1 ~ 5");
								System.out.println(select);
								int wp = sc.nextInt();
								
								if(1 < wp && wp < 5) {
									ac.setWindpower(wp);
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

					case 5:
						break;
						
					default:
						break;
					}
					
					
				}
			} else {
				while(true) {
					
				}
			}
			
		}

	}

}
