package basicProgramming;

public class Seperate_odd_digits_in_Number {

	//WAP to print all the odd number
	
	public static void main(String[] args) {
		int n = 185646;
		int d = 0;
		while(n!=0)
		{
			d = n%10;
			if(d%2!=0)
			{
			System.out.println(d);
			}
			n = n/10;
		}
	}
}
