package Statementsandloops;

public class ifstatement {

	public static void main(String[] args) {
		int a=90;
		int b=75;
		int c=650;
		//if statement
		if(a>b)
		{
			System.out.println("The value of A is greater than B");
			
		}
		//if else
		if(a<b)
		{
			System.out.println("The value of A is less than B");
		} 
		else
		{
			System.out.println("The value of A is greater than B");
		}
		//else if
		if(a<b)
		{
			System.out.println("The value of A is less than B");
		}
		else if(a>c)
		{
			System.out.println("The value of A is greater than B and c");
		}
		else
		{
			System.out.println("The value of A is greater than B and less than C");
		}
		//nested if
		if(a>b)
		{
			if(a<c)
		
		{
			System.out.println("The value of A is greater than B and less than C");
		}
		}	
			
		
		
	

	}

}
