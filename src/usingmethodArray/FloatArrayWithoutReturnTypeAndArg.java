package usingmethodArray;

import java.util.Scanner;

public class FloatArrayWithoutReturnTypeAndArg 
{
	public void printFloat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		float a[]=new float[size];
		System.out.println("Enter float array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextFloat();
		}
		System.out.println("Given float array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FloatArrayWithoutReturnTypeAndArg f = new FloatArrayWithoutReturnTypeAndArg();
		f.printFloat();

	}

}
