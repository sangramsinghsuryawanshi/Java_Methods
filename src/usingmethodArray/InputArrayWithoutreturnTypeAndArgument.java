package usingmethodArray;

import java.util.Scanner;

public class InputArrayWithoutreturnTypeAndArgument 
{
	public void inputArray()
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
		System.out.println("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InputArrayWithoutreturnTypeAndArgument in = new InputArrayWithoutreturnTypeAndArgument();
		in.inputArray();
	}

}
