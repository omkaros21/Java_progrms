package Array;

public class Array11_findSmallestNumInArray {

	public static void main(String[] args) {
		int [] a = {5,4,9,3,7,2};
		int small = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println("smallest num is : " +small);
	}
}
