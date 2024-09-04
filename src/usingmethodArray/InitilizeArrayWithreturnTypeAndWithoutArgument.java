package usingmethodArray;

import java.util.Scanner;

public class InitilizeArrayWithreturnTypeAndWithoutArgument 
{
	public int[] printFirstAndLastArrEle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given first and last array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(i==0)
			System.out.println(a[i]+" ");
			else if(i==a.length-1)
			System.out.println(a[i]+" ");
		}
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InitilizeArrayWithreturnTypeAndWithoutArgument ia = new InitilizeArrayWithreturnTypeAndWithoutArgument ();
		ia.printFirstAndLastArrEle();
	}
}
