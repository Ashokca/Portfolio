package AP_Exam;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menuControl extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
  

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    menuControl frame = new menuControl();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public menuControl() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        
        JMenu mnCalculator = new JMenu("Intro");
        menuBar.add(mnCalculator);
        
        JMenu mnJumpers = new JMenu("Jumpers");
        mnCalculator.add(mnJumpers);
        
        JMenu mnMiniLabs = new JMenu("Minilab");
        menuBar.add(mnMiniLabs);
        
        JMenuItem mntmPL = new JMenuItem("Programming Languages Lab");
        mnMiniLabs.add(mntmPL);
        
        JMenuItem mntmOriginal = new JMenuItem("Original");
        mnJumpers.add(mntmOriginal);
        
        JMenuItem mntmInputs = new JMenuItem("Inputs");
        mnJumpers.add(mntmInputs);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Pythagorus");
        mnCalculator.add(mntmNewMenuItem);
        
        JMenu mnNewMenu = new JMenu("String Labs");
        menuBar.add(mnNewMenu);
        
        
        JMenuItem mntmShorthand = new JMenuItem("Shorthand");
        mnNewMenu.add(mntmShorthand); 
        
        
        JMenuItem mntmPalindrom = new JMenuItem("Palindrom 3");
        mntmPalindrom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Palindrome frame = new Palindrome();
                frame.setVisible(true);         
            }
        });
        mnNewMenu.add(mntmPalindrom);
      
        
        JMenu mnSprint = new JMenu("Jigsaw");
        menuBar.add(mnSprint);
        
        JMenu mnAPtest = new JMenu("AP Test");
        menuBar.add(mnAPtest);
      
        JMenuItem mntmCalculator = new JMenuItem("Calculator");
        mntmCalculator.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Calculator frame = new Calculator();
                frame.setVisible(true);
            }
            
        });
        mnSprint.add(mntmCalculator);
        
        JMenuItem mntmForLoopQuestion = new JMenuItem("For Loop Question");
        mntmForLoopQuestion.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	AP_UI frame = new AP_UI(); 
            	frame.setVisible(true);
            	
            	
            }
        });
        mnAPtest.add(mntmForLoopQuestion);
    }
    
}