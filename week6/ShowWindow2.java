package week6;
import javax.swing.*; // Needed for Swing  classes
import java.awt.*;

public class ShowWindow2  {
    public static void main(String[] args) {

        //  declare our variables
        //  we are going to make the CONSTANTS


        final int WINDOW_WIDTH = 450;
        final int WINDOW_HEIGHT = 450;

            JFrame window = new JFrame();
            JLabel myLabel1, myLabel2;
            JTextField TextField1, TextField2;

                // set the title
            window.setTitle("A Simple Window");
            //  setting the size of our window
            window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
                // set the location of our window
        window.setLocation(400, 200);
         // set the content background  color of our window
        window.getContentPane().setBackground(Color.RED);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //  close the window and exit the program

        myLabel1 = new JLabel("My First Big Label!!!");
        myLabel1.setBounds(50,70,250,45);
        TextField1 = new JTextField();
        TextField1.setBounds(50,100,300,45);
        window.add(myLabel1);
        window.add(TextField1);

        myLabel2 = new JLabel("My Second Big Label!");
        myLabel2.setBounds(65,150,300,45);
        TextField2 = new JTextField();
        TextField2.setBounds(50,200,300,45);
        window.add(myLabel2);
        window.add(TextField2);

        myLabel1.setFont(new Font("Times", Font.PLAIN,20));
        myLabel2.setFont(new Font("Times", Font.BOLD, 20));



        window.setLayout(null);
             // display the window - if we do not display the window, it will not display!
              // display the window is a

            window.setVisible(true);


        }


    }



    




