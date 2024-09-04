package usingmethodArray;

import java.util.Scanner;

public class EvenSumOFArrayWithoutreturnTypeAndArgument 
{
	public void SumEvenArrEle()
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
			{
				sum+=a[i];
				System.out.println(a[i]+" ");
			}
		}
		System.out.println("Sum of even array element is :"+sum);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EvenSumOFArrayWithoutreturnTypeAndArgument e = new EvenSumOFArrayWithoutreturnTypeAndArgument();
		e.SumEvenArrEle();
	}

}
