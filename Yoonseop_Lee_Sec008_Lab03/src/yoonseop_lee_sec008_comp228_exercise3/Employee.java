package yoonseop_lee_sec008_comp228_exercise3;
public class Employee {
   private String Name;
   private int salary;

   // constructor
   public Employee(String Name, int salary) 
   {
      this.Name = Name;
      this.salary = salary;
   } 

   // getters and setters
   public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}     
	
   // toString
   @Override
   public String toString() {
      return String.format("The employee, %s has salary of $%s", getName(), getSalary());
   }

 
} 

