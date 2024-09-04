package usingmethodArray;

import java.util.Scanner;

public class EvenPositionCountOFArrayWithArg 
{
	public void EvenPositionCountArrEle(int a[])
	{
		int sum=0,c=0;
		System.out.println("Given even position array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				sum+=a[i];
				System.out.println(a[i]+" ");
				c++;
			}
		}
		System.out.println("Given count of even position array element is: "+c);
	}
	public static void main(String[] args) 
	{
		EvenPositionCountOFArrayWithArg e = new EvenPositionCountOFArrayWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		e.EvenPositionCountArrEle(a);
	}
}
