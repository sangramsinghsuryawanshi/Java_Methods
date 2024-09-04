package usingmethodArray;

import java.util.Arrays;
import java.util.Scanner;

public class PrintCommonArrEleWithArg
{

	public void printCoomonEle(int a[],int b[],int c[])
	{
		Arrays.sort(c);
		System.out.print("\nCommon array element is: ");
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				for(int k=0;k<b.length;k++)
				{
					if(c[i]==a[j] && c[i]==b[k])
					{
						System.out.print(c[i]+" ");
						break;
					}
				}
			}
		}
	}
	public static void main(String[] args)
	{
		PrintCommonArrEleWithArg o = new PrintCommonArrEleWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 array size: ");
		int size = sc.nextInt();
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size1];
		int c[]=new int[size2];
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
		System.out.println("Enter 3 array element: ");
		for(int i=0;i<c.length;i++)
		{
			c[i]=sc.nextInt();
		}
		o.printCoomonEle(a,b,c);
	}
}



