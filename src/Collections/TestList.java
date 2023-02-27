package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		
		List<String>data=new ArrayList<String>();
		data.add("CORE JAVA");
		data.add("Selenium IDE");
		data.add("Selenium RC");
		data.add("Selenium Webdriver");
		data.add("Selenium Grids");
		
		System.out.println(data.size());
		System.out.println(data.get(4));
		
		System.out.println("<-----Whiole loop----->");
		
		int i=0;
		while(i<data.size())
		{
			System.out.println(data.get(i));
			i++;
		}
		System.out.println("<---foir loop--->");
		
		for(int j=0;j<data.size();j++)
		{
			System.out.println(data.get(j));
			
		}
		System.out.println("<----for Each---->");
		
		for (String str : data)
		{
			System.out.println(str);
			
		}
		System.out.println("<---iterator--->");
		
		Iterator<String>it=data.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	    
			
			
		
	}

}
