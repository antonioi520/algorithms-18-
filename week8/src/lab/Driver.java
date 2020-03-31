package lab;

import lab.Employee.CompareType;

public class Driver {
static final int NUMBER_OF_EMPLOYEES = 3;
	
	public static void main(String[] args) {
		Employee[] employees = new Employee[NUMBER_OF_EMPLOYEES];
		employees[0] = new Employee("Antonio", 21);
		employees[1] = new Employee("Michael", 35);
		employees[2] = new Employee("Nick", 23);

		
		System.out.println("~~ Sort By Name ~~");
		Employee.compare = CompareType.NAME;
		employees = (Employee[])Sort.sort(employees);
		printEmployees(employees);
		
		System.out.println("\n~~ Sort By Age ~~");
		Employee.compare = CompareType.AGE;
		employees = (Employee[])Sort.sort(employees);
		printEmployees(employees);
	}
	
	private static void printEmployees(Employee[] employees) {
		for(int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].toString());
		}
	}
}
