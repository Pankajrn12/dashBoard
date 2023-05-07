package assignment;

import java.util.*;

public class Assignment {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    //
	    System.out.println("Enter a Sentence( any English sentence )");
	    String sentence = sc.nextLine();
	    System.out.println("Enter a Letter(any letter from A to Z)");
	    String letter = sc.nextLine();
	    //
	    int index = sentence.indexOf(letter);
	    //
	    if(index == -1){
	        System.out.println("The letter does not exist in the sentence");
	    }else{
	        System.out.println(sentence.substring(index+1));
	    }
	}

}
