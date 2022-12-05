package iotMain;

import java.util.Scanner;

import car.car;

public class iotMain {

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
			if (inside == true) {
				System.out.println("Welcome to IOT Test");
				
				while(true) {
					System.out.println("Select Menu");
					System.out.println("1. Car | 2. A/C | 3. Boiler | 4. Security");
					myselect = sc.nextInt();
					
					switch (myselect) {
					case 1:
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
