import java.util.Scanner;

public class CarlysEventPrice{
   
   public static void main(String[] args){
   
      double PRICE_PER_GUESTS = 35.00;
      int LARGE_EVENT_AN = 50.00;
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("**************************************");
      System.out.println(" * Carly's makes the food that makes *");
      System.out.println(" *            ita party.             *");
      System.out.println("**************************************");
      System.out.println("Welcome to Carly's Catering:");
      System.out.print("Enter the number of guest: ");
      int numberOfGuests = scanner.nextInt();
      
      double totalPrice = numberOfGuests * PRICE_PER_GUESTS;
      boolean isLargeEvent = numberOfGuests >= LARGE_EVENT_AN;
      
      System.out.println("Number of guest: "+ numberOfGuests);
      System.out.println("Price per guest: "+ PRICE_PER_GUESTS);
      System.out.println("Total price: "+ totalPrice);
      System.out.println("Is this a Large Event? "+ isLargeEvent);
   }
}
