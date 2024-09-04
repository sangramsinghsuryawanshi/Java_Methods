package usingmethodArray;

import java.util.Scanner;

public class RotateClockWiseArrWithArg 
{
	public void clockWise(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int k1 = sc.nextInt();
		int sum=0,c=0;
		System.out.println("Clock wise array element is: ");
		for(int i1=1;i1<=k1;i1++)
		{
			int temp=a[a.length-1];
			for(int i=a.length-1;i>0;i--)
			{
				a[i]=a[i-1];
			}
			a[0]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		RotateClockWiseArrWithArg m = new RotateClockWiseArrWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.clockWise(a);
	}
}
