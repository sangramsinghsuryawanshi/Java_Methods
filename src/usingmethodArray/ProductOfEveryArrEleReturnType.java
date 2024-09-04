package usingmethodArray;
import java.util.Scanner;
public class ProductOfEveryArrEleReturnType 
{
	public int productArryEle()
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
        int p=0;
        System.out.print("\nGiven product of each array element id: ");
        for(int i=0;i<a.length;i++)
        {
        	p=1;
        	for(int j=0;j<a.length;j++)
        	{
        		if(i!=j) {
        		p=p*a[j];
        		}
        	}
        	System.out.println(p+" ");
        }
        return p;
    }
    public static void main(String[] args) 
    {
    	ProductOfEveryArrEleReturnType u = new ProductOfEveryArrEleReturnType();
       u.productArryEle();
//        System.out.println(+c+" ");
    }
}
