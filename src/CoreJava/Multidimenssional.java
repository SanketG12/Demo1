package CoreJava;

public class Multidimenssional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int sum=0;
		int total=0;
		for(int i=0;i<3;i++)
		{
			sum=0;
			for(int j=0;j<3;j++)
			{
			
				//System.out.print(a[i][j]);
				sum=sum+a[i][j];
				//System.out.print(" ");
			}
			//System.out.print(sum);
			total=sum+total; 
			
			}
		System.out.print(total);
		
	}

}
