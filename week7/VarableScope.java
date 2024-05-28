

public class VarableScope {
  
    public static void main(String[] args) {
        
// We are inside the  main method
  
   String txt = "This is the local variable in the main method!";
   System.out.println(txt);
//  in order for the sub method to run, we need to call the method in the main mothed
sub();

    }
public static void  sub() {
    String txt = "This is the local variable in the sub method!"; 

System.out.println(txt);



}








}





