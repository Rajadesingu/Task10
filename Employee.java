package task10;

public class Employee {

	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	
	
	// Constructor
	public Employee (int id, String firstName, String lastName, int salary) {
		
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getName() {
	
	   return firstName +" " + lastName;
	}
	
	public int getAnnualSalary() {
        return salary * 12;
	}
        
        public void setSalary(int salary) {
            this.salary = salary;
        }

        public void raiseSalary(int percent) {
            double raiseFactor = 1 + percent / 100.0;
            salary = (int) (salary * raiseFactor);
        }

        @Override
        public String toString() {
            return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
        }

        public static void main(String[] args) {
            Employee employee = new Employee(101, "Arun", "Kumar", 50000);

            System.out.println(employee);

            employee.raiseSalary(10);

            System.out.println("After raise: " + employee);
        }
    
        
    
	
}
