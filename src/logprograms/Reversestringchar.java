package logprograms;

public class Reversestringchar {

	public static void main(String[] args) {
		String str="Nithya";
		System.out.println(str);
		char ch[]=str.toCharArray();
		//for(int i=ch.length-1;i>=0;i--)
		for(int i=str.length()-1;i>=0;i--)
		{
			
			System.out.println(ch[i]);
			//System.out.print(str.charAt(i));
			
		}
		
		

	}

}
