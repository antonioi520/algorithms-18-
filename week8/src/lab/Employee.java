package lab;

public class Employee implements Comparable<Employee> {

	public enum CompareType {NAME, AGE};
	public static CompareType compare;
	
	private String name;
	private Integer age;
	
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.compare = CompareType.NAME;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return("Name: " + this.name + "; Age: " + this.age);
	}
	
	@Override
	public int compareTo(Employee o) {
		if(this.compare == CompareType.NAME) {
			return compareTo(o.name);
		} else if(this.compare == CompareType.AGE) {
			return compareTo(o.age);
		} 
		
		return 0;
	}
	
	public int compareTo(String compare) {
		if(this.name.compareTo(compare) > 0) {
			return 1;
		} else if(this.name.compareTo(compare) < 0) {
			return -1;
		} else {
			return 0;
		}
	}
	
	public int compareTo(int compare) {
		if(this.age > compare) {
			return 1;
		} else if(this.age < compare) {
			return -1;
		} else {
			return 0;
		}
	}
}