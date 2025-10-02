package wordRepetition;

import java.util.Scanner;

public class Runner {
	
	static String wordarray = "";
	
	static int count = 0;

	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter word1 ");
	    String word1 = myObj.nextLine();  // Read user input
	    
	    System.out.println("Enter word2 ");
	    String word2 = myObj.nextLine();  // Read user input
	    
	    
	    recursion(word1, word2);
	}
	
	public static String recursion(String word1, String word2) {
		if(!wordarray.equals(word1)) {
			wordarray += word1.charAt(count);
			
			if(wordarray.equals(word2)){
				return "yes "+word2 +" is in "+word1;
			}
			
			else {
				count += 1;
				return "";
			}
	    }
		
		else {
			return "no "+word2 +" is not in "+word1;
		}
	}
}
