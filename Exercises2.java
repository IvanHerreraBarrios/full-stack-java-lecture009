package lecture009;

import java.util.Scanner;

public class Exercises2 {

	public static void main(String[] args) {
		System.out.println("Enter the number of items");
		Scanner keyboard = new Scanner(System.in);
		int quantity = keyboard.nextInt();	
		
		if(quantity > 0) {
			int[] days = new int [quantity];
			
			for(int i=0; i<quantity; i++) {
				System.out.println("Enter the element: " + i);
				days[i] = keyboard.nextInt();
			}
			int largest = 0;
			int pLargest = 0;
			int minor;
			int pMinor;
			
			if(days.length > 0) {
				largest = days[0];
				pLargest = 0;
				
				minor = days[0];
				pMinor=0;
				for(int i=1; i < days.length; i++) {
					if(days[i] > largest) {
						largest = days[i];
						pLargest = i;
					}
					if(days[i] < minor) {
						minor = days[i];
						pMinor = i;
					}
				}
				
				System.out.println(largest +"-" + pLargest);
				System.out.println(minor + "-" + pMinor);
			} else {
				System.out.println("Empty");
			}
			
		}
		keyboard.close();
	}
	

}
