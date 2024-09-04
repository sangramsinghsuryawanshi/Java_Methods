package usingmethodArray;

import java.util.Scanner;

public class PutEvenFirstThenOddWithReturnType 
{
	public int[] checkEvenOdd()
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
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]%2!=0)
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Given array element in first even order then odd: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		return a;
	}
	public static void main(String[] args) 
	{
		PutEvenFirstThenOddWithReturnType s = new PutEvenFirstThenOddWithReturnType();
		s.checkEvenOdd();
	}
}
