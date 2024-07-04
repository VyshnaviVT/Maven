package aggregation;

public class Inter2 implements Interface1,Interface2{

	public static void main(String[] args) {
		
		Inter2 obj=new Inter2();
		obj.display();
		obj.mul();
	}

	@Override
	public void display() {
		int sum=a+b+c;
		System.out.println("sum"+sum);
		//create one more interface, then implemnets class1,class2..
	}

	@Override
	public void mul() {
		int mul=x*y;
		System.out.println("Multiple"+mul);
	}

}
