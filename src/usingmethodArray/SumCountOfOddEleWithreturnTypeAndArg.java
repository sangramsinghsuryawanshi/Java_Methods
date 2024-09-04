package usingmethodArray;

import java.util.Scanner;

public class SumCountOfOddEleWithreturnTypeAndArg 
{

	public int[] printCountAndSumOddEle(int a[])
	{
		int c=0,sum=0;
		System.out.println("Given even array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum+=a[i];
				System.out.println(a[i]+" ");
				c++;
			}
		}
		System.out.println("Sum of odd array element is: "+sum);
		System.out.println("Count of odd array element is: "+c);
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SumCountOfOddEleWithreturnTypeAndArg s = new SumCountOfOddEleWithreturnTypeAndArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		s.printCountAndSumOddEle(a);

	}
}

