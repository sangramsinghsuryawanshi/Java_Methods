package usingmethodArray;

import java.util.Scanner;

class MissingEle
{
	public int findMissingEle(int a[], int size)
	{
		int sum=0;
		System.out.println("Given array element is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			sum+=a[i];
		}
		int mis = size*(size+1)/2;
		return mis-sum;
	}
}
public class FindMissingEleWithReturnTypeAndArg 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		MissingEle  e= new MissingEle();
		int c=e.findMissingEle(a,size);
		System.out.println("The given missing array element is: "+c);
	}
}
