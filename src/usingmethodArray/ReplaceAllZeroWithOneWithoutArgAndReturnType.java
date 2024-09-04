package usingmethodArray;

import java.util.Scanner;

public class ReplaceAllZeroWithOneWithoutArgAndReturnType 
{
	public void replaceValue()
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
			if(a[i]==0)
			{
				a[i]=1;
			}
		}
		System.out.println("After replacing zero with one: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReplaceAllZeroWithOneWithoutArgAndReturnType r = new ReplaceAllZeroWithOneWithoutArgAndReturnType();
		r.replaceValue();
	}

}
