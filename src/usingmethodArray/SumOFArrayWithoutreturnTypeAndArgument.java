package usingmethodArray;

import java.util.Scanner;

public class SumOFArrayWithoutreturnTypeAndArgument 
{
	public void sum()
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
		int sum=0;
		System.out.println("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			System.out.println(a[i]+" ");
		}
		System.out.println("Sum of array element is: "+sum);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SumOFArrayWithoutreturnTypeAndArgument s = new SumOFArrayWithoutreturnTypeAndArgument();
		s.sum();
	}

}
