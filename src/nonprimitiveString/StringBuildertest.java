package nonprimitiveString;

public class StringBuildertest {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Welcome to core");
		//append
		System.out.println("The append value of string is--->"+s.append(" java"));
		//insert
		System.out.println("The insert value of string is--->"+s.insert(11, "basic "));
		//replace
		System.out.println("The replace value of string is--->"+s.replace(11, 16," very basic "));
		//delete
		System.out.println("The delete value of string is--->"+s.delete(11, 16));
		//reverse
		System.out.println("The reverse value of string is--->"+s.reverse());
		//capacity
		System.out.println("The capacity value of string is--->"+s.capacity());


	}

}
