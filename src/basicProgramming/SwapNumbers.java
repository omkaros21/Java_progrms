package basicProgramming;

public class SwapNumbers {
//WAP to swap two variable using 3rd variable.

	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("----Before swap------");
		
		System.out.println("a:"+a );
		System.out.println("b:"+b );
		
		temp = a;
		a = b;
		b=temp;
		
		System.out.println("----After swap------");
		
		System.out.println("a:"+a );
		System.out.println("b:"+b );
	}

}
