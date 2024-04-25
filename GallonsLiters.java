public class GallonsLiters {
   
    public static void main(String[] args) {
    
    
    
     double liters;
     double gallons;
     int count = 0;
     
    //    gallons = 10;
    //    liters  = gallons  * 3.79;
         
       for(gallons =1; gallons <= 100; gallons= gallons+4) {
          liters =gallons * 3.7854;
       
          if(gallons ==1) {
    //    System.out.println(liters + "liters = " +gallons+ " gallons");
        System.out.printf("%.2f liters = %.1f gallon", liters, gallons);
        System.out.println();
        
     } else{
        System.out.printf("%.2f liters = %.1f gallons", liters, gallons);
       System.out.println();
       
     }
        
        count += 1;
          if(count == 5){
           System.out.println();
           count = 0;
          }
            

        
        // end for loop
    
    }
     
    System.out.println("We are done!!");

    }
}


