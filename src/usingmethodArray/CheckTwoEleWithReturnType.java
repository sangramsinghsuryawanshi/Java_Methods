package usingmethodArray;

import java.util.Scanner;

public class CheckTwoEleWithReturnType 
{
	public int[] CheckArrayConatainsOrNot()
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
		System.out.println("Enter two element :");
		int n= sc.nextInt();
		int n1= sc.nextInt();
		int c=0,c1=0,c2=0,i=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				c++;
			}
			if(a[i]==n1)
			{
				c1++;
			}
			else if(a[i]!=n || a[i]!=n1)
			{
				c2++;
			}
		}
		if(c>0)
		{
			System.out.println(n+" given element is Present");
		}
		if(c1>0)
		{
			System.out.println(n1+" given element is Present");
		}
		else if(c2==0)
		{
			System.out.println("Both are not present");
		}
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CheckTwoEleWithReturnType s = new CheckTwoEleWithReturnType();
		s.CheckArrayConatainsOrNot();

	}

}
