package usingmethodArray;

import java.util.Scanner;

public class FindPrimeWithReturnType 
{

	public int[] checkPrime()
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
		System.out.println("Given prime array element is: ");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			int n=a[i];
			for(int j=1;j<=n;j++)
			{
				if(n%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(n+" ");
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		FindPrimeWithReturnType s = new FindPrimeWithReturnType();
		s.checkPrime();
	}
}
