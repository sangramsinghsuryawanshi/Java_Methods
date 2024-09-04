package usingmethodArray;

import java.util.Scanner;

public class LeaderWithReturnType 
{
	public int[] leader()
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
		System.out.print("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=-1;
				}
			}
		}
		System.out.println("\nGiven leader array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				System.out.println(a[i]);
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LeaderWithReturnType l = new LeaderWithReturnType();
		l.leader();

	}

}
