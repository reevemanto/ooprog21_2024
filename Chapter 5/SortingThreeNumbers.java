import java.util.Scanner;

public class SortingThreeNumbers{

   public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
  
   System.out.println("Enter three integers: "); 
   int num1 = scanner.nextInt();
   int num2 = scanner.nextInt();
   int num3 = scanner.nextInt();
   
   scanner.close();
   
   if (num1 <= num2 && num2 <= num3){
   
   System.out.println("numbers in ascending order: "+ num1 +" "+ num2 +" "+ num3);
   
   } else {
   int max = Math.max(num1, Math.max(num2, num3));
   int min = Math.min(num1, Math.min(num2, num3));
   int middle = num1 + num2 + num3 - max - min;
    
   System.out.println("numbers in ascending order: "+ max +" "+ middle +" "+ min);
   
   }
   
  }

}
