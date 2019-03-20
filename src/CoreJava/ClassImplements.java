package CoreJava;

public class ClassImplements extends  Parent implements InterfaceFirst {

	public static void main(String[] args) {
		
		
		ClassImplements c= new ClassImplements();
		c.Area(5);
		c.Area(8, 9);
		
		
		InterfaceFirst i=new ClassImplements();
		Parent p=new ClassImplements();
	
		c.getdata();
		c.ATT();
		c.BT();
		c.CT();
		c.DT();
        c.FT();
        c.TT();
        c.TMobile();
        c.Verizon();
        
        i.ATT();
        i.BT();
        i.CT();
        i.DT();
        i.FT();
        i.GT();
        i.HT();
       
        p.TMobile();
        p.Verizon();
        p.getdata();
        
       
 
	}

	public void Area (int x, int y ) {
		
		System.out.println("area of rectangle is "+ x*y);
		
	}
	
	public void Area (int x ) {
		
		System.out.println("area of square is "+ x*x);
		
	}
	
	
	
	//Interface Methods
	@Override
	public void ATT() {
		System.out.println("I am ATT employee");
		
	}

	@Override
	public void BT() {
		// TODO Auto-generated method stub
		System.out.println("I am BT employee");
	}

	@Override
	public void CT() {
		// TODO Auto-generated method stub
		System.out.println("I am CT employee");
	}

	@Override
	public void DT() {
		// TODO Auto-generated method stub
		System.out.println("I am DT employee");
	}

	//Parent Class method
	public void TT() {
		// TODO Auto-generated method stub
		System.out.println("I am TT employee");
	}
	public void FT() {
		// TODO Auto-generated method stub
		System.out.println("I am FT employee");
	}
	
	//Constructor
	public ClassImplements(int a) {
		
		System.out.println(a +"I am Constructor with value");
		
	}
	public ClassImplements() {
		
		System.out.println("I am Constructor with value ");
		
	}
	
	
	//using super keyword
	 String name="Sanket GAur";
	public void getdata() {
		System.out.println(name);
		System.out.println(super.name);
		super.getdata();
	}

	@Override
	public void RT() {
		// TODO Auto-generated method stub
		System.out.println("I am FT employee");
		
	}

	@Override
	public void GT() {
		// TODO Auto-generated method stub
		System.out.println("I am FT employee");
		
	}

	@Override
	public void HT() {
		// TODO Auto-generated method stub
		System.out.println("I am FT employee");
		
	}
	
}
