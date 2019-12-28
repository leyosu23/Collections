package yoonseop_lee_sec008_comp228_exercise3;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
public class EmployeeTest {

	public static void main(String[] args) {
		Employee[] employees =
			{
				 new Employee("What ever", 13579),
				 new Employee("Who ever", 12345),
				 new Employee("John dow", 20000),
				 new Employee("Jason Lee", 15000)
			};
		
	      List<Employee> list = Arrays.asList(employees); 
	     
	      System.out.printf("\nUnsorted array elements: %s%n", list);

	     Collections.sort(list, new SalaryComparator()); // sort ArrayList
	      
	      System.out.printf("\nSorted array elements: %s%n", list);
	      
	}

}
