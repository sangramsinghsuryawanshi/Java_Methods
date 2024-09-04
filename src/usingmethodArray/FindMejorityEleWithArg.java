package usingmethodArray;

import java.util.Scanner;

public class FindMejorityEleWithArg 
{

	public void majorityEle(int a[],int size)
	{
		System.out.println("Given majority array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==(size/2))
			{
				System.out.println(a[i]+" ");
				break;
			}	
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FindMejorityEleWithArg m = new FindMejorityEleWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.majorityEle(a,size);
	}

}


