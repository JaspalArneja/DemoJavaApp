

import java.awt.Canvas;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

/**
 *
 * @author jaspal
 */
public class DemoJavaApp extends WindowAdapter
{
    JFrame frame;
    JButton easy,med,hard,start_now;
    JLabel title,hardness_message,welcome_message;
    Canvas c;
    
    //constructor
    DemoJavaApp()
    {
        frame=new JFrame("Typing Master");
        easy=new JButton("EASY");
        med=new JButton("MEDIUM");
        hard=new JButton("HARD");
        start_now=new JButton("START THE TYPING TEST");
        title=new JLabel("***TYPING MASTER***");
        hardness_message=new JLabel("Choose the hardness level : ");
        welcome_message=new JLabel("WELCOME TO TYPING MASTER");
        
        frame.setSize(500, 500);
        frame.add(easy);
        frame.add(med);
        frame.add(hard);
        frame.add(start_now);
        frame.add(title);
        frame.add(hardness_message);
        frame.add(welcome_message);
        
        title.setBounds(170,50,200,50);
        welcome_message.setBounds(140,100,250,50);
        start_now.setBounds(150,200,200,70);
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addWindowListener(this);
        
    }
    
    public static void main(String[] args) 
    {
        DemoJavaApp obj=new DemoJavaApp();
        
    }
    
    @Override
    public void windowClosing(WindowEvent e) 
    {
        System.exit(0);
    }
}

