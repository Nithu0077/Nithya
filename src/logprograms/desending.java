package logprograms;

public class desending {

	public static void main(String[] args) {
		int arr[]= {29,10,38,47,56};
		for(int i=arr.length-1;i<0;i--)
		{
			for(int j=arr.length-2;j<i+1;j--)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
			for(int k=0;k<arr.length;k++)
			{
				
				System.out.println(arr[k]);	
	}
}

	}


