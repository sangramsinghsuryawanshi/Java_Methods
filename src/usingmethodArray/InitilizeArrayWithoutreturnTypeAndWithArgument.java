package usingmethodArray;

public class InitilizeArrayWithoutreturnTypeAndWithArgument 
{
	public void ArrayInitilizeArgument(int a[])
	{
		System.out.println("Given array element with argument");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		InitilizeArrayWithoutreturnTypeAndWithArgument ia = new InitilizeArrayWithoutreturnTypeAndWithArgument();
		int a[]= {1,2,3,21,23,11};
		System.out.println("Array intilized in main Method");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		ia.ArrayInitilizeArgument(a);
	}

}
