package logprograms;

import java.util.ArrayList;
import java.util.List;

public class greatestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<Integer> lis=new ArrayList<Integer>();
//		lis.add(7);
//		lis.add(8);
//		lis.add(10);
//		lis.add(11);
//		lis.add(12);
//		System.out.println(lis);
		
		int arr[]={56,52,52,23,9};
		int first=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(first<arr[i])
			{
				first=arr[i];
			}
		}
		System.out.println(first);
	}

}
