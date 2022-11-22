package Array;

import java.util.Scanner;

public class Array9_TakeElementsFromUserAndDisplayElements {

	public static void main(String[] args) {
		Scanner sc = null;
	    sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n = sc.nextInt();
		int [] a = new int [n+1];
		for(int i = 1 ;i<a.length; i++)
		{
			System.out.println("Enter the elements");
			a[i] = sc.nextInt();
		}
		for(int i = 1;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		if(sc!=null)
		{
			sc.close();
		}
	}
}
