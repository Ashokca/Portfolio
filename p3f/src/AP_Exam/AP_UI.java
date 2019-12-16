
package AP_Exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import AP_Exam.AP_Console;


import AP_Exam.*;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class AP_UI extends menuControl {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextArea testQuestion = new JTextArea();
    private JTextArea testChoices = new JTextArea();
    private JTextArea testQuestionAnswer = new JTextArea();
    
    /**
     * Create the frame.
     */
    public AP_UI() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        setBounds(100, 100, 445, 493);


        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblExamSections = new JLabel("Exam Sections");
        lblExamSections.setBounds(10, 6, 91, 16);
        contentPane.add(lblExamSections);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(16, 128, 411, 105);
        contentPane.add(scrollPane);
        scrollPane.setColumnHeaderView(testQuestion);
        testQuestion.setEditable(false);
        testQuestion.setLineWrap(true);

        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.setBounds(16, 244, 411, 135);
        contentPane.add(scrollPane_1);
        scrollPane_1.setColumnHeaderView(testChoices);
        testChoices.setEditable(false);
        testChoices.setLineWrap(true);
        
        JLabel lblAnswer = new JLabel("Answer");
        lblAnswer.setBounds(10, 391, 61, 16);
        contentPane.add(lblAnswer);
        testQuestionAnswer.setBounds(70, 391, 357, 39);
        testQuestionAnswer.setEditable(false);
        testQuestionAnswer.setLineWrap(true);
        contentPane.add(testQuestionAnswer);
        
        JButton btnMath = new JButton("Math");
        btnMath.setBounds(10, 21, 70, 29);
        btnMath.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AP_Exam.Question q = new AP_Exam.MathQuestions();
                    testQuestion.setText(q.getQuestion());
                    testChoices.setText(q.getChoices());
                    testQuestionAnswer.setText(q.getAnswer());
                }
            });
        contentPane.add(btnMath);
        
      


        JButton btnDataTypes = new JButton("Data Types");
        btnDataTypes.setBounds(170, 21, 100, 29);
        btnDataTypes.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AP_Exam.Question q = new AP_Exam.DataTypeQuestions();
                    testQuestion.setText(q.getQuestion());
                    testChoices.setText(q.getChoices());
                    testQuestionAnswer.setText(q.getAnswer());
                }
            });
        contentPane.add(btnDataTypes);

        

        JButton btnBinaryMath = new JButton("Binary Math");
        btnBinaryMath.setBounds(75, 21, 101, 29);
        btnBinaryMath.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AP_Exam.Question q = new AP_Exam.BinaryMathQuestions();
                    testQuestion.setText(q.getQuestion());
                    testChoices.setText(q.getChoices());
                    testQuestionAnswer.setText(q.getAnswer());
                }
            });
        contentPane.add(btnBinaryMath);

     

        JButton btnConsole = new JButton("C");
        btnConsole.setBounds(406, 25, 21, 18);
        btnConsole.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    AP_Console.main();
                }
            });

    
      
        


     
           JButton btnForLoops = new JButton("For Loops");
        btnForLoops.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		AP_Exam.Question q = new AP_Exam.ForLoopQuestion();
                testQuestion.setText(q.getQuestion());
                testChoices.setText(q.getChoices());
                testQuestionAnswer.setText(q.getAnswer());
        	}
        });
        


        btnForLoops.setBounds(440, 45, 97, 29);

        contentPane.add(btnForLoops);
        
       

                
    }
}
