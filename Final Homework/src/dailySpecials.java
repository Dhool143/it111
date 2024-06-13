
import java.util.Scanner;

public class dailySpecials {


    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends( Monday - Friday only!");
        specials = input.next();

// in the world of coffee, I need a name of a coffee beverage and a price


        String coffee = null;
        double price = 0;
        int quantity;


       boolean saturday = specials.equalsIgnoreCase("Saturday");
       boolean sunday = specials.equalsIgnoreCase("Sunday");

//     !!!! NOW DO THIS !!!!

        while (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();

            saturday = specials.equalsIgnoreCase("Saturday");
            sunday = specials.equalsIgnoreCase("Sunday");


        }
        switch (specials) {

                //  boolean Monday, Tuesday, Wednesday, Thursday,Friday = false;
                // my cases will be the day of the week

                case "Monday":
                    coffee = "Latte";
                    price = 4.95;

                    break;


                case "Tuesday":
                    coffee = "Frapp";
                    price = 4.95;

                    break;


                case "Wednesday":
                    coffee = "Cappucino";
                    price = 4.35;

                    break;


                case "Thursday":
                    coffee = "Regular Joe";
                    price = 1.0;

                    break;


                case "Friday":
                    coffee = "Green Tea Latte";
                    price = 6.95;

                    break;


                //    System.out.println("Please enter a valid day, or check your spelling!");
            }
            System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);
            System.out.println("How many " + coffee + "s  would you like to order?");
            quantity = input.nextInt();

            if (quantity == 0) {
                System.out.println("Looks like you don't like " + coffee + "s. So sad!!!");

            } else if (quantity == 1) {
                System.out.println("Looks like you are ordering only 1 " + coffee + " today!");

            } else if (quantity >= 5 && quantity < 10) {
                System.out.print("Look like you qualify for a 10% discount! ");
                System.out.print("You have ordered " + quantity + " " + coffee + "s, including the discount, this is your total: ");
                System.out.printf("$%.2f", (quantity * price) * .9);
                System.out.println();
                System.out.print("You have saved ");
                System.out.printf("$%.2f", (quantity * price) * .1);

            } else if (quantity >= 10) {
                System.out.print("Look like you qualify for a 20% discount! ");
                System.out.print("You have ordered " + quantity + " " + coffee + "s, including the discount, this is your total: ");
                System.out.printf("$%.2f", (quantity * price) * .8);
                System.out.println();
                System.out.print("You have saved ");
                System.out.printf("$%.2f", (quantity * price) * .2);

            } else {
                System.out.print("You have ordered " + quantity + " " + coffee + "s totalling ");
                System.out.printf("$%.2f", (quantity * price));

            }


        }

   }








