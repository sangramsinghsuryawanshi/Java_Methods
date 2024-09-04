package usingmethodArray;
import java.util.Scanner;
public class RemoveDuplicateWithArg 
{
	public void removeDumplicate(int a[])
	{
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
		System.out.print("\nNew lwngth array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=-1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
	public static void main(String[] args) 
	{
		RemoveDuplicateWithArg a1 = new RemoveDuplicateWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("Given array element is: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		a1.removeDumplicate(a);
	}
}
