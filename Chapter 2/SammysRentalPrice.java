import java.util.Scanner;

public class SammysRentalPrice {
    public static void main(String[] args) {
   
        final int BASE_RATE = 40; // Base rate for the first hour
        final int ADDITIONAL_RATE_PER_MINUTE = 1;

   
        Scanner input = new Scanner(System.in);

 
        System.out.print("Enter the number of minutes rented: ");
        int totalMinutes = input.nextInt();

        
        int hours = totalMinutes / 60;
        int additionalMinutes = totalMinutes % 60;

      
        int totalCost = (hours * BASE_RATE) + (additionalMinutes * ADDITIONAL_RATE_PER_MINUTE);

      
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        System.out.println("S Sammy's makes it fun in the sun. S");
        System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

       
        System.out.println("Hours rented: " + hours);
        System.out.println("Additional minutes: " + additionalMinutes);
        System.out.println("Total price: $" + totalCost);
    }
}
