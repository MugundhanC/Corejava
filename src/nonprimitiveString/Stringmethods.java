package nonprimitiveString;

public class Stringmethods {

	public static void main(String[] args) {
		         String s1=new String("Welcome to core java");
		         String s2="Training for selenium";
		         String s3="Welcome to core java";
		
		        //Comparing two strings.return true if both are equal else false
				System.out.println("Is the string s1 and s2 are equal--->"+s1.equals(s2));
				System.out.println("Is the string s1 and s3 are equal--->"+s1.equals(s3));
				System.out.println("Is the string s1 and s3 are equal--->"+s1.equalsIgnoreCase(s3));
				
				//concatenates st1 and st2.
				System.out.println(s1+s2);
				System.out.println(s1.concat(s2));
				
				//retrieve the index character from string.
				System.out.println("The character index 11 is--->"+s1.charAt(11));
				
				//find the length
				System.out.println("the length of string s1 is--->"+s1.length());
				
				// converting lower case of whole string.
				System.out.println(s1.toLowerCase());
				
				//converting upper case of whole string.
				System.out.println(s1.toUpperCase());
				
				//retrieve the index character 'c'
				System.out.println("The character at index is--->"+s1.indexOf('c'));
				System.out.println("the character 2n at index is--->"+s1.indexOf('c',4));
				
				//retrieve the index of word 'java' for string.
				System.out.println("the index of word--->"+s1.indexOf("java"));
				
				//converting value from int to string.
				int i=90;
				String s4=String.valueOf(i);
				System.out.println(s4);
				
				//converting value from string to int
				String s5="75";
				int j=Integer.parseInt(s5);
				System.out.println(s5);
				
				//print the string starting from 5th index
				System.out.println("the substring of s1 is--->"+s1.substring(11));
				System.out.println("the substring of s1 is--->"+s1.substring(11, 15));
				
				//split string
				String s6="19/04/2005";
				String split[]=s6.split("/");
				System.out.println("the part 1 is--->"+split[0]);
				System.out.println("the part 2 is--->"+split[1]);
				System.out.println("the part 3 is--->"+split[2]);
				

	}

}
