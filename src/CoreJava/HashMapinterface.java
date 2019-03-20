package CoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(1, "Sanket");
		hm.put(2, "Nickuy");
		hm.put(3, "baba");
		hm.put(40, "sonu");
		hm.put(30, "akhil");
		hm.put(26, "nisha");
		hm.put(5, "sunny");
		hm.put(6, "sunny");
		hm.put(8, "7507750102");
		Set sm=hm.entrySet();
		Iterator it=sm.iterator();
		while(it.hasNext())
		{
			//System.out.println(it.next());
			Map.Entry me=(Map.Entry)it.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());
			
		}
		
		
	}
}
//Difference betn arraylist and hashset
	//* araylist can print duplicate values but haset dosent
	//* arraylist can grow dynamically
	//* it arrange obj in sequemtial manner but haset doesnt 


