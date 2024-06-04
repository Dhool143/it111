package Package_person_input;

import java.util.Scanner;

public class PersonDetails {


    public static void main(String[] args) {

// we need to create an object

        Person customer;
        customer = new Person();
//     we will be initializing additional variables
        int states = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name!");
        customer.name = input.next();
        System.out.println("Please enter your age!");
        customer.age = input.nextInt();
        System.out.println("Please enter your gender by entering For M or N");
        customer.gender =input.next(). charAt(0);
        System.out.println("Please enter you Zipcode( only 5 number please");
        customer.zipCode = input.next();

        System.out.println("Any traffic violation please enter true for yes, and false for no");
        customer.violations = input.nextBoolean();
//        add an  if else statement

        if(customer.violations == true) {

            System.out.println("Please type true if you had a DUI, or false if not");
            customer.violationDUI = input.nextBoolean();
            System.out.println("Please type true if you had a red light violation or false, if not");

            customer.violationRedLight = input.nextBoolean();
            System.out.println("Have you received any speeding tickets? Please type true for yes, or no for false tickets");
            customer.violationSpeeding = input.nextBoolean();


        }

        System.out.println("Please type your credit score");
        customer.creditScore = input.nextDouble();
        customer.display();
        System.out.println(customer.identifyRegion(states));
        double surcharge = 0;
        System.out.println("Your california surcharge is " + customer. californiaRegion(surcharge));
        double adjustedRate = 0;
        System.out.println("Age Category adjustment: " + customer.ageCategory(adjustedRate));
        double monthlyRate = 0;
        System.out.println("Violations and credit score adjustment: " + customer.getRate(monthlyRate));
        System.out.println("Your new monthly premium will be:  ");
        System.out.println(customer.baselineRate + customer.ageCategory(adjustedRate) + customer.californiaRegion(surcharge) + customer.getRate(monthlyRate));

    }
}
