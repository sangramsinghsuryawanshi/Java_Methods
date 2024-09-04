package usingmethodArray;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueArrEleReturnType 
{
    public int[] uniqueEle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array elements: ");
        for (int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<a.length;i+=2)
        {
        	if(a[i]<a[i+1])
        	{
        		int t=a[i];
        		a[i]=a[i+1];
        		a[i+1]=t;
        	}
        }
        return a;
    }
    public static void main(String[] args) 
    {
        UniqueArrEleReturnType u = new UniqueArrEleReturnType();
        int c[]=u.uniqueEle();
        System.out.println("Array with every second element greater than its left and right elements:");
        System.out.println(Arrays.toString(c));
    }
}
