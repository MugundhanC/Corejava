package Methods;

public class Methodtypes {

	public static void main(String[] args) {
		add();
		Methodtypes t=new Methodtypes();
		t.mul();
		
	}
	public static void add()
	{
		int a=90;
		int b=75;
		int c=a+b;
		System.out.println(c);
		
		}
	public void mul()
	{
		int a=90;
		int b=75;
		int c=a*b;
		System.out.println(c);
		div();
		mod();
	}
	public static void div()
	{
		int a=90;
		int b=75;
		int c=a/b;
		System.out.println(c);
	}
	public void mod()
	{
		int a=90;
		int b=75;
		int c=a%b;
		System.out.println(c);
	}

}
