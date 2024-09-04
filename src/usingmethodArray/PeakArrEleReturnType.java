package usingmethodArray;
import java.util.Scanner;

public class PeakArrEleReturnType 
{
	public int[] peakEle()
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
		return a;
	}
	public static void main(String[] args) 
	{
		PeakArrEleReturnType a1 = new PeakArrEleReturnType();
		int c[]=a1.peakEle();
		System.out.println("Given peak array element is: ");
		for(int i=1;i<c.length;i++)
		{
			if(c[i]>c[i-1] && c[i]>c[i+1])
			{
				System.out.println(c[i]);
			}
		}
	}
}
