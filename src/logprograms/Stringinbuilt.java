package logprograms;

public class Stringinbuilt {

	public static void main(String[] args) {
		String str="Nithya";
		int count=0;//initailization
		char c[]=str.toCharArray();//string to character array
		System.out.println(str.length());
		for(char ch:c)//datatype,variable name,array
		{
			count++;
		}
		System.out.println(count) ;

	}

}

