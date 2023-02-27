package Methodaccess;

public class specifier {

	public static void main(String[] args) {
		Test_publicaccess();
		Test_protectedaccess();
		Test_privateaccess();
		Test_default();
		

	}
	public static  void Test_publicaccess()
	{
		System.out.println("Testing for public access");
	}
	protected static void Test_protectedaccess()
	{
		System.out.println("Testing for protected access");
	}
	private static void Test_privateaccess()
	{
		System.out.println("Testing for private access");
	}
	static void Test_default()
	{
		System.out.println("Testing for default access");
	}

}
