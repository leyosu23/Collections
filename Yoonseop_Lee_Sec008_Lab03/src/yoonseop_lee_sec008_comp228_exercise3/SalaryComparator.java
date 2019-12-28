package yoonseop_lee_sec008_comp228_exercise3;
import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
   @Override
   public int compare(Employee emp1, Employee emp2) {
      int e1 = emp1.getSalary();
      int e2 = emp2.getSalary();
      return e1-e2;
   } 
} 

