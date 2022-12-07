package iotMain;

import java.util.Scanner;

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
				System.out.println("Welcome to IOT Test");
				
				while(true) {
					System.out.println("Select Menu");
					System.out.println("1. Car | 2. A/C | 3. Boiler | 4. Security | 5. Exit");
					System.out.print(select);
					myselect = sc.nextInt();
					
					switch (myselect) {
					case 1:
						Car car = new Car();
						System.out.println("Set your car");
						System.out.println("1. Start / Stop Engine | 2. set A/C | 3. Exit");
						System.out.print(select);
						myselect = sc.nextInt();
						if(myselect == 1) {
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
							System.out.println("Set your A/C");
							String acStatus = (car.isAcStatus()) ? "ON" : "OFF";
							System.out.println("ON / OFF : " + acStatus);
							System.out.println("Now Temperature : " + car.getAcTemp());
							System.out.println("1. ON / OFF | 2. Set Temperature | 3. Exit");
							System.out.print(select);
							int ms = sc.nextInt();
							if(ms == 1) {
								if(car.isAcStatus()) {
									car.setAcStatus(false);
								} else {
									car.setAcStatus(true);
								}
							}
							System.out.println("Your Car A/C temperature set in " + acTemp + "`C");
							
						}
						break;
						
					case 2:
						System.out.println("Set your A/C temerature");
						
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
