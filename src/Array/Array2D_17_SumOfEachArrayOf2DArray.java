package Array;

public class Array2D_17_SumOfEachArrayOf2DArray {

	public static void main(String[] args) {
		int [][] a = {{2,4,5},{1,2,4},{4,7,8}};
		for(int i=0;i<a.length;i++)
		{
			int sum = 0;
			for(int j = 0;j<a[i].length;j++)
			{
				sum = sum + a[i][j];
			}
			System.out.print(sum + " ");
		}
	}
}
