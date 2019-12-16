package AP_Exam;

	import java.util.Scanner;
	import java.util.Random;
	/**
	 * Write a description of class Palindrome here.
	 *
	 * @author (your name)
	 * @version (a version number or a date)
	 */
	public class ForLoop
	{
	    // instance variables - replace the example below with your own
	    private int x;

	    /**
	     * Constructor for objects of class Palindrome
	     */
	    public static String main(String user)
	    {
	        // initialise instance variables
	        Scanner scan = new Scanner(System.in);  
	       
	        char [] array, r_array;
	       
	        int x = 0, y = 0, repeat = 0, length; 
	 
	         y = 0;
	 
	       
	          user = user.toLowerCase();
	           length = user.length(); 
	           
	          array = user.toCharArray();
	          r_array = user.toCharArray();
	           
	            for(x = length - 1; x >= 0; x--) 
	            {
	                r_array[y] = array[x]; 
	                y++;
	            }
	            String reverse = new String(r_array);
	          
	            if(user.equals(reverse)) 
	            {  
	                return("It is a palindrome");
	            } 
	            else 
	            {
	                return("It is not a palindrome");
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

