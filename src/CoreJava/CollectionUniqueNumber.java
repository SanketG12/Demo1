package CoreJava;

import java.util.ArrayList;

public class CollectionUniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,3,2,3,5,5,5,3,6,6,8,45,5,5,53,35,3,42};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0;
			if(!al.contains(a[i]))
			{
				k++;												
				al.add(a[i]);
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
				}
				
				if(k==1)
					System.out.println(a[i]+ " Is Unique Number");
			/*	System.out.println(a[i]);
				System.out.println(k);*/
			}
			
		}

	}

}
