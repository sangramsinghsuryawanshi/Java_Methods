package usingmethodArray;

import java.util.Scanner;

public class PrintKthReoaeatingEleWithArg 
{

	public void FindKthEle(int a[],int k)
	{
		System.out.println("The first element that occurs at least K number of times is: ");
		for(int i=0;i<a.length;i++)
		{
			int c=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c==k)
			{
				System.out.println(a[i]+" ");
				break;
			}
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		PrintKthReoaeatingEleWithArg o = new PrintKthReoaeatingEleWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter K value: ");
		int k = sc.nextInt();
		o.FindKthEle(a,k);
	}

}
