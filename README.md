 class Employee
 {
	 public static void display()
	 {
		 System.out.print("Employee");
	 }
 }
 public class Trainee extends Employee{
	 public static void display()
	 {
		 System.out.print("Trainee");
	 }
	 public static void main(String[] args)
	 {
			Employee employee = new Trainee();
			employee.display();
	 }
 }
		