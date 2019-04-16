package OtherPackage;

import java.util.ArrayList;

public class uniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]={2,4,8,5,5,64,81,54,6,4,84,4,67,44};
		ArrayList<Integer> al= new ArrayList<Integer>();
		
		for(int i=0;i<a.length-1;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				k++;
				al.add(a[i]);
				for(int j=i+1;j<a.length-1;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
						
						
					
				}
				if(k==1)
					System.out.println(a[i]+ " Is Unique Number");
			}
			
		}
		
	}
}		
  
