public class PersonDetails {

        public static void main(String[] args) {

            //    this file will have a main method

            Person firstPerson;
            Person secondPerson;
            Person thirdperson;

//         in the process of creating an object from my Person class

            firstPerson = new Person();
            secondPerson = new Person();
            thirdperson = new Person();

//        we will be entering the info, assigning values to our fields

            firstPerson. name = "Cathy";
            firstPerson. gender = 'F';
            firstPerson. age = 33;
            firstPerson. car = "Volkswagon Bug";
            firstPerson. violations = false;
            firstPerson. creditScore = 690;



            secondPerson. name = "Kendall";
            secondPerson. gender = 'M';
            secondPerson. age = 22;
            secondPerson. car = "Mustang";
            secondPerson. violations = true;
            secondPerson. creditScore = 670;




            thirdperson. name = "Arial";
            thirdperson. gender = 'F';
            thirdperson. age = 54;
            thirdperson. car = "Lexus";
            thirdperson. violations = true;
            thirdperson. creditScore = 600;


//        System.out.println(firstPerson.name);
//        System.out.println(firstPerson.gender);
//        System.out.println(firstPerson.age);
//        System.out.println(firstPerson.car);
//        System.out.println(firstPerson.violations);
//        System.out.println(firstPerson.creditScore);
//        System.out.println();
//
//        System.out.println(secondPerson.name);
//        System.out.println(secondPerson.gender);
//        System.out.println(secondPerson.age);
//        System.out.println(secondPerson.car);
//        System.out.println(secondPerson.violations);
//        System.out.println(secondPerson.creditScore);

            double monthlyRate = 0;
            double adjustedRate = 0;

            firstPerson.display();
            System.out.println("Preliminary Rate for " +firstPerson.name+ ": " +firstPerson.getRate(monthlyRate) + " dollars");
            System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate) + " dollars");
            System.out.print("Here is  " +firstPerson.name+ " 's total monthly premium: ");
            System.out.println(firstPerson.assumeGender(adjustedRate) +firstPerson.getRate (monthlyRate));

            System.out.println();


            secondPerson.display();
            System.out.println("Preliminary Rate for " +secondPerson.name+ ": " +secondPerson.getRate(monthlyRate) + " dollars");
            System.out.println("Adjustments: " +secondPerson.assumeGender(adjustedRate) + " dollars");
            System.out.print("Here is  " +secondPerson.name+ " 's total monthly premium: ");
            System.out.println(secondPerson.assumeGender(adjustedRate) +secondPerson.getRate (monthlyRate));

            System.out.println();

            thirdperson.display();
            System.out.println("Preliminary Rate for " +thirdperson.name+ ": " +thirdperson.getRate(monthlyRate) + " dollars");
            System.out.println("Adjustments: " +thirdperson.assumeGender(adjustedRate) + " dollars");
            System.out.print("Here is  " +thirdperson.name+ " 's total monthly premium: ");
            System.out.println(thirdperson.assumeGender(adjustedRate) +thirdperson.getRate (monthlyRate));



        }

    }








