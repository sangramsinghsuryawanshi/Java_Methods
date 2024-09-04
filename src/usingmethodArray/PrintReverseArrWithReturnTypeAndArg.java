package usingmethodArray;

import java.util.Scanner;

public class PrintReverseArrWithReturnTypeAndArg 
{

	public int[] reverseArry(int a[])
	{
		int c=0;
		System.out.print("\nGiven reverse array element is: ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintReverseArrWithReturnTypeAndArg c = new PrintReverseArrWithReturnTypeAndArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		c.reverseArry(a);
	}

}
