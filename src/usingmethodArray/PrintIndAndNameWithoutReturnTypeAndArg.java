package usingmethodArray;

import java.util.Scanner;

public class PrintIndAndNameWithoutReturnTypeAndArg 
{

	public void printName()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		String a[]=new String[size];
		System.out.println("Enter name: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("Given name with index: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(i+" <--Index Name--> "+a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PrintIndAndNameWithoutReturnTypeAndArg f = new PrintIndAndNameWithoutReturnTypeAndArg();
		f.printName();

	}

}
