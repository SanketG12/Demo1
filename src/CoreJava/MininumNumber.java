package CoreJava;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class MininumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 int a[][]= {{3,2,7},{9,5,6},{3,8,9}};
		int max=a[0][0];
	
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
			
				if(a[i][j]>=max)
				{
					max=a[i][j];
				}
			
			}
		
			
			}
		
		System.out.println(max);
		
	
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("m/d/yyyy hh:m:s");
		Calendar cal=Calendar.getInstance();
		System.out.println(sdf.format(cal.getTime()));
	  /*
		System.out.println(d.toString());
		System.out.println(sdf.format(d));*/
	}

	
	
}
