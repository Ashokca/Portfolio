package AP_Exam;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

import javax.swing.JOptionPane;

/**
 * Class to support Array questions.
 *
 * @author (Nitya Pillai and Ellie Feng)
 * @version (1.0)
 */
public class ArrayQuestions extends Question 
{
	private String code;
	//creates random array of 5 integers, each integer falls between 1 and 30
	private int[]  array = IntStream.generate(() -> new Random().nextInt(30)).limit(5).toArray();
	
	
	public void printCode() {
		//pop up sample code when called from AP_UI.java through q2 object (pops up at the same
		//time as the rest of the question)
		JOptionPane.showMessageDialog(null, code, "Code to Generate Random Array of 5 Integers", JOptionPane.INFORMATION_MESSAGE);
	}
	/**
     * Constructor for objects of class ArrayQuestions
     * @param  void
	 * @wbp.parser.entryPoint
     */
	public ArrayQuestions()
	{
		//Random rand = new Random();
    	//int index = rand.nextInt(array.length);
		//setupQuestionData(array, index);
    	super.setupQuestion();
	}

	/**
     * Main test method to support console execution
     * @param  void
     * @return void
     */
	public static String mainTest ()
    	{
    		Question a = new ArrayQuestions();
        	a.askQuestionConsole();
        	return a.getCounterMsg();
    	}
	
    	/**
     * Array question setup
     *
     * @param  array  array given to use in a question
     * @param  index  index that the question is asking the user about
     * @return void
     */
	public void setupQuestionData(/*int[] array, int index*/)
   	 {  
		//String method;
		code = MethodCodeArray.getMethodCode();
		
		int[]  array = IntStream.generate(() -> new Random().nextInt(30)).limit(5).toArray();
    	// format question
		
		Random rand = new Random();
	    int index = rand.nextInt(array.length);
	     
        this.question = "Given: int[] array = " + Arrays.toString(array)+ ", what is the value of array[" +
                index +
                "]?"; 
        System.out.println(question);
        
        
        int index0 = array[0];
        int index1 = array[1];
        int index2 = array[2];
        int index3 = array[3];
        int index4 = array[4];
        
	//sets answer choices to String values
        this.choiceA = Integer.toString(index0);
        this.choiceB = Integer.toString(index1);
        this.choiceC = Integer.toString(index2);
        this.choiceD = Integer.toString(index3);
        this.choiceE = Integer.toString(index4);
        
        //creates answer key
        if (index==0) {
            answer = this.choiceA;
        	this.answerKey = this.charA;   
        } else if (index==1) {
            answer = this.choiceB;
            this.answerKey = this.charB;   
        } else if (index==2) {
            answer = this.choiceC;          
            this.answerKey = this.charC;   
        } 
          else if (index==3) {
            answer = this.choiceD;          
            this.answerKey = this.charD; 
        }
        else {
            answer = this.choiceE;
            this.answerKey = this.charE;  
        } 
        
        }
  
    }