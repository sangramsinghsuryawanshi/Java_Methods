package usingmethodArray;

import java.util.Scanner;

public class SumOddOFArrayWithoutreturnTypeAndWithArgument 
{
	public void sumOfOdd(int a[])
	{
		int sum=0;
		System.out.println("Given odd array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum+=a[i];
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("Given sum of odd array element is: "+sum);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SumOddOFArrayWithoutreturnTypeAndWithArgument s = new SumOddOFArrayWithoutreturnTypeAndWithArgument();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		s.sumOfOdd(a);
	}
}
