package usingmethodArray;

import java.util.Scanner;

public class ReplaceNegetiveEleWithReturnType 
{

	public int[] ReplaceArry()
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
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
		}
		System.out.print("\nGiven square of negative array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReplaceNegetiveEleWithReturnType c = new ReplaceNegetiveEleWithReturnType();
		c.ReplaceArry();
	}

}
