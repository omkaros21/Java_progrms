package Array;

public class Array14_find_GoodArray_Or_BadArray {

	public static void main(String[] args) {
		int [] a = {1, 0, 1, 5, 8, 7, 0, 1, 1};
		int bad = 0;
		int good = 0;
		int b[] = new int[a.length];
		int k = a.length-1;
		for(int i=0; i<b.length;i++)
		{
			b[i] = a[k];
			k--;
		}
		for(int i=0;i<b.length;i++)
		{
			if(a[i] == b[i])
			{
				good = good + a[i];
			}
			else {
				bad = bad + a[i];
			}
		}
		System.out.print(good-bad);
	}
}
