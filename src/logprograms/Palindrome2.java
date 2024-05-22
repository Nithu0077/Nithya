package logprograms;

public class Palindrome2 {

	public static void main(String[] args) {
		String str="APPA";
		String revStr = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			 revStr += str.charAt(i);
		}
		System.out.println(revStr);
		if(str.equals(revStr)) {
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
				
		}
	}

}
