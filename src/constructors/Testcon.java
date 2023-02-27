package constructors;

public class Testcon {

	public static void main(String[] args) {
		Testcon t=new Testcon();
		Testcon t1=new Testcon("Single argument");
		Testcon t3=new Testcon(75);

	}
	public Testcon()
	{
		System.out.println("Empty argument constructuor");
	}
	public Testcon(String s)
	{
	System.out.println(s);	
	}
	public Testcon(int s)
	{
		System.out.println(s);
	}

}
