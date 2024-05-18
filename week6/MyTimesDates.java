package week6;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyTimesDates {
   
    public static void main(String[] args) {
        
LocalDate currenDate = LocalDate.now();

System.out.println(currenDate);
// don't like that - I like to see month, day of the week and the year


Month currentMonth = LocalDate.now(). getMonth();
System.out.println(currentMonth);

 DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
 System.out.println(currentDay);

//  the year would have to be an integer


int currenyYear = LocalDate.now().getYear();

System.out.println(currenyYear);


// we would like to know the number of the day - if today is the 15 of the month - 15

int currentDayNumber = LocalDate.now().getDayOfMonth();
System.out.println(currentDayNumber);
System.out.println("Today is "+currentDay+ ", "  +currentMonth+ " " +currentDayNumber+ ", " +currenyYear+ "!!!");





}


}
