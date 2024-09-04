package usingmethodArray;

import java.util.Scanner;

public class SumCountOfEvenPosieWithreturnType 
{

	public int[] printCpuntSumEvenPosiArrEle()
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
		int c=0,sum=0;
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
		System.out.println("Sum of even position array element is: "+sum);
		System.out.println("Count of even position array element is: "+c);
		return a;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SumCountOfEvenPosieWithreturnType s = new SumCountOfEvenPosieWithreturnType();
		s.printCpuntSumEvenPosiArrEle();

	}

}

