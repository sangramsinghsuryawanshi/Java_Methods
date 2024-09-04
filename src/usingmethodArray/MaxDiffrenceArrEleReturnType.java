package usingmethodArray;

import java.util.Scanner;

public class MaxDiffrenceArrEleReturnType
{
	public int maxDiffrence()
	{
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
		int max=0,min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
		}
		int diff=max-min;
		return diff;
	}
	public static void main(String[] args) 
	{
		MaxDiffrenceArrEleReturnType a1 = new MaxDiffrenceArrEleReturnType();
		int c=a1.maxDiffrence();
		System.out.println("Given diffrence between two integer number is: "+c);
	}
}
