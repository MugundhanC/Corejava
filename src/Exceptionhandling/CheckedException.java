package Exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	
	public static void main(String[] args) throws FileNotFoundException { 
		
		
		FileInputStream ip=new FileInputStream("C:\\Program Files (x86)\\F-Billing Revolution\\fbillingserver.docx");
	    
		//try
		{
		  //FileInputStream ip=new FileInputStream("C:\\Program Files (x86)\\F-Billing Revolution\\fbillingserver.docx");
		}
		//catch(Exception e)
		{
		  //System.out.println(e);
		}
		
		
		
	}

}
