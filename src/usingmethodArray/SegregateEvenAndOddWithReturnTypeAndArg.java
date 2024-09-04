package usingmethodArray;

import java.util.Scanner;

class EvenOdd
{
	public int[] segregateEvenOdd(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]%2==0)
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		int te=a[0];
		int t1=a[1];
		a[0]=t1;
		a[1]=te;
		return a;
	}
}
public class SegregateEvenAndOddWithReturnTypeAndArg 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		EvenOdd  e= new EvenOdd();
		int c[]=e.segregateEvenOdd(a);
		System.out.println("The even numbers present first and then the odd numbers: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(c[i]+" ");
		}
	}

}
