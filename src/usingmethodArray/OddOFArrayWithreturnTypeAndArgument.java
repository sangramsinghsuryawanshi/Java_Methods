package usingmethodArray;

import java.util.Scanner;

public class OddOFArrayWithreturnTypeAndArgument 
{
	public int[] oddArrEle(int a[])
	{
		int cnt = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				//System.out.println(a[i]+" ");
				cnt++;
			}
		}
		int b[]=new int[cnt];
		int ind=0;
		System.out.println("Given odd array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				//System.out.println(b[i]+" ");
				b[ind++]=a[i];
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		OddOFArrayWithreturnTypeAndArgument o = new OddOFArrayWithreturnTypeAndArgument();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=o.oddArrEle(a);
		for(int i=0;i<b.length;i++)
		{
				System.out.println(b[i]+" ");
		}
	}

}
