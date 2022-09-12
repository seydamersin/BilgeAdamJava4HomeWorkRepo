package com.bilgeadam.course04.HomeWork01;

import java.util.Scanner;

public class Backtracking {

	public static void main(String[] args) {
/*with recursive */


    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("please enter word :");
        String Word=scanner.nextLine();
        scanner.close();
 
        String FirstWord = cevir(Word);
        System.out.println("Backtracking word: " + FirstWord);
	}
 
    public static String cevir(String Word)
    {
        if (Word.isEmpty())
            return Word;
 
        return cevir(Word.substring(1)) + Word.charAt(0);
    }
    

	}


