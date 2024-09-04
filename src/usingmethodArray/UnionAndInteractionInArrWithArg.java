package usingmethodArray;

import java.util.Arrays;
import java.util.Scanner;

public class UnionAndInteractionInArrWithArg 
{

	public void unionIntersection(int a[],int b[])
	{
		int c[] = new int[a.length+b.length];
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
		System.out.print("\nIntesection array element is: ");
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					System.out.print(c[i]+" ");
				}
				if(c[i]==c[j])
				{
					c[j]=-1;
				}
			}
		}
		System.out.print("\nUnion of array element is: ");
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=-1)
			{
				System.out.print(c[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		UnionAndInteractionInArrWithArg o = new UnionAndInteractionInArrWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[5];
		System.out.println("Enter 1 array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2 array element: ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		o.unionIntersection(a,b);
	}
}


