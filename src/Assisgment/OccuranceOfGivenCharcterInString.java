package Assisgment;

public class OccuranceOfGivenCharcterInString {
	
	//---------------------------------How to find ocurrance of given charcter in a string---------------------------
	public static int count(String s, char c) 
    { 
        int res = 0; 
  
        for (int i=0; i<s.length(); i++) 
        { 
            // checking character in string 
            if (s.charAt(i) == c) 
            res++; 
        }  
        return res; 
    } 

	public static void main(String[] args) {
		String str= "geeksforgeeks"; 
        char c = 'e'; 
        System.out.println(count(str, c)); 

	}

}
