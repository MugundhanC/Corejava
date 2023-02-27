package variables;

public class VariableType {
	int b;//non static variable
	static int c;//global variable

	public static void main(String[] args) {
		//int a=90;
		VariableType t=new VariableType();
		t.b=90;
		 c=75;
		
	}
	public void test()
	{
		int a=90;//Local variable
		  b=77;
		  c=75;
		 
	}

}
