package usingmethodArray;

import java.util.Scanner;

public class OddSumAndCountOFArrayWithreturnTypeAndArg {

	public int[] OddSumAndCountArrEle(int a[])
	{
		int sum=0,c=0;
		System.out.println("Given odd array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				sum+=a[i];
				System.out.println(a[i]+" ");
				c++;
			}
		}
		System.out.println("Given sum of odd array element is: "+sum);
		System.out.println("Given count of odd array element is: "+c);
		return a;
	}
	public static void main(String[] args) 
	{
		OddSumAndCountOFArrayWithreturnTypeAndArg e = new OddSumAndCountOFArrayWithreturnTypeAndArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		e.OddSumAndCountArrEle(a);
	}

}
