package usingmethodArray;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomShuffleArrEleWithReturnTypeAndArg 
{
	public int [] randomShuffle(int a[])
	{
		Random r = new Random();
		for(int i=0;i<a.length;i++)
		{
			int ind = r.nextInt(a.length);
			int t=a[i];
			a[i]=a[ind];
			a[ind]=t;
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		Random r = new Random();
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		RandomShuffleArrEleWithReturnTypeAndArg r1 = new RandomShuffleArrEleWithReturnTypeAndArg();
		int b[]=r1.randomShuffle(a);
		System.out.println("Shuffle Array element is: ");
		System.out.println(Arrays.toString(b));
	}
}
