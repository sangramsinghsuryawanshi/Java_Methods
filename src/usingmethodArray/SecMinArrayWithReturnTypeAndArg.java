package usingmethodArray;
import java.util.Scanner;
public class SecMinArrayWithReturnTypeAndArg 
{
	public int secMin(int a[])
	{
		int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin)
			{
				smin=a[i];
			}
		}
		System.out.println("Second min array element is: "+smin);
		return smin;
	}
	public static void main(String[] args) 
	{
		SecMinArrayWithReturnTypeAndArg a1 = new SecMinArrayWithReturnTypeAndArg();
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
		a1.secMin(a);
	}
}
