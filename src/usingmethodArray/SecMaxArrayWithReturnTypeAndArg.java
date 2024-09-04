package usingmethodArray;

import java.util.Scanner;

public class SecMaxArrayWithReturnTypeAndArg 
{
	public int secMax(int a[])
	{
		int max=0,smax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax)
			{
				smax=a[i];
			}
		}
		System.out.println("Second max array element is: "+smax);
		return smax;
	}
	public static void main(String[] args) 
	{
		SecMaxArrayWithReturnTypeAndArg a1 = new SecMaxArrayWithReturnTypeAndArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		a1.secMax(a);
	}
}