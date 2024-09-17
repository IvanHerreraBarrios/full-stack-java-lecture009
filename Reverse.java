package lecture009;

public class Reverse {

	public static void main(String[] args) {
		int[] values = {10,15,95,100,35};
		int[] copy;
		
		copy = new int[values.length];
		for(int i=0;i<values.length;i++) {
			copy[i] = values[i];
		}
		
		for(int aux: copy) {
			System.out.println(aux);
		}
		
	}

}
