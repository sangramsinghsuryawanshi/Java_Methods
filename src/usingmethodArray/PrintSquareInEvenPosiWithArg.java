package usingmethodArray;

import java.util.Scanner;

public class PrintSquareInEvenPosiWithArg 
{

	public void EvenPositionCountArrEle(int a[])
	{
		System.out.println("Given square of even position array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if((i+1)%2==0)
			{
				a[i]*=a[i];
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintSquareInEvenPosiWithArg o = new PrintSquareInEvenPosiWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		o.EvenPositionCountArrEle(a);
	}

}
