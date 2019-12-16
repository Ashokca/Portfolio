package AP_Exam;

import java.util.*;
public class Recursion
{
     public static int test;
    public static int test2;
    public static String main(String user)
    {
        Scanner scan = new Scanner(System.in);
       
        int test = 0, test2 = 0;
        char test3;
        
        test = 0;
        test2 = 0;
       
   
          user = user.toLowerCase();
        boolean answer = check(user);
        
            if(answer == true)
            {
                return("true");
            }
            else
                return("false");
    }
    
    public static boolean check(String user)
    {
        if(test <= (user.length() - 1))
        {
            if(user.charAt(test) == user.charAt(((user.length() - 1) - test)))
            {
                test++;
                test2++;
                check(user);
            }
        }
        if(test2 == user.length())
        {
            return true;
        }
        else
            return false;
    }
}
