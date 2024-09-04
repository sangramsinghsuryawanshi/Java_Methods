package usingmethodArray;

import java.util.Scanner;

public class FindZeroPosiAndNegetiveWithouthreturnTypeAndArgument 
{
	public void findZeroPosiAndNegative()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a1[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		int c=0,c1=0,c2=0;
		System.out.println("Given array element is: ");
		for(int i=0;i<a1.length;i++)
		{
			if(a1[i]==0)
			{
				c++;
			}
			else if(a1[i]>0)
			{
				c1++;
			}
			else if(a1[i]<0)
			{
				c2++;
			}
		}
		System.out.println("Number of zero present in array element is: "+c);
		System.out.println("Number of positive present in array element is: "+c1);
		System.out.println("Number of negative present in array element is: "+c2);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		FindZeroPosiAndNegetiveWithouthreturnTypeAndArgument f = new FindZeroPosiAndNegetiveWithouthreturnTypeAndArgument();
		f.findZeroPosiAndNegative();
	}

}
