package Package_person_homework;

public class Person {
    // this file does not have a main method
//    we will start typing fields (variable)

    String name;

    char gender;

    int age;

    int carAge;

    boolean violations;

    double creditScore;
     double monthlyRate = 300;

    public void display() {

        System.out.println("Customer name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Gender: " +gender);
        System.out.println("Car: " +carAge);
        System.out.println("Violations: " +violations);
        System.out.println("Credit Score: " +creditScore);




    }

//         our method for car , changing your string to an integer!



// our logic is regarding our credit Score and violations

    public double getRate(double monthlyRate) {


        if(violations == true && creditScore <= 680) {
            monthlyRate = 500.00;

        } else {
            monthlyRate = 100.00;

        }
        return  monthlyRate;


    }

    public double assumeGender(double adjustedRate) {


        if (gender == 'M' && age <= 25) {
            adjustedRate = 100;

        } else {
            adjustedRate = 0;


        }
        return adjustedRate;
    }


    //  our method for car , to change  string to an integer!

    public double assumecarAge (double monthlyRate2) {


        if (carAge > 2023) {
            monthlyRate2 = 400;

            if (carAge <= 2000) {

                monthlyRate2= 150;

            } else {
                monthlyRate2= 100;


            }

        }
       return monthlyRate2;

    }
    }