package usingmethodArray;

import java.util.Scanner;

public class MergeTwoArrWithArg 
{

	public void mergeArr(int a[],int b[])
	{
		
		int c[]=new int[a.length+b.length];
		int x=0,y=0;
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
		System.out.println("Given merged array element is: ");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		MergeTwoArrWithArg m = new MergeTwoArrWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
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
		m.mergeArr(a,b);
	}
}