package usingmethodArray;
import java.util.Scanner;
public class SumOfThreePairEleWithArg 
{
	public void threePairSum(int a[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sum: ");
		int k1 = sc.nextInt();
		int sum=0,c=0;
		System.out.println("Given sum pair array element is: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				for(int k=j+1;k<a.length;k++)
				{
					sum=a[i]+a[j]+a[k];
					if(sum==k1)
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]+" ");
						c++;
					}
				}
			}
		}
		System.out.println("Count of sum pair is: "+c);
	}
	public static void main(String[] args) 
	{
		SumOfThreePairEleWithArg m = new SumOfThreePairEleWithArg();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		m.threePairSum(a);
	}
}