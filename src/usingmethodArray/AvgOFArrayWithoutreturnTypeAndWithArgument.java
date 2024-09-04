package usingmethodArray;

import java.util.Scanner;

public class AvgOFArrayWithoutreturnTypeAndWithArgument 
{
	public void average(int a[])
	{
		int sum=0;
		System.out.println("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			System.out.println(a[i]+" ");
		}
		System.out.println("Given Average of array element is: "+(sum/a.length));
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AvgOFArrayWithoutreturnTypeAndWithArgument a = new AvgOFArrayWithoutreturnTypeAndWithArgument();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a1[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		a.average(a1);
	}

}
