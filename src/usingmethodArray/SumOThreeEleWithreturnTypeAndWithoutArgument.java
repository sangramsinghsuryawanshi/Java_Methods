package usingmethodArray;

import java.util.Scanner;

public class SumOThreeEleWithreturnTypeAndWithoutArgument 
{
	public int[] printThreeSumArrEle()
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
		System.out.println("Given first three array element is: ");
		for(int i=0;i<a.length-2;i++)
		{
			System.out.println(a[i]+" ");
		}
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SumOThreeEleWithreturnTypeAndWithoutArgument s = new SumOThreeEleWithreturnTypeAndWithoutArgument();
		s.printThreeSumArrEle();

	}

}
