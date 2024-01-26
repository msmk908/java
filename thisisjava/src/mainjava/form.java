package mainjava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class form {

   private JFrame frame;
   private JTextField textField;
   private JTextField textField_1;
   private JTextArea textArea;
   
    


   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               form window = new form();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the application.
    */
   public form() {
      initialize();
   }
   
   
   
   public void setEvent() {
      
   }

   /**
    * Initialize the contents of the frame.
    */
   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 684, 575);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);
      
      JLabel lblNewLabel = new JLabel("입력1:");
      lblNewLabel.setBounds(50, 34, 52, 15);
      frame.getContentPane().add(lblNewLabel);
      
      textField = new JTextField();
      textField.setBounds(106, 28, 106, 21);
      frame.getContentPane().add(textField);
      textField.setColumns(10);
      
      JButton btnNewButton = new JButton("New button");
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            
            JDialog d = new JDialog(frame , "Swing 처음이요 ㅋㅋ", true);  
              d.getContentPane().setLayout( new FlowLayout() );  
              JButton b = new JButton ("OK");  
              b.addActionListener ( new ActionListener()  
              {  
                  public void actionPerformed( ActionEvent e )  
                  {  
                      
                  }  
              });  
              d.getContentPane().add( new JLabel (textField.getText()));  
              d.getContentPane().add(b);   
              d.setSize(300,300);    
              d.setVisible(true);  
         }
      });
      
      btnNewButton.setBounds(224, 27, 95, 23);
      frame.getContentPane().add(btnNewButton);
      
      JLabel lblNewLabel_1 = new JLabel("입력2:");
      lblNewLabel_1.setBounds(50, 65, 52, 15);
      frame.getContentPane().add(lblNewLabel_1);
      
      textField_1 = new JTextField();
      textField_1.setColumns(10);
      textField_1.setBounds(106, 59, 106, 21);
      frame.getContentPane().add(textField_1);
      
      //input 
      JButton btnNewButton_1 = new JButton("입력2");
      btnNewButton_1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            String str = textField_1.getText();
            if(!str.isEmpty()) {
               textArea.append(str + "\n");
            }
         }
      });
      btnNewButton_1.setBounds(224, 58, 95, 23);
      frame.getContentPane().add(btnNewButton_1);
      
      JPanel panel = new JPanel();
      panel.setBounds(404, 34, 171, 242);
      frame.getContentPane().add(panel);
      
      textArea = new JTextArea();
      textArea.setBounds(106, 90, 106, 231);
      frame.getContentPane().add(textArea);
      
      JButton clearButton = new JButton("clear");
      clearButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            
            textArea.removeAll();
            
         }
      });
      clearButton.setBounds(224, 91, 95, 23);
      frame.getContentPane().add(clearButton);
   }
}