package lecture009;

public class Bonus {

	public static void main(String[] args) {
		double[] billing = {155.75, 12567.80, 200.98, 35500, 15780.50, 18600.34};
		
		double[] quarter = new double [4];
		
		int j=0;
		int count=0;
		double acumulator=0;
		for(int i=0; i<billing.length;i++) {
			if(count / 3 == 1) {
				quarter[j] = acumulator;
				j++;
				acumulator=billing[i];
				count=1;
			}else {
				acumulator += billing[i];
				count++;
			}
		}
		
		quarter[j] = acumulator;
		
		for(double aux:quarter) {
			System.out.println(aux);
		}
	}

}
