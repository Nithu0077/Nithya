package logprograms;

public class Numpalidrome {

	public static void main(String[] args) {
		int N=121;
		int org=N;
		int rev=0;
		while(N>0)
		{
		int rem=N%10;
		rev=rev*10+rem;
		N=N/10;
		}
		System.out.println(rev);
		if(org==rev)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palidrome");
		}
		
		

}
}
