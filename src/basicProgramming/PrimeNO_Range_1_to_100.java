package basicProgramming;
//WAP to find all the prime number in the range from 1-100
public class PrimeNO_Range_1_to_100 {

	public static void main(String[] args) 
	{
	
		    int n = 100;
			for(int i=1;i<=n;i++)
			{
				int count=0;
				for(int j=1;j<=n;j++)
				{
					if(i%j==0)
					{
						count++;
					}
				}
				if(count==2)
				{
					System.out.println(i);
				}
			}		
	}
}
