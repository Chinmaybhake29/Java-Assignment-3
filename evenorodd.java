package Array;

public class evenorodd {

	public static void main(String[] args) {
	int a[]= {10,23,54,78,32,98,57,23,79,13,15};
	
	System.out.println("Odd Number");
	for(int i=0;i<a.length;i++)
	{	
		if(a[i]%2!=0)
		{
			System.out.print(a[i]+" ");
		}
	}
	System.out.println("\nEven Number");
	for(int i=0;i<a.length;i++)
	{	
		if(a[i]%2==0)
		{
			System.out.print(a[i]+" ");
		}
	}

	}

}
