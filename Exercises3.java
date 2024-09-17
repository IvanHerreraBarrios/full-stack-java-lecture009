package lecture009;

public class Exercises3 {

	public static void main(String[] args) {
		int[] vector = {10, 20, 5, 15, 30, 20};
		int total = 0;
		int largest;
		int cont=0;
		
		if(vector.length > 0) {
			largest = vector[0];
			for(int i=0; i<vector.length;i++) {
				System.out.println(i + "-" + vector[i]);
			}
			for(int i=0; i<vector.length;i++) {
				if(i%2!=0) {
					System.out.println(vector[i]);
				}
			}
			for(int i=0; i<vector.length;i++) {
				total+=vector[i];
				if(vector[i] > largest) {
					largest = vector[i];
				}
				if(vector[i] == 20) {
					cont++;
				}
			}
			System.out.println(total);
			System.out.println(largest);
			System.out.println("20-" + cont);
		}else {
			System.out.println("Empty");
		}
	}

}
