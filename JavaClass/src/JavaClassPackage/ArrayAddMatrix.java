package JavaClassPackage;

public class ArrayAddMatrix {

	public static void main(String[] args) {
		int a[][] = {{2,4}, {5,3}};
		int b [][]= {{6,7},{2,1}};
		
		int c[][] = new int [2][2];
		
		
		// to perform addition of matrices
		for (int i=0; i<c.length; i++)
		{
			for (int j=0;j<c.length;j++)
			{				
				c[i][j]= a[i][j] + b[i][j];
			}
			
		}
       // to print sum matrix
		for (int i=0; i<c.length; i++)
		{
			for (int j=0;j<c.length;j++)
			{
				System.out.print (c[i][j] + " ");
			}
			System.out.println();
	   }
	}
}
