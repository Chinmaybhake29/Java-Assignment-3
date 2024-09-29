package Array;

import java.util.Scanner;

public class sumofdivisible {

	public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int n=sc.nextInt();
       int m=n, sum=0;
       
       while(n>0)
       {
    	  sum=sum+n%10;
    	  n=n/10;
       }
       if(m%sum==0)
       {
    	   System.out.println(m+ " is divisible by sum");
       }
       else
       {
    	   System.out.println("is not divisible by sum");
       }
       

	}

}
