package usingmethodArray;

import java.util.Arrays;

import java.util.Scanner;

public class FindKthValueOfSortedArrWithArg 
{
	public void sortedArr(int a[],int b[])
	{
		int c[] = new int[a.length+b.length];
		System.out.println("");
		int x=0,k=5;
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
			x++;
		}
		for(int i=0;i<b.length;i++)
		{
			c[x]=b[i];
			x++;
		}
		Arrays.sort(c);
		for(int i=0;i<c.length;i++)
		{
			if((i+1)==k)
			{
				System.out.println(c[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		FindKthValueOfSortedArrWithArg o = new FindKthValueOfSortedArrWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[4];
		System.out.println("Enter 1 array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Enter 2 array element: ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		Arrays.sort(b);
		o.sortedArr(a,b);
	}
}


