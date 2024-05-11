package week5;

import java.util.Scanner;

public class dailySpecials {
    
    public static void main(String[] args) {

        String specials;

        Scanner input = new Scanner(System.in);


        System.out.println("Please enter a day of the week excluding weekends( Monday - Friday only!");

        specials = input.next();


// in the world of coffee, I need a name of a coffee beverage and a price


        String coffee;
        double price;
        int amount;
        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");


        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();

        }

        

        switch (specials) {
            // my cases will be the day of the week


            case "Monday":
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);
                System.out.println("How many " +coffee+  "s  would you like to order?");
                amount = input.nextInt();
                
                if (amount == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s. So sad!!!");

                } else if (amount ==1){
                    System.out.println("Looks like you are ordering only 1 " +coffee+ " today!");

                 } else{
                System.out.print("You have ordered "  +amount+ " "  +coffee+ "s totalling ");
                System.out.printf("$%.2f", (amount * price));
                System.out.println( " dollars. Thank you for order and enjoy it!");
                System.out.println();
            }

                break;


            case "Tuesday":
                coffee = "Frapp";
                price = 4.95;
                System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);
                System.out.println("How many " +coffee+  "s  would you like to order?");
                amount = input.nextInt();
                if (amount == 0) {
                    System.out.println("Looks like you don't like " +coffee+ "s. So sad!!!");

                } else if (amount ==1){
                    System.out.println("Looks like you are ordering only 1 " +coffee+ " today!");

                 } else{
                System.out.print("You have ordered "  +amount+ " "  +coffee+ "s totalling ");
                System.out.printf("$%.2f", (amount * price));
                System.out.println( " dollars. Thank you for order and enjoy it!");
                System.out.println();
            }
               
            break; 



                case "Wednesday":
                    coffee = "Cappucino";
                    price = 4.35;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);
                    System.out.println("How many " +coffee+  "s  would you like to order?");
                    amount = input.nextInt();
                    
                    if (amount == 0) {
                        System.out.println("Looks like you don't like " +coffee+ "s. So sad!!!");
    
                    } else if (amount ==1){
                        System.out.println("Looks like you are ordering only 1 " +coffee+ " today!");
    
                     } else{
                    System.out.print("You have ordered "  +amount+ " "  +coffee+ "s totalling ");
                    System.out.printf("$%.2f", (amount * price));
                    System.out.println( " dollars. Thank you for your order and enjoy it!");
                    System.out.println();
                }
                    break;


                case "Thursday":
                    coffee = "Regular Joe";
                    price = 2.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);
                    System.out.println("How many " +coffee+  "s  would you like to order?");
                    amount = input.nextInt();
                    
                    if (amount == 0) {
                        System.out.println("Looks like you don't like " +coffee+ "s. So sad!!!");
    
                    } else if (amount ==1){
                        System.out.println("Looks like you are ordering only 1 " +coffee+ " today!");
    
                     } else{
                    System.out.print("You have ordered "  +amount+ " "  +coffee+ "s totalling ");
                    System.out.printf("$%.2f", (amount * price));
                    System.out.println( " dollars. Thank you for order and enjoy it!");
                    System.out.println();
                }
                    break;


                case "Friday":
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + "  and the price will be $" + price);
                    System.out.println("How many " +coffee+  "s  would you like to order?");
                    amount = input.nextInt();
                    
                    if (amount == 0) {
                        System.out.println("Looks like you don't like " +coffee+ "s. So sad!!!");
    
                    } else if (amount ==1){
                        System.out.println("Looks like you are ordering only 1 " +coffee+ " today!");
    
                     } else{
                    System.out.print("You have ordered "  +amount+ " "  +coffee+ "s totalling ");
                    System.out.printf("$%.2f", (amount * price));
                    System.out.println( " dollars. Thank you for order and enjoy it!");
                    System.out.println();
                }
                  break;


                // default:

                //    System.out.println("Please enter a valid day, or check your spelling!");


            }


        }
    }
