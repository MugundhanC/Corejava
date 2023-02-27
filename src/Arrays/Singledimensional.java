package Arrays;

public class Singledimensional {

	public static void main(String[] args) {
		int a[]=new int[4];
		a[0]=90;
		a[1]=70;
		a[2]=60;
		a[3]=50;
		
		System.out.println(a.length);
		System.out.println(a[2]);
		
		int b[]=a.clone();
		
		for (int i=0;i<b.length;i++)
		{
		
			System.out.println(b[i]);
		}
	
	} 

}
