package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Testset {

	public static void main(String[] args) {
		Set<String>data=new HashSet<String>();
		
		data.add("CORE JAVA");
		data.add("Selenium IDE");
		data.add("Selenium RC");
		data.add("Selenium Webdriver");
		data.add("Selenium Grids");
		
		System.out.println(data.size());
		
		System.out.println("<----for each---->");
		
		for (String str : data) {
			System.out.println(str);
			
		}
		System.out.println("<----Iterator---->");
		
		Iterator<String>it=data.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
