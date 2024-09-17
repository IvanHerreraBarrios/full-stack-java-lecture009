package lecture009;

public class Sort {

	public static void main(String[] args) {
		int[] values = {10,15,95,100,35};
		
		int aux;
		int maximum = values.length / 2;
		for(int i=values.length-1; i > maximum; i--) {
			aux = values[i];
			values[i] = values[values.length - (i+1)];
			values[values.length - i+1] = aux;
		}
		
		for(int value:values) {
			System.out.println(value);
		}
		
	}

}
