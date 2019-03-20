package OtherPackage;

public class ExceptionHandling {

	 
	public static void main(String[] args) {
		int a=5;
		int b=0;
		int k=0;
		
		try 
		{
		// k= a/b;
		//System.out.println(k)
		 int array[]=new int[5];
		 System.out.println(array[7]);
		
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("ArithmeticException is handle by catch block");
		}
		catch(IndexOutOfBoundsException ets)
		{
			System.out.println("IndexOutOfBoundsException is handle by catch block");
		}
		catch(Exception e)
		{
			System.out.println("Exception is handle by catch block");
		}
       finally
       {
    	   System.out.println("Finally block will always exexute irrespective of error thrown or not");
    	   System.out.println("Without try and catch blocks Finally block will not work ");
    	   System.out.println("Finally block execution will stop only when we stop JVM forcefully");
       }
	}

}
