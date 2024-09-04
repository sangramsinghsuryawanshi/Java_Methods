package usingmethodArray;

import java.util.Scanner;

public class AvgOFFiveArrayWithoutreturnTypeAndWithArgument 
{
	public void averageOFive(int a[])
	{
		int sum=0;
		System.out.println("Given array element is: ");
		for(int i=0;i<a.length-3;i++)
		{
			sum+=a[i];
			System.out.println(a[i]+" ");
		}
		System.out.println("Given Average of array element is: "+(sum/5));
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AvgOFFiveArrayWithoutreturnTypeAndWithArgument a = new AvgOFFiveArrayWithoutreturnTypeAndWithArgument();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a1[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		a.averageOFive(a1);
	}

}
