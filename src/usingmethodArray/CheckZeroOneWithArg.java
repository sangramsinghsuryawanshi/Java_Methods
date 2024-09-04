package usingmethodArray;

import java.util.Scanner;

public class CheckZeroOneWithArg 
{

	public void checkArr(int a[])
	{
		int c=0,x=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				c++;
			}
			if(a[i]==-1)
			{
				x++;
			}
		}
		if(c>0)
		{
			System.out.println("\ngiven array contain "+c+" <--: 0");
		}
		if(x>0)
		{
			System.out.print("\ngiven array contain "+x+" <--: -1");
		}
		else 
		{
			System.out.println("\ngiven array not contain "+x+" <--: -1 And "+x+" <--: 0");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CheckZeroOneWithArg a1 = new CheckZeroOneWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		a1.checkArr(a);
	}
}
