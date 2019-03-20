package CoreJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Sanket");
		hs.add("gaur");
		hs.add("nicky");
		hs.add("gaur");
		hs.add("baba");
		hs.add("Nisha");
		hs.add("Nisha");
		hs.add("Nisha");
		hs.add("null");
		Iterator<String> is=hs.iterator();
		while(is.hasNext())
		{
			System.out.println(is.next());
		}
	}

}
