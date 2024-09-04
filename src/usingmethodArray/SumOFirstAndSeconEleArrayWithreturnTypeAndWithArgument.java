package usingmethodArray;

import java.util.Scanner;

public class SumOFirstAndSeconEleArrayWithreturnTypeAndWithArgument 
{
	public int[] printFirstAndSecondSumArrEle(int a[])
	{
		int sum=0;
		System.out.println("Given first and last array element is: ");
		for(int i=0;i<a.length-3;i++)
		{
			sum+=a[i];
			System.out.println(a[i]+" ");
		}
		System.out.println("Sum of first and second array element is: \n"+sum);
		return a;
	}
	public static void main(String[] args) 
	{
		SumOFirstAndSeconEleArrayWithreturnTypeAndWithArgument s = new SumOFirstAndSeconEleArrayWithreturnTypeAndWithArgument();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		s.printFirstAndSecondSumArrEle(a);
	}

}
