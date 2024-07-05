package aggregation;

public class Group implements Interface2{

	public static void main(String[] args) {
		Group obj=new Group();
		obj.display();
		obj.mul();
	}

	public void display() {
		System.out.println("interface extends & implemented in class");
	}
	
	public void mul() {
		System.out.println("Class implements extended interface");
	}
}




