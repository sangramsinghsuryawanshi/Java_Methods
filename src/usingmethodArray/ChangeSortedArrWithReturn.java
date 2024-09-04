package usingmethodArray;

import java.util.Arrays;
import java.util.Scanner;

public class ChangeSortedArrWithReturn 
{
	public int[] sorteArr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int size1 = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size1];
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
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(i==4)
				{
					int t=b[0];
					b[0]=a[i];
					a[i]=t;
				}
				else if(i==5)
				{
					int t=b[1];
					b[1]=a[i];
					a[i]=t;
				}
			}
		}
		System.out.println("Enter 1 array element is: ");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println("Enter 2 array element is: ");
		Arrays.sort(b);
		System.out.println(	Arrays.toString(b));
		return a;
	}
	public static void main(String[] args) 
	{
		ChangeSortedArrWithReturn a1 = new ChangeSortedArrWithReturn();
		int c[]=a1.sorteArr();
		//System.out.println(Arrays.toString(c));
	}
}
