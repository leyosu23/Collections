package yoonseop_lee_sec008_comp228_exercise4;
// Adds integers to an array shared with other Runnables
import java.lang.Runnable;
import java.security.SecureRandom;



public class ArrayWriter implements Runnable {
	private static final SecureRandom generator = new SecureRandom();
   private final SimpleArray sharedSimpleArray;
   private final int startValue;

   public ArrayWriter(int value, SimpleArray array) {
      startValue = value;
      sharedSimpleArray = array;
   }

   @Override
   public void run() {
      for (int i = startValue; i < startValue + 3; i++) {
         sharedSimpleArray.add(startValue + generator.nextInt(10)); // add an element to the shared array
      } 
   }
} 


