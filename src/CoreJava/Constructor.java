package CoreJava;

public class Constructor {

	
	public static void main(String[] args) {
		
		
		//parametrize constructor
		Constructor cons1=new Constructor(4,5);
			
		//Non-parametrize constructor
		Constructor cons=new Constructor();
		
		//WithoutConstructor
		cons.withoutConstructor();
	}

	//WithoutConstructor
    public static void withoutConstructor() {
    	System.out.println("I am the without Constructor");
		int a=6, b=7;
		int c=0;
		c=a+b;
		System.out.println(c);
	}

  //Non-parametrize constructor
    public Constructor() {
		System.out.println("I am the Non-parametrize Constructor");
		System.out.println("And Object is initialize properly");
		int a=6, b=7;
		int c=0;
		c=a+b;
		System.out.println(c);
	}
	
	//parametrize constructor
	
	public Constructor(int a, int b) {
		System.out.println("I am in parametrize Constructor");
		System.out.println("And Object is initialize properly");
	    int c =a+b;
		System.out.println(c);
	}
}
