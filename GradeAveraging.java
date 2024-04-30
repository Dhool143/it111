package week4;

import java.util.Scanner;

public class GradeAveraging {
    public static void main(String[] args) {
        
// ask the end user input their numerical grades

int grade;
double total = 0;
double average;
int counter = 1;

Scanner input = new Scanner(System.in);

// our while loop will count how many times we are asking

while(counter <= 5) {
System.out.println("Please enter your " +counter+  " numerical grade");
grade = input.nextInt();
total += grade;
counter += 1;
// close while loop
}

String message;
char letterGarade;


counter -= 1;

average = total/counter;
 
System.out.println("You have earned at average grade of " +average);

if(average >= 90 && average < 100) {
letterGarade = 'A';
message = "Excelent work!";

} else if (average >= 80 && average < 90) {
letterGarade = 'B';
message = "Solid work!";


}else if (average >= 70 && average < 80) {
letterGarade = 'C';
message = "More studing necessary";

} else if (average >= 65 && average < 70) {
letterGarade = 'D';
message = "Sqeajing by!";
} else {
letterGarade = 'A';
message = "Excelent work!";



}
System.out.println("You have earned the following letter grade "  +letterGarade+ ", and here is the message: " +message);


    }
}
