package usingmethodArray;

import java.util.Scanner;

public class LeaderEleWithArg 
{

	public void FindLeaderEle(int a[])
	{
		System.out.println("The leader array element is: ");
		for(int i=0;i<a.length;i++)
		{
			int c=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					a[i]=-1;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		LeaderEleWithArg o = new LeaderEleWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		o.FindLeaderEle(a);
	}

}
