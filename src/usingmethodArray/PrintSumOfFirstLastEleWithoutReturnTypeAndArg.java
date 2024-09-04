package usingmethodArray;

import java.util.Scanner;

public class PrintSumOfFirstLastEleWithoutReturnTypeAndArg 
{

	public void sumOfFirstAndLastArr()
	{
		int sum=0,c=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sum=a[0]+a[a.length-1];
		System.out.println("Given sum of first and last array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==sum)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSumOfFirstLastEleWithoutReturnTypeAndArg o = new PrintSumOfFirstLastEleWithoutReturnTypeAndArg();
		o.sumOfFirstAndLastArr();
	}
}
