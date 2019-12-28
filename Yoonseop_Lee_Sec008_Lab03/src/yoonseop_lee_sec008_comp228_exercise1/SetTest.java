package yoonseop_lee_sec008_comp228_exercise1;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class SetTest {
   public static void main(String[] args) {
      // create and display a List<String>
      String[] names = {"Corey",
    		  "Corey",
    		  "Kaitlin",
    		  "Corey",
    		  "Kaitlin",
    		  "Kaitlin",
    		  "Hugh",
    		  "Brent",
    		  "Sheldon",
    		  "Krish",
    		  "Draven",
    		  "Shyanne",
    		  "Marley",
    		  "Jenny",
    		  "Ella",
    		  "Jillian"};
      List<String> list = Arrays.asList(names);
      System.out.printf("List: %s%n", list);

      // eliminate duplicates then print the unique values
      printNonDuplicates(list);
   }  

   // create a Set from a Collection to eliminate duplicates
   private static void printNonDuplicates(Collection<String> values) {
      // create a HashSet 
      Set<String> set = new HashSet<>(values);
      System.out.printf("%n Names without duplication: ");
      for (String value : set) {
         System.out.printf("%s ", value);
         
      }
      
      System.out.print("\n\nEnter the name you want to search with: ");

      Scanner intput = new Scanner(System.in);
      String search = intput.nextLine();
      intput.close();
      if(set.contains(search))
      {
    	  System.out.printf("The name \"%s\" exists ",search);
      }
      else
      {
    	  System.out.printf("The name \"%s\" does not exists ",search);
      }
      
      
   }
}

