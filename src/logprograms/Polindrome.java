package logprograms;

public class Polindrome {

	public static void main(String[] args) {
		String str="MOM";
		String str2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			
			str2=str2+str.charAt(i);
		}
		System.out.println(str2);
if(str.equals(str2))
{
	System.out.println("Palindrome");
	
}
else
{
	System.out.println("Not a Palindrome");
}
	}
	

}
