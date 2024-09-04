package usingmethodArray;

import java.util.Scanner;

public class SumOfPairEleWithArg 
{
	public void pairSum(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum: ");
		int k = sc.nextInt();
		int sum=0,c=0;
		System.out.println("Given sum pair array element is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				sum=a[i]+a[j];
				if(sum==k)
				{
					System.out.println(a[i]+" "+a[j]+" ");
					c++;
				}
			}
		}
		System.out.println("Count of sum pair is: "+c);
	}
	public static void main(String[] args) 
	{
		SumOfPairEleWithArg m = new SumOfPairEleWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.pairSum(a);
	}
}