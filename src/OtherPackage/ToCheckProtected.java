package OtherPackage;

import CoreJava.InterfaceFirst;
import CoreJava.Parent;

public class ToCheckProtected extends Parent implements InterfaceFirst  {

	
	public static void main(String[] args) {
	
		ToCheckProtected tcp=new ToCheckProtected();
		tcp.getdata();
		tcp.getdata1();
		tcp.ATT();
		tcp.BT();
		
	}

	@Override
	public void ATT() {
		// TODO Auto-generated method stub
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
		
	}

	@Override
	public void DT() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RT() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FT() {
		// TODO Auto-generated method stub
		System.out.println("I am BT employee");
	}

	@Override
	public void GT() {
		// TODO Auto-generated method stub
		System.out.println("I am BT employee");
	}

	@Override
	public void HT() {
		// TODO Auto-generated method stub
		System.out.println("I am BT employee");
	}

	@Override
	public void PT() {
		// TODO Auto-generated method stub
		System.out.println("I am BT employee");
	}

}

