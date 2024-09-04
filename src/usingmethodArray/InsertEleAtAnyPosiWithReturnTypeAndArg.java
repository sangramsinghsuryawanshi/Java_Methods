package usingmethodArray;

import java.util.Scanner;

public class InsertEleAtAnyPosiWithReturnTypeAndArg 
{
	public int[] insertEleAtGivenPosition(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elelment and position: ");
		int ele = sc.nextInt();
		int max = sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if((i+1)==max)
			{
				a[i]=ele;
			}
		}
		System.out.println("given changed array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		return a;
	}
	public static void main(String[] args) 
	{
		InsertEleAtAnyPosiWithReturnTypeAndArg a1 = new InsertEleAtAnyPosiWithReturnTypeAndArg();
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
		a1.insertEleAtGivenPosition(a);
	}
}
