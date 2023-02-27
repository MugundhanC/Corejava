package Methods;

public class Methodoverloading {

	public static void main(String[] args) {
		
	test("welcome");
	test("welcome"," core java");
	test("45");
		

	}
	public static void test(String s)
	{
		System.out.println(s);
	}
	public static void test(String s,String s1)
	{
		System.out.println(s+s1);
	}
	public static void test(int s)
	{
		System.out.println(s);
	}
}
