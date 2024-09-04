package usingmethodArray;

import java.util.Scanner;

public class FindMaxProductArrEleWithReturnTypeAndArg 
{
	public int maxProduct(int a[])
	{
		
		int max =0,smax =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && smax!=max)
			{
				smax=a[i];
			}
		}
		int product=max*smax;
		return product;
	}

	    public static void main(String[] args) 
	    {
	    	Scanner sc = new Scanner(System.in);
			System.out.println("Enter array size: ");
			int size = sc.nextInt();
			int a[]=new int[size];
			System.out.println("Enter array element: ");
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
			FindMaxProductArrEleWithReturnTypeAndArg f = new FindMaxProductArrEleWithReturnTypeAndArg();
			int c=f.maxProduct(a);
			System.out.println("Maximum product of two array element: "+c);
	    }
}
