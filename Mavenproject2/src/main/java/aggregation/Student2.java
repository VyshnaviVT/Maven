package aggregation;


public class Student2 {
    String address;
	Student sd;
	
   public Student2(String address,Student sd ) {
	   this.address=address;
	   this.sd=sd;
   }
   
   public void dis() {
	   System.out.println(sd.name);
	   System.out.println(sd.rollno);
	   System.out.println(address);
   }
	
	
	public static void main(String[] args) {
		
		Student obj1=new Student("vyshnavi", 34);
		Student2 obj2=new Student2("abc house", obj1);
		obj2.dis();
	}

}
