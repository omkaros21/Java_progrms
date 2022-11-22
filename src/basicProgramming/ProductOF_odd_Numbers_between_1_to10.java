package basicProgramming;

public class ProductOF_odd_Numbers_between_1_to10 {

	//WAP to find product of all the odd number in the range of 1-10
	
		public static void main(String[] agrs)
		{
			int prod=1;
			for(int i=1;i<=10;i++)
			{
				if(i%2!=0)
				{
					prod=prod*i;
				}
			}
			System.out.println(prod);
		}
}
