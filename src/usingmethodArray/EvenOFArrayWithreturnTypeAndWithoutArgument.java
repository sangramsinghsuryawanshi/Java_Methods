package usingmethodArray;

import java.util.Scanner;

public class EvenOFArrayWithreturnTypeAndWithoutArgument 
{
	public int[] EvenArrEle()
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
		int sum=0;
		System.out.println("Given even array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			System.out.println(a[i]+" ");
		}
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EvenOFArrayWithreturnTypeAndWithoutArgument e = new EvenOFArrayWithreturnTypeAndWithoutArgument();
		e.EvenArrEle();
		
	}

}
