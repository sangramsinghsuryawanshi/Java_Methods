package usingmethodArray;

import java.util.Scanner;
public class DeleteDuplicateArrWithArg 
{
	public void deleteDuplicateArrEle(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Deleted all duplicate array element is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=-1;
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				System.out.println(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		DeleteDuplicateArrWithArg m = new DeleteDuplicateArrWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.deleteDuplicateArrEle(a);
	}
}