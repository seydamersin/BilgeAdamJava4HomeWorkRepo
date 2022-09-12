package com.bilgeadam.course04.HomeWork01;

import java.util.Scanner;

public class PalindromTest {
	
	
	
		public PalindromTest() {
		
			
			{     
				Scanner scanner =new Scanner(System.in);
				
		        System.out.print("pls enter Word: ");
		        
			
				String Word = scanner.nextLine();
		        String NewWord = "";
		        for(int i = (Word.length()-1); i >= 0; i--)
		        
		        {
		            NewWord += Word.charAt(i);
		            scanner.close();
		        }
		        if(NewWord.equals(Word)) {
		            System.out.println("The entered word is a palindrome word.");
		        }
		        else {
		            System.out.println("The entered word is'not a palindrome word.");
		        }
		    }}
		

}
