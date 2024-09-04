package usingmethodArray;

import java.util.Scanner;

public class RepeatingEleIndWithArg 
{

	public void repatingEle(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter kth element: ");
		int k = sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
		}
		System.out.println("The index of first repeating array element is : ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				if(a[i]==k)
				System.out.println(i);
			}
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RepeatingEleIndWithArg m = new RepeatingEleIndWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.repatingEle(a);
	}

}

