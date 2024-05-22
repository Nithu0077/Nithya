package logprograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Printusinglist {

	public static void main(String[] args) {
		
		List<Integer> L=new ArrayList<Integer>();
		L.add(10);
		L.add(12);
		//L.add(null);
		//L.add(null);
		
		System.out.println(L);
		for(int i:L)
		{
			System.out.println(i);
		
			
		}
		Iterator<Integer> IT=L.iterator();
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}
		

	}

}
