package Assisgment;

import java.util.HashSet;

public class DuplicateNoInAnArray {
	
	static int findRepeating(int arr[], int n)  
	{  
	    HashSet<Integer> s = new HashSet<Integer>(); 
	    for (int i = 0; i < n; i++)  
	    {  
	        if (s.contains(arr[i]))  
	        {
	        	return arr[i];  
	        }
	        else {
	            
	        s.add(arr[i]);
	        }
	    }  
	      
	    // If input is correct, we should  
	    // never reach here  
	    return -1;  
	}  

	public static void main(String[] args) {
		
		 int arr[] = { 9, 8, 2, 6, 1, 8, 5, 3, 4, 7 };  
		    int n = arr.length; 
		    System.out.println(findRepeating(arr, n));; 
		} 
		

	}


