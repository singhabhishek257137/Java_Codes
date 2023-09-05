package javapackage;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class duplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		//creating a #map
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		//Checking each word
		for(String word:words)
		{
			//whether it is present in wordCount
			if(wordCount.containsKey(word.toLowerCase()))
				{
				//If it is present, incrementing it's count by 1
				 wordCount.put(word.toLowerCase(), wordCount.get(word.toLowerCase())+1);
				}
			else
			{
				//If it is not present, put that word into wordCount with 1 as it's value
				 wordCount.put(word.toLowerCase(), 1);
			}
		
		}
		//Extracting all keys of wordCount
		Set<String> wordsInString = wordCount.keySet();
		 //Iterating through all words in wordCount
		for (String word : wordsInString)
		{

            //if word count is greater than 1
			if(wordCount.get(word) > 1)
            {
                //Printing that word and it's count
 
                System.out.println(word+" : "+wordCount.get(word));
            }
		}

	}

}
