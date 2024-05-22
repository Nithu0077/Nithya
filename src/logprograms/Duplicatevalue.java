package logprograms;

public class Duplicatevalue {

	public static void main(String[] args) {
		String str="Narma";
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(!str1.contains(String.valueOf(str.charAt(i))))
			{
				str1=str1+str.charAt(i);
			}
		}
		
System.out.println(str1);
	}

}
