package methodreturntype;

public class Testmethodreturn {

	public static void main(String[] args) {
		int d=add();
		System.out.println(d/2);
		sample s=testing();
		s.test();
	  

	}
	public static int add()
	{
		int a=90;
		int b=75;
		int c=a+b;
		return c;
	}
	public static sample testing()
	{
		return new sample();
		
	}

}
