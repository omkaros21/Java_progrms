package basicProgramming;

public class FindThePowerOfNumber {

	//WAP to find the power of number
	

		public static void main(String[] args) {
			int n = 3;
			int p = 2;
			int res = 1;
			for(int i = 1; i<=p; i++)
			{
				res = res*n;
			}
			System.out.println(res);
		}
	
}
