package logprograms;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Printusingset {

	public static void main(String[] args) {
		Set<String> S=new HashSet<String>();
		S.add("Nithya");
		S.add("Rose");
		System.out.println(S);
		for(String sr:S)
		{
			System.out.println(sr);
		}
		Iterator<String> item=S.iterator();
		while(item.hasNext())
		{
			
			System.out.println(item.next());
		
		}

	}

}
