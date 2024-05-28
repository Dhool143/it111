import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class OpenFile{

    public static void main(String[] args) {
        
   File file;
   Scanner inputFile;
   String fileName;


   fileName = JOptionPane.showInputDialog("Enter " + " the nameof the file");
//    attempt to open the file

try {

file = new File(fileName);
inputFile = new Scanner(file);
JOptionPane.showMessageDialog(null, "The file was found,yippy skippy, displayed in TRY");

} catch (Exception e) {

    JOptionPane.showMessageDialog(null, "The file was found, This is in CATCH");


}



    }
}