package usingmethodArray;
import java.util.Scanner;
public class DeleteArrWithArg 
{
	public void deleteArrEle(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an element: ");
		int k1 = sc.nextInt();
		int sum=0,c=0;
		System.out.println("Deleted array element is: ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==k1)
			{
				a[i]=-1;
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
		DeleteArrWithArg m = new DeleteArrWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.deleteArrEle(a);
	}
}