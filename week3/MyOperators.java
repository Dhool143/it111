

public class MyOperators{

  

    public static void main(String[] args){

    
   // Arithmetic operators
    // employee, wage, hours worked, overtime, the whole enchilada

    int regHours, overtimeHours;
    double overtimePay, regularPay, total;
    float wage;
    double hourlyWithOvertime;

    regHours = 40; 
    overtimeHours = 5;
    wage = 25.50F;
    regularPay = regHours * wage;
    overtimePay = (wage *1.5) * overtimeHours;
    total = overtimePay + regularPay;
    hourlyWithOvertime = total / (regHours + overtimeHours);

    System.out.println( "Regular pay: $" +regularPay+ " dollars");
    System.out.println("Overtimt pay: $" +overtimePay+ " dollar");
    System.out.println("Total pay: $" +total+ " dollars");
    System.out.println("Hourly rate with overtime: $" +hourlyWithOvertime+ " dollars");
   System.out.printf("$%.2f", hourlyWithOvertime);

// moulus operator

int number1, number2, number3;
number1 = 25;
number2 = 7;
number3 = number1 % number2;
System.out.println(number3);


if(number3 == 0) {
System.out.println(number1 + " is an even number");

} else {
 System.out.println(number1 + " is an ODD number");

}
//  we are now going shopping
// double tax, priceOfItem, taxOnItem, totalPrice;
// tax = .10;
// priceOfItem = 100.00;
// taxOnItem = priceOfItem * tax;
// totalPrice = priceOfItem + taxOnItem;
  

// System.out.println("Price of item is $" +priceOfItem+ " dollar");
// System.out.println("Tax is $" +taxOnItem+ " dollar");
// System.out.println("Price including tax is $" +totalPrice+ " dollar");

// double priceOfItem = 100;
// tax is 10 percent



 double  priceOfItem = 100;
 priceOfItem *= 1.10;

System.out.println("Total price of item is "  +priceOfItem+ " dollars");
System.out.println("Total price of item is: ");
System.out.printf("$%.2f", priceOfItem);
System.out.println(" dollars");




}
 
    
  }