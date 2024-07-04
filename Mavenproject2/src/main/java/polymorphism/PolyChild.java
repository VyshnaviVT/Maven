package polymorphism;

public class PolyChild extends PolyParent {
     
	public void dis() {
		System.out.println("Child class");
		super.dis();
	    }
	
	public static void main(String[] args) {
		
		PolyChild obj=new PolyChild();
		obj.dis();
	  }

  }
