package usingmethodArray;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinValueOfGivenEquationWithArg 
{
	public void minInEqu(int a[],int b[])
	{
		int c[] = new int[a.length+b.length];
		System.out.println("");
		int x=0,y=0,sum=0,a1=1,b1=1,k=0;
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i]*b[i];
			sum+=temp;
		}
		System.out.println("Sum of given equation is: "+sum);
	}
	public static void main(String[] args)
	{
		FindMinValueOfGivenEquationWithArg o = new FindMinValueOfGivenEquationWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		int b[]=new int[size];
		System.out.println("Enter 1 array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Enter 2 array element: ");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		o.minInEqu(a,b);
	}
}

