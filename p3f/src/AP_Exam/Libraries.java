package AP_Exam;
	import java.util.*;
	import java.io.*;
	import java.lang.reflect.*; 
	/**
	 * Write a description of class Palindrome here.
	 *
	 * @author (your name)
	 * @version (a version number or a date)
	 */
	public class Libraries
	{
	    // instance variables - replace the example below with your own
	    private int x;

	    /**
	     * Constructor for objects of class Palindrome
	     */
	    public static String main(String user)
	    {
	        // initialise instance variables
	        int repeat = 0;
	  
	       
	     
	        String palindrome = new StringBuffer(user).reverse().toString(); 
	        if(palindrome.equals(user)) 
	            { 
	                return("It is a Palindrome!");
	            } 
	            else 
	            {
	                return("It is not a Palindrome");
	            } 
	    
	        
	            
	    }

	    /**
	     * An example of a method - replace this comment with your own
	     *
	     * @param  y  a sample parameter for a method
	     * @return    the sum of x and y
	     */
	    public int sampleMethod(int y)
	    {
	        // put your code here
	        return x + y;
	    }
	}

