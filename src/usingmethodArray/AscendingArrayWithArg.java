package usingmethodArray;

import java.util.Scanner;

public class AscendingArrayWithArg 
{
	public void AscendingArrEle(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		System.out.println("Given ascending array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		AscendingArrayWithArg a = new AscendingArrayWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a1[]=new int[size];
		System.out.println("Enter 1 array element: ");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		a.AscendingArrEle(a1);
	}
}
