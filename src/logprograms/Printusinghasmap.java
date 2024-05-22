package logprograms;

import java.util.HashMap;
import java.util.Map.Entry;

public class Printusinghasmap {

	public static void main(String[] args) {
		HashMap<String,Integer> HM=new HashMap<String,Integer>(); 
		HM.put("Nithya",7);
		HM.put("Rose",8);
		HM.put("Sowmi",6);
		System.out.println(HM);
		for(Entry<String,Integer> var:HM.entrySet())
		{
			
		
if(var.getKey().equalsIgnoreCase("nithya"))
{
	
	System.out.println(var.getValue());
}
		}
		
		

	}

}
