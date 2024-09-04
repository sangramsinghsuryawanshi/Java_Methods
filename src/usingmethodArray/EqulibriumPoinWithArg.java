package usingmethodArray;

import java.util.Scanner;

public class EqulibriumPoinWithArg 
{

	public void equlibrumPoint(int a[])
	{
		System.out.println("The first Equilibrium Point in an array is(1-based index): ");
		for(int i=0;i<a.length;i++)
		{
			int c=0,lsum=0,rsum=0;
			for(int j=0;j<i;j++)
			{
				lsum+=a[j];
			}
			for(int k=i+1;k<a.length;k++)
			{
				rsum+=a[k];
			}
			if(rsum==lsum)
			{
				System.out.println(a[i-1]+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		EqulibriumPoinWithArg o = new EqulibriumPoinWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		o.equlibrumPoint(a);
	}

}
