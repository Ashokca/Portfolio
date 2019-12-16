package AP_Exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 
 * This class ask several questions that asks for the output in a
 * segment of code. Cycles through three random pieces of code for questions
 *  
 * @author Allen Yang and Andrew Stratton
 *
 */

public class IteratorQuestions extends Question{
   
	public IteratorQuestions()
    {
    	
        super.setupQuestion();

    }
	
	/**
	 * Runs the code in console with console io
	 * 
	 * @return score
	 */
    
    public static String mainTest ()
    {
    	Question q = new IteratorQuestions();
        q.askQuestionConsole();
        return q.getCounterMsg();
    }
    
    /**
     * sets up question by passing question and answer choices to superclass
     */
	
	@Override
	protected void setupQuestionData() {
		System.out.println("start");
		Random rand = new Random();
    	int arg1 = rand.nextInt(4);
    	int arg2 = rand.nextInt(16)+1;
    	int q = rand.nextInt(3)+1;
    	
		Integer intAnswer = questionBank(arg1, arg2, q);
		ArrayList<String> answerchoices = new ArrayList<String>(0);
        this.answer = Integer.toString(intAnswer);
		
		answerchoices.add(this.answer);

		while (answerchoices.size() < 5) {
			int i = rand.nextInt(11) + intAnswer - 5;
			if (!answerchoices.contains(Integer.toString(i))) {
				answerchoices.add(Integer.toString(i));
			}
		}
		Collections.shuffle(answerchoices);

		this.choiceA = answerchoices.get(0);
		this.choiceB = answerchoices.get(1);
		this.choiceC = answerchoices.get(2);
		this.choiceD = answerchoices.get(3);
		this.choiceE = answerchoices.get(4);
		
		switch (answerchoices.indexOf(this.answer)) {
		case 0:
			this.answerKey = this.charA;
			break;
		case 1:
			this.answerKey = this.charB;
			break;
		case 2:
			this.answerKey = this.charC;
			break;
		case 3:
			this.answerKey = this.charD;
			break;
		case 4:
			this.answerKey = this.charE;
			break;
		}

        this.question = "What does this method return?\n" + questionText(arg1, arg2, q);

	}
	
	/**
	 * question bank with actual pieces of code
	 * 
	 * @param aarg argument 1
	 * @param barg argument 2
	 * @param q question number
	 * @return answer
	 */
	
	public static int questionBank(int aarg, int barg, int q) {
		int val;
		val = 0;
		switch (q) {
		case 1:
			for (int i = aarg; i < barg; i++) {
				if ((val + i) % 2 == 0) {
					val += 3;	
				}
			}
			break;
		case 2:
			int i = 0;
			while(i < barg) {
				if (i == aarg) {
					i++;
					continue;
				}
				i++;
			}
			val = i;
			break;
		
		case 3:
			for (i = barg; i > aarg; i--)
		       {
		          val += 2;
		       }
		}
		return val;
	}
	
	/**
	 * question bank in text format
	 * 
	 * @param aarg argument 1
	 * @param barg argument 2
	 * @param q question number
	 * @return text format of question
	 */
	public static String questionText(int aarg, int barg, int q) {
		String text = "";
		switch (q) {
			case 1:
				text = String.format(
						"int val = 0;\n" +
						"for (int i = %d; i < %d; i++) {\n" + 
						"	if ((val + i) %% 2 == 0) {\n" + 
						"		val += 3;\n" + 
						"	}\n" + 
						"}", aarg, barg);
				break;
			case 2:
				text = String.format(
						"int i = 0;\n" + 
						"while(i < %d) {\n" + 
						"	if (i == %d) {\n" + 
						"		i++;\n" + 
						"		continue;\n" + 
						"	}\n" + 
						"	i++;\n" + 
						"}\n" + 
						"return i;\n", barg, aarg
						);
				break;
			case 3:
				text = String.format(
						"int val = 0 \n" +
						"for (i = %d; i > %d; i--)\n" + 
						"{\n" + 
						"	val += 2;\n" + 
						"} \n" +
						"return val;", barg, aarg
						);
		}
		return text;
	}
}