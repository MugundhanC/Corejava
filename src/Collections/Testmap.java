package Collections;

import java.util.HashMap;
import java.util.Map;

public class Testmap {

	
	public static void main(String[] args) {
		
		Map<Integer,String>data=new HashMap<Integer,String>();
		
		data.put(64,"Test3");
		data.put(48,"Test6");
		data.put(65,"tEST8");
		data.put(87,"Test1");
		
		data.forEach((I,V)->System.out.println("THE KEY IS--->"+I+"THE VALUE IS--->"+V));
		
		}

}
