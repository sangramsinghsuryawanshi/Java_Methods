package usingmethodArray;
import java.util.Scanner;
public class MaxMinArrayWithReturnTypeAndArg 
{

	public int[] minMax(int a[])
	{
		int min=Integer.MAX_VALUE,max=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Max array element is: "+max);
		System.out.println("Min array element is: "+min);
		return a;
	}
	public static void main(String[] args) 
	{
		MaxMinArrayWithReturnTypeAndArg a1 = new MaxMinArrayWithReturnTypeAndArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		a1.minMax(a);
	}
}

