package AP_Exam;

import java.util.*;
/**
 * For Loops
 *
 * @authors Ashok Canchi and Yash Trividei
 * @version 1.0
 * @created    December 11, 2019
 */



public class ForLoopQuestion extends Question {
        public ForLoopQuestion()
        {
        	super.setupQuestion();
        }
        public static String maintest()
        {
	    	Question q = new ForLoopQuestion();
	        q.askQuestionConsole();
	        return q.getCounterMsg();
        }
        

        protected void setupQuestionData() {
        	 String intArray[] = {"4 16", "4 10 16", "0 6 12 18", "1 4 7 10 13 16 "}; //string array with 4 possibel answers
             Random rand = new Random(); 
            String text = String.format(
						"for (integer k = 0; k < 20; k = k + 2) \n" +
						"{\n"  + 
						" if (k %% 3 == 1)\n" + 
						"  System.out.print(k + )\n" + 
						"} \n"
						);
             String Correct = "4 10 16"; //making a "correct" answer
             boolean tester = true;
             int intarray[];
             intarray = new int[4]; //declaring an integer array
            int correct = rand.nextInt(4); 
            int incorrect = 0, incorrect1 = 0, incorrect2 = 0, x = 0, y = 0;
            intarray[0] = correct;
            while (tester == true) 
            {  
                incorrect = rand.nextInt(4);
                for(x = 0; x < 1; x++)   //this is how to make sure the random number we get hasn't alreaady been chosen before
                {  
                    if (incorrect != intarray[x]) 
                    { 
                        y++;
                    } 
                 }
                    if (y == 1) 
                    tester = false;  
                    else 
                    y = 0;
             }
            intarray[1] = incorrect;  //assigning random numbers in the integer array
            incorrect1 = sampleMethod(incorrect1, 2, intarray);
            intarray[2] = incorrect1; 
            incorrect2 = sampleMethod(incorrect2, 3, intarray);
            intarray[3] = incorrect2; 
            this.question = text;
            System.out.println("for (integer k = 0; k < 20; k = k + 2)");  
            System.out.println("{");  
            System.out.println(" if (k % 3 == 1)"); 
            System.out.println("  System.out.print(k + )");
            System.out.println("}"); 
            this.choiceA =  intArray[correct]; //printing out a spot on the string array from a random number between (0-3)
            this.choiceB =  intArray[incorrect]; 
            this.choiceC = intArray[incorrect1]; 
            this.choiceD =  intArray[incorrect2]; 
            if ( intArray[correct].equals(Correct)) 
            	answer = this.choiceA;  
            if ( intArray[incorrect].equals(Correct))  
            	answer = this.choiceB;  
            if ( intArray[incorrect1].equals(Correct))  
            	answer = this.choiceC;  
            if ( intArray[incorrect2].equals(Correct))  
            		answer = this.choiceD; 
        }
           
         public static int sampleMethod(int y, int x, int array[]) //we made a method to make sure the random nuber we get hasn't already been seelected before
         {  
        	 {
             Random rand = new Random();
             boolean tester = true;  
             int z = 0, l;
             while (tester == true) 
            {  
                y = rand.nextInt(4);
                for(l = 0; l < x; l++) 
                {  
                    if (y != array[l]) 
                    { 
                        z++;
                    } 
                 }
                    if (z == x) 
                    tester = false;  
                    else 
                    z = 0;
             }
          return y;   //returning an integer
         }
         
     } 
			  }
