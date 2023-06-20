package Package0615a;

import java.util.Scanner;

public class MyActivity04 {

	public static final int PASSWORD_LENGTH = 8;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Password rules
		 * A password must have at least 8 characters. 
		 * A password consists of only letters and digits. 
		 * A password must contain at least two digits.
		 */

		 Scanner kb = new Scanner(System.in);
		 System.out.printf("Password rules:%n"
				 + "1. A password must have at least 8 characters.%n"
				 + "2. A password consists of only letters and digits.%n"
				 + "3. A password must contain at least two digits%n"
				 + "Input a password (You are agreeing to the above Terms and Conditions.): abcd1234%n"
				 + "Password is valid: abcd1234%n");

		System.out.println("please input your password:");
		 
		 String pass = kb.next();

		 boolean result = isValidPass(pass);
		 if(result) {
			 System.out.println("Password is valid: " +  pass);
		 }else {
			 System.out.println("Password is NOT valid!");
		 }
		 
		 kb.close();
 
	 }
 
	 public static boolean isValidPass(String password) 
	 {
		 if (password.length() < PASSWORD_LENGTH) 
		 {
			 return false;
		 }

		 int charCount = 0;
		 int numCount = 0;
		 
		 for(int i = 0 ; i < password.length(); i++) 
		 {
			 char mych = password.charAt(i);
			 
			 if(isNum(mych)) 
			 {
				 numCount++;
			 }
			 else if(isLetter(mych))
			 {
				charCount = charCount + 1;
			 }else
			 {
				return false;
			 }
		 }
		 
		return( numCount>=2 );
}
 
	 public static boolean isLetter(char ch)
	{   
		 ch = Character.toUpperCase(ch);
		 if(ch>='A' && ch <='Z') 
		 {
			 return true;
		 }
		 else 
		 {
			 return false;
		 }
	}
	 
	 public static boolean isNum(char ch) 
	 {
		 if(ch >='0' && ch <= '9') 
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		 
	}


}
