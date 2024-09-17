package lecture009;

public class Random {

	public static void main(String[] args) {
		int[] numbers = {10,10,20,30};
		numbers = new int[10];
		
		numbers[0] = 10;
		//numbers.length;
		
		//numbers.length - 1;
		
		for(int i=0; i < 100; i++) {
			numbers[i] =i;
		}
		
		int cont = 6;
		int[] aux = new int[6];
		while(cont > 0) {
			int idx = (int)(Math.random() * (99-0) + 0);
			aux[aux.length - cont] = numbers[idx];
			cont--;
		}
		
		for(int value: aux) {
			System.out.println(value);
		}
	}

}
