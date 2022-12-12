package iotMain;

import java.util.Scanner;

import Home.AirConditional;
import boiler.Boiler;
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
				Boiler bo = new Boiler();
				
				
				System.out.println("Welcome to IOT Test");
				
				while(true) {
					System.out.println("Select Menu");
					System.out.println("1. Car | 2. A/C | 3. Boiler | 4. Security | 5. Exit");
					System.out.print(select);
					myselect = sc.nextInt();
					
					switch (myselect) {
					case 1:	// Set about your Car
						car.carIOT();
						break;
						
					case 2: // Set about your A/C in home
						ac.acIOT();
						break;
						
					case 3:
						bo.boIOT();
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
