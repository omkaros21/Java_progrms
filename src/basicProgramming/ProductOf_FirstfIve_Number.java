package basicProgramming;

public class ProductOf_FirstfIve_Number {

	//WAP to find product of first five no
	
		public static void main(String[] args) {
			int product = 1;
			for (int i = 1; i <= 5; i++) {
				product = product * i;
			}
			System.out.println(product);
		}
	
}
