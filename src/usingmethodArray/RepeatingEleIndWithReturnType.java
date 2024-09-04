package usingmethodArray;

import java.util.Scanner;

public class RepeatingEleIndWithReturnType 
{

	public int[] repatDulArrEle()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter array element: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter repating element: ");
		int k = sc.nextInt();
		int firstIndex = -1;
	    int lastIndex = -1;
	    for (int i = 0; i < a.length; i++) 
	    {
	    	if (a[i] == k) 
	        {
	    		if (firstIndex == -1) 
	            {
	    			firstIndex = i;
	            }
	                lastIndex = i;
	        }
	    }

	        if (firstIndex == -1) 
	        {
	            System.out.println("Element not found in the array.");
	        }
	        else 
	        {
	            System.out.println("The first occurrence of the element is at index: " + firstIndex);
	            System.out.println("The last occurrence of the element is at index: " + lastIndex);
	        }

	       
	        return new int[] {firstIndex, lastIndex};
	    }

	    public static void main(String[] args) 
	    {
	        RepeatingEleIndWithReturnType m = new RepeatingEleIndWithReturnType();
	        int[] result = m.repatDulArrEle();
	        System.out.println("First Index: " + result[0]);
	        System.out.println("Last Index: " + result[1]);
	    }
	}