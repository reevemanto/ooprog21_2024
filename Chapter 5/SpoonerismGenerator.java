import java.util.Scanner;

   public class SpoonerismGenerator{
      
      public static String getWord(int wordNumber){
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter Word "+ wordNumber +": ");
      return scanner.nextLine().toLowerCase(); 
      } 
      public static int vowelIndex(String word){
      for(int i = 0; i < word.length(); i++){
         char c = word.charAt(i);
            if("a e i o u".indexOf(c) !=-1){
      
           return i;
         }
      
        }
           return -1;
      }
       public static void run() {
        
        String word1 = getWord(1);
        String word2 = getWord(2);
        
        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        
        if (index1 == -1 || index2 == -1 || index1 == 0 || index2 == 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
            return;
        }

        String spoonerizedWord1 = word2.substring(0, index2) + word1.substring(index1);
        String spoonerizedWord2 = word1.substring(0, index1) + word2.substring(index2);
        
        System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
       }
    
         public static void main(String[] args) {
         run();
      }
      
   }
   
