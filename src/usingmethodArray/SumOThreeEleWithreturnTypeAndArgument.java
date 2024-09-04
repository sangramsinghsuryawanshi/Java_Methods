package usingmethodArray;

import java.util.Scanner;

public class SumOThreeEleWithreturnTypeAndArgument 
{
	public int[] printThreeSumArrEle(int[]a)
	{
		int sum=0;
		System.out.println("Given first three array element is: ");
		for(int i=0;i<a.length-2;i++)
		{
			sum+=a[i];
			System.out.println(a[i]+" ");
		}
		System.out.println("Given sum of first three array element :"+sum);
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SumOThreeEleWithreturnTypeAndArgument s = new SumOThreeEleWithreturnTypeAndArgument();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		s.printThreeSumArrEle(a);

	}

}
