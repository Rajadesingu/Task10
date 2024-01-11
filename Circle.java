package task10;

public class Circle {

	private double radius;
	
	public Circle() {
		
		this.radius =1;
	}
	
	public Circle(double radius) {
		
		this.radius=radius;
	}
	
	public double circumference() {
     return 2*Math.PI*radius;
		

	}
	
	public static void main(String[] args) {
		
		Circle c = new Circle();
	   Circle c1 = new Circle(4);
	 
	 System.out.println(c.circumference());
	 System.out.println(c1.circumference());
		
		
	}
}

