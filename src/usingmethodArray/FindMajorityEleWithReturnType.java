package usingmethodArray;
import java.util.Arrays;
import java.util.Scanner;
public class FindMajorityEleWithReturnType 
{
	public int[] majorityArryEle()
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
		int c=0;
		for(int i=1;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					c++;
				}
			}
			if(c==size/2)
			{
				System.out.println(a[i]+" ");
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		FindMajorityEleWithReturnType a1 = new FindMajorityEleWithReturnType();
		int c[]=a1.majorityArryEle();
		System.out.println(Arrays.toString(c));
	}
}
