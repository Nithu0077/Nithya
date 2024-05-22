package logprograms;

import java.util.HashSet;
import java.util.Set;

public class Removeduplicatevalues {

	public static void main(String[] args) {
		int arr[]= {11,12,13,13,15};
		Set<Integer> val=new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			val.add(arr[i]);
			
			
		}
		System.out.println(val);
		

	}

}
