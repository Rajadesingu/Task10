package task10;

public class Person {
	
	// Attribute
	private String name; 
	private int age;

    // Constructor
	public Person(String name, int age) {
		
		this.name=name;
		this.age=age;
	}
	
	// Getter method
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public static void main(String[] arug) {
		
		Person p = new Person("RAM", 25);
		System.out.println("Name :" + p.getName());
		System.out.println("Name :" + p.getAge());
	}
}


