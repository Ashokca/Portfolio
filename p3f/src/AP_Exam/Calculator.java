package AP_Exam;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.lang.Math;
public class Calculator extends menuControl {
    /**
     *
     */
    // view section ++
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel calcArea;
    protected Object frame;
    
    // calculator control
    private String calcAreaDefault = new String("0.0");
    private boolean initialCalcAreaInputState;
    private enum STATE { INITIAL, SAVE1, SAVE2, CALC };
    private STATE mathState;
    
    // calculator values
    private enum OPERATOR { NOOP, PLUS, MINUS, DIVIDE, MULTIPLY, SQUARE, SQRT };
   private OPERATOR mathOp;
    private double arg1;
   private double arg2;
   private double calcAnswer;
    /**
     * Launch the application.
     */
/*
   public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    calculator frame = new calculator();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
*/
    
    /**
     * Calculator control
     */

private void calculateAnswer()   // method to perform calculation
    {
        switch(mathOp)
        {
            case PLUS:
                calcAnswer = arg1 + arg2;
                break;
            case MINUS:
                calcAnswer = arg1 - arg2;
                break;
            case DIVIDE:
                calcAnswer = arg1 / arg2;
                break;
            case MULTIPLY:
                calcAnswer = arg1 * arg2;
                break;
            case SQUARE:
                calcAnswer = arg1 * arg1;
                break;
            case SQRT:
                calcAnswer = Math.sqrt(arg1);
            case NOOP:
                calcAnswer = arg1;
        }
        calcArea.setText(String.valueOf(calcAnswer));
        arg1 = Double.valueOf(calcArea.getText());
        mathState = STATE.CALC;
        initialCalcAreaInputState = true;
    }
    
    /**
     * Save values for Calculator.
     */
    private void saveValueOfArg1() { // method to store 1st value in calculation (arg1)
        arg1 = Double.valueOf(calcArea.getText());
        mathState = STATE.SAVE1;
        initialCalcAreaInputState = true;
    }
    
    private void saveValueOfArg2() { // method to store 2nd value in calculation (arg2)
        if (mathState != STATE.CALC) {
            arg2 = Double.valueOf(calcArea.getText());
            mathState = STATE.SAVE2;
        }
    }
    
    private void saveValueOfMathOp(OPERATOR op) { // method to store operator
        mathOp = op;
    }
    
    /**
     * Update the Calculation area display
     */
    private void updateCalcArea(String string) {
        if (initialCalcAreaInputState) {  // sets text to string on initial key typed
            calcArea.setText(string);
            initialCalcAreaInputState = false;
        } else  {                         // concatenates string to end of text subsequent keys typed
            calcArea.setText(calcArea.getText() + string);
        }
    }
    
    private void clearCalculator() {  // helper method to clear and update calculator to default
        calcArea.setText(calcAreaDefault);
        mathState = STATE.INITIAL;
        initialCalcAreaInputState = true;
        arg1 = 0.0;
        arg2 = 0.0;
        calcAnswer = 0.0;
    }
    /**
     * Create the frame.
     */
    public Calculator() {
        
        
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(100, 0, 25));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
    
        
        calcArea = new JLabel(calcAreaDefault);
        calcArea.setHorizontalAlignment(SwingConstants.RIGHT);
        calcArea.setBounds(124, 38, 225, 16);
        contentPane.add(calcArea);
        
        
        JButton button_1 = new JButton("1");
        button_1.setBackground(new Color(0, 0, 255));
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateCalcArea(button_1.getText());
            }
        });
        button_1.setBounds(53, 142, 41, 29);
        contentPane.add(button_1);
        
        JButton button_2 = new JButton("2");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateCalcArea(button_2.getText());
            }
        });
        button_2.setBounds(106, 142, 41, 29);
        contentPane.add(button_2);
        
        JButton button_3 = new JButton("3");
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateCalcArea(button_3.getText());
            }
        });
        button_3.setBounds(159, 142, 41, 29);
        contentPane.add(button_3);
        
        JButton button_4 = new JButton("4");
        button_4.setBackground(Color.RED);
        button_4.setForeground(Color.RED);
        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateCalcArea(button_4.getText());
            }

});
        button_4.setBounds(53, 112, 41, 29);
        contentPane.add(button_4);
        
        JButton button_5 = new JButton("5");
        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateCalcArea(button_5.getText());
            }
        });
        button_5.setBounds(106, 112, 41, 29);
        contentPane.add(button_5);
        
        JButton button_6 = new JButton("6");
        button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateCalcArea(button_6.getText());
            }
        });
        button_6.setBounds(159, 112, 41, 29);
        contentPane.add(button_6);
        
        JButton button_7 = new JButton("7");
        button_7.setBackground(Color.DARK_GRAY);
        button_7.setForeground(Color.BLACK);
        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateCalcArea(button_7.getText());
            }
        });
        button_7.setBounds(53, 82, 41, 29);
        contentPane.add(button_7);
        
        JButton button_8 = new JButton("8");
        button_8.setBackground(Color.DARK_GRAY);
        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateCalcArea(button_8.getText());
            }
        });
        button_8.setBounds(106, 82, 41, 29);
        contentPane.add(button_8);
        
        JButton button_9 = new JButton("9");
        button_9.setBackground(Color.DARK_GRAY);
        button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                updateCalcArea(button_9.getText());
            }
        });

button_9.setBounds(159, 82, 41, 29);
        contentPane.add(button_9);    
        
        
        JButton button_divide = new JButton("/");
        button_divide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveValueOfArg1();
                saveValueOfMathOp(OPERATOR.DIVIDE);
            }
        });
        button_divide.setBounds(255, 112, 41, 29);
        contentPane.add(button_divide);
        
        JButton button_equal = new JButton("=");
        button_equal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveValueOfArg2();
                calculateAnswer();
            }
        });
        button_equal.setBackground(Color.CYAN);
        button_equal.setBounds(212, 142, 84, 29);
        contentPane.add(button_equal);
        
        JButton button_clear = new JButton("AC");
        button_clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clearCalculator();
            }
        });
        button_clear.setBackground(Color.CYAN);
        button_clear.setBounds(307, 146, 60, 21);
        contentPane.add(button_clear);
        
        JButton button_plus = new JButton("+");
        button_plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveValueOfArg1();
                saveValueOfMathOp(OPERATOR.PLUS);
            }
        });
        button_plus.setBounds(212, 82, 41, 29);
        contentPane.add(button_plus);
        
        JButton button_multiply = new JButton("*");
        button_multiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveValueOfArg1();
                saveValueOfMathOp(OPERATOR.MULTIPLY);
            }
        });
        button_multiply.setBounds(255, 82, 41, 29);
        contentPane.add(button_multiply);
        
        JTextPane textPane = new JTextPane();
        textPane.setBounds(141, 38, 1, 16);
        contentPane.add(textPane);
        
       
        
        JButton button = new JButton("-");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveValueOfArg1();
                saveValueOfMathOp(OPERATOR.MINUS);
            }
        });
        button.setBounds(212, 112, 41, 29);
        contentPane.add(button);
        
       
       
        
        // prepare Calculator values
        clearCalculator();
    }
}