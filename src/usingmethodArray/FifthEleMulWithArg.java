package usingmethodArray;

import java.util.Scanner;

public class FifthEleMulWithArg 
{
	public void printMulEle(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if((i+1)==5)
			{
				a[i]=a[i]*25;
			}
		}
		System.out.println("Given changed array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FifthEleMulWithArg a1 = new FifthEleMulWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		a1.printMulEle(a);
	}
}
