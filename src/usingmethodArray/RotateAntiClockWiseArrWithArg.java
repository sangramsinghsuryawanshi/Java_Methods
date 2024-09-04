package usingmethodArray;

import java.util.Scanner;

public class RotateAntiClockWiseArrWithArg 
{
	public void antiClockWise(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number: ");
		int k1 = sc.nextInt();
		int sum=0,c=0;
		System.out.println("Anti-Clock wise array element is: ");
		for(int i1=1;i1<=k1;i1++)
		{
			int temp=a[0];
			for(int i=0;i<a.length-1;i++)
			{
				a[i]=a[i+1];
			}
			a[a.length-1]=temp;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		RotateAntiClockWiseArrWithArg m = new RotateAntiClockWiseArrWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.antiClockWise(a);
	}
}