package usingmethodArray;

import java.util.Scanner;

public class SumOfInteWithArg 
{

	public void sumOfInt(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter k number :");
		int k=sc.nextInt();
		int sum=0;
		System.out.println("\nGiven addition of targeted value is :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==k)
				{
					System.out.println(a[i]+"+"+a[j]+" = "+k);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		SumOfInteWithArg a1 = new SumOfInteWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		a1.sumOfInt(a);
	}
}
