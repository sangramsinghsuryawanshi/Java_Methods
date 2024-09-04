package usingmethodArray;

import java.util.Scanner;

public class FindMissingPosiEleWithReturnType 
{
	public int positveMissing()
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
		int ind=0;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]!=i)
			{
				ind =i;
				break;
			}
		}
		return ind;
	}
	public static void main(String[] args) 
	{
		FindMissingPosiEleWithReturnType a1 = new FindMissingPosiEleWithReturnType();
		int c=a1.positveMissing();
		System.out.println("Given missing positive array element is: "+c);
	}
}

