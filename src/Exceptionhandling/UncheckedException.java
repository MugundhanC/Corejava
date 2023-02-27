package Exceptionhandling;

public class UncheckedException {

	public static void main(String[] args) {
		try
		{
		int a[]=new int[4];
		a[0]=90;
		a[1]=70;
		a[2]=60;
		a[3]=50;
		a[4]=65;
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
