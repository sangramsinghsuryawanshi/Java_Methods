package usingmethodArray;

import java.util.Scanner;

public class SerarchArrEleAndCountWithArg 
{
	public void searchArray(int a[],int c)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any element :");
		int n= sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				System.out.println("Position--> "+(i+1)+" given element is--> "+a[i]+" ");
			}
		}
		System.out.println("Count of array element is: "+c);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SerarchArrEleAndCountWithArg s = new SerarchArrEleAndCountWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		int c=0;
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			c++;
		}
		s.searchArray(a,c);
	}

}
