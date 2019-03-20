package CoreJava;

import java.lang.reflect.Array;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*//	the number which divide by itself only not by any other number
		int[] a = {1,14,15,31,17,20,23,27,28,30,31};
		 
		for (int i=0; i<=a.length;i++)
		{
			for(int j=2;j<=i;j++)
			{
			if(((a[i]/j)==0))
				
			{
			 System.out.println(a[i]+"Number is prime");
			}
			else
			{
				System.out.println(a[i]+"Number is Not prime");
			}
			}
		}

	}
*/
		 int i,m=0,flag=0;      
		  int n=3;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1)
		  {  
		   System.out.println(n+" is not prime number");      
		  }
		  else
		  {  
		   for(i=2;i<=m;i++)
		   {      
		    if(n%i==0)
		    {      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		if(flag==0)  
		{ System.out.println(n+" is prime number"); 
		}  
		  }//end of else  
		}    
		}   

