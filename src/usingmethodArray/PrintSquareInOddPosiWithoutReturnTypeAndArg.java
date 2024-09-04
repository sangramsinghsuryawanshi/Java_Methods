package usingmethodArray;

import java.util.Scanner;

public class PrintSquareInOddPosiWithoutReturnTypeAndArg 
{
	public void squareOdd()
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
		System.out.print("\nGiven square of odd position array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2!=0)
			{
				a[i]*=a[i];
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintSquareInOddPosiWithoutReturnTypeAndArg p = new PrintSquareInOddPosiWithoutReturnTypeAndArg();
		p.squareOdd();
	}

}
