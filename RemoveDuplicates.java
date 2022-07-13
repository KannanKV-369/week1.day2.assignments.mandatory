package week1.day2.assignments.mandatory;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Pseudo code 

		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 

		 * g) Displaying the String without duplicate words	
		 */
		String text = "We learn java basics as part of java sessions in java week1";
		String[] str = text.split(" ");
		int count = 0;
		String end = "";
		for (int i = 0; i < str.length; i++) {
			for (int j = i+1; j < str.length; j++) {
				if(str[i].equalsIgnoreCase(str[j]))
				{
					count++;
					if(count!=0)
						str[j] = "";
				}

			}
			if(count!=0)
				count = 0;
		}
		for (String string : str) {

			end=end+" "+string;
		}
		System.out.println(end);
	}

}

