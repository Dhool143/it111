package Package_person_homework;

public class PersonDetails {


    public static void main(String[] args) {


        //    this file will have a main method

        Person firstPerson;
        Person secondPerson;


//         in the process of creating an object from my Person class

        firstPerson = new Person();
        secondPerson = new Person();


//        we will be entering the info, assigning values to our fields

        firstPerson.name = "Emily";
        firstPerson.gender = 'F';
        firstPerson.age = 35;
        firstPerson.carAge = (2024);
        firstPerson.violations = false;
        firstPerson.creditScore = 690;


        secondPerson.name = "William";
        secondPerson.gender = 'M';
        secondPerson.age = 20;
        secondPerson.carAge = (1995);
        secondPerson.violations = true;
        secondPerson.creditScore = 670;


        double monthlyRate =  0;
        double adjustedRate = 0;
        double monthlyRate2 = 0;


        firstPerson.display();
        System.out.println("Preliminary Rate for " +firstPerson.name+ ": " +firstPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate) + " dollars");
        System.out.print("Here is  " +firstPerson.name+ " 's total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) +firstPerson.getRate (monthlyRate) +firstPerson.assumecarAge(monthlyRate2));

        System.out.println();


        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": " +secondPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +secondPerson.assumeGender(adjustedRate) + " dollars");
        System.out.print("Here is  " +secondPerson.name+ " 's total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) +secondPerson.getRate (monthlyRate) +secondPerson.assumecarAge(monthlyRate2));



    }

}



