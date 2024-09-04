package usingmethodArray;

import java.util.Scanner;

public class CheckDuplicateWithReturnTypeAndArg 
{
	public int[] duplicateArry(int a[])
	{
		int c=0;
		System.out.print("\nGiven duplicate array element is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.print(a[i]+" ");
					c++;
				}
			}
		}
		System.out.println("\nCount  of duplicate array element is :"+c);
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CheckDuplicateWithReturnTypeAndArg c = new CheckDuplicateWithReturnTypeAndArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		c.duplicateArry(a);
	}

}
