package basicProgramming;

public class Count {

	//WAP to find count of digit in the number
	

		public static void main(String[] args) {
			int n = 12345;
			int count = 0;
			while(n!=0)
			{
				count++;
				n = n/10;
			}
			System.out.println(count);
		}
	
}
