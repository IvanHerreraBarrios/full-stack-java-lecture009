package lecture009;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		int[][] matrix2x2 = new int[2][2];
		
		for(int f=0;f<2;f++) {
			for(int c=0;c<2;c++) {
				matrix2x2[f][c] = (int)(Math.random() * (1000 - 0) + 0);
			}
		}
		
		for(int f=0;f<2;f++) {
			for(int c=0;c<2;c++) {
				 System.out.println(f + "-" + c + "-" + matrix2x2[f][c]);
			}
		}
		
		Scanner keyboard = new Scanner(System.in);
		int[][] sales = new int[7][1];
		for(int day=0; day<7;day++) {
			for(int c=0; c < 1; c++) {
				System.out.println("Enter number" + day);
				sales[day][c] = keyboard.nextInt();			
			}
		}
		
		keyboard.close();
		
		for(int day=0; day<7;day++) {
			for(int c=0; c < 1; c++) {
				System.out.println(sales[day][c]);		
			}
		}
	}

}
