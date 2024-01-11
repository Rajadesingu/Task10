package task10;

public class Tea {
	
	public void prepareTea() {
		System.out.println(" basic tea with hot water and tea leaves");
	}
	
	public void addMilk() {
		System.out.println(" adds milk to the basic tea");

	}
	
	public void addSugar() {
		System.out.println(" sugar to the basic tea");

	}
	
	public static void main(String[] args) {
		
		Tea t = new Tea();
		
		t.prepareTea();
		t.addMilk();
		t.addSugar();
		
	}

}
