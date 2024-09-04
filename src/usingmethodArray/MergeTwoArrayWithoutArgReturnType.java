package usingmethodArray;

import java.util.Scanner;

public class MergeTwoArrayWithoutArgReturnType 
{

	public void mergeArr()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int size1 = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size1];
		int c[]=new int[a.length+b.length];
		int x=0,y=0;
		System.out.println("Enter 1 array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2 array element: ");
		for(int i=b.length-1;i>=0;i--)
		{
			 b[i]=sc.nextInt();
		}
		for(int i=0;i<c.length;i++)
		{
			if(i%2==0)
			{
				c[i]=a[x];
				x++;
			}
			else
			{
				c[i]=b[y];
				y++;
			}
		}
		System.out.println("Given two mwrged array element is: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		MergeTwoArrayWithoutArgReturnType m = new MergeTwoArrayWithoutArgReturnType();
		m.mergeArr();
	}
}
