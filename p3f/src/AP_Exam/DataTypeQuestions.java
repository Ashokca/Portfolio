package AP_Exam;

import java.util.Random;



/**
 * Class to support Data type conversion from double to various data types.
 *
 * @author (John Mortensen)
 * @version (1.1)
 */
public class DataTypeQuestions extends QuestionRandom
{
	private String[] datatype = {"int", "float", "char"};		// conversions supported (from double)
	private int[] multiplier = {10, 100, 1000};					// math multipliers used

	/**
     * Constructor for objects of class DataTypeQuestions
     * 
     * @param  void
     */
    public DataTypeQuestions()
    {
    	// This outputs constructor being run
        System.out.println("DataTypeQuestions Constructor");

    	
    	
    	// Required to organize dynamic structures for Choices after data is defined
    	super.setupQuestion();
    }
    
    public static String mainTest ()
    {
    	Question q = new DataTypeQuestions();
        q.askQuestionConsole();
        return q.getCounterMsg();
    }
     
    /**
     * Sets up a Data Type question according to instance variables (this...) in Question class 
     *
     * @param  datatype     data type of reference
     * @param  number       number in conversion
     * @return void
     */
    @Override
    protected void setupQuestionData()
    {        
    	// Logic to setup data for Data Conversion questions
    	Random rand = new Random();
    	double number = rand.nextDouble() * multiplier[rand.nextInt(multiplier.length)];
    	Integer index = rand.nextInt(datatype.length);
    	String dataTypeName = datatype[index];
    	
        // format question base off of dataTypeName and number from arguments
        this.question = String.format(
            "Which represents double " +
            String.format
             ("%.8f",
              number) +
            " conversion to a " +
            dataTypeName +
            "?");
                    
        // format question choices with calculated answer
        this.choiceA = String.format
            ("(float)%.8f equals %f",
            number, (float)number);
        this.choiceB = String.format
            ("(int)%.8f equals %d",
            number, (int)number);
        this.choiceC = String.format
            ("Double.toString(%f).charAt(0) equals %c",
            number, Double.toString(number).charAt(0));
        this.choiceD = String.format
            ("(double)%.8f equals %.8f",
            number, number);
        this.choiceE = "All of the above";
        
        // find answer key by dataTypeName in question
        if (dataTypeName == "float")
        {
            this.answer = this.choiceA;
            this.answerKey = this.charA;
        } else if (dataTypeName.contentEquals("int")) {
            this.answer = this.choiceB;
            this.answerKey = this.charB;
        } else if (dataTypeName.contentEquals("char")) {
            this.answer = this.choiceC;
            this.answerKey = this.charC;
        } else if (dataTypeName.contentEquals("double")) {
            this.answer = this.choiceD;
            this.answerKey = this.charD;
        } else {
            this.answer = this.choiceE;
            this.answerKey = this.charE;
        }
        
    }
}