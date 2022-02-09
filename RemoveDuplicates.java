//Assignment 1
package week3.assignments;

public class RemoveDuplicates {
public static void main(String[] args) {
			String string1 = "We learn java basics as part of java sessions in java week1";		
			int count=0;
			  //Converts the string into lowercase  
	        String string = string1.toLowerCase();  
	        System.out.println(string);
	          
	        //Split the string into words using built-in function  
	        String words[] = string.split(" ");  
	          
	        System.out.println("Duplicate words in a given string : ");   
	        for(int i = 0; i < words.length; i++) {  
	            count = 1;  
	            for(int j = i+1; j < words.length; j++) {  
	                if(words[i].equals(words[j])) {  
	                    count++;  
	                    
	                }  
	            }  
	        			
	        //Displays the duplicate word if count is greater than 1  
            if(count > 1 )  
               words[i]=" ";  
            
	        System.out.print(words[i]+" ");
}
}			
}		
	


	


