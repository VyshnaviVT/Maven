package final1;

public class FinalKey extends ClassMethod {
	final int a=5;
	
	public FinalKey() {
		//a=5;
	}

	/*public final void dis() {
		System.out.println("final method2");  //final method cannot be override
	}*/

	public static void main(String[] args) {
		FinalKey obj=new FinalKey();
		System.out.println(obj.a);
        obj.dis();
	}

}
