package koushik.basic.method;

public class MyMethod2 {
	public static void main(String[] args) {
		MyMethod2 mm = new MyMethod2();// Can not call a non static method from a static method
		mm.printMyName();
		mm.printTheName("Santo");
		mm.printTheNameNo(10, "Sushmita");
		mm.callMyName();
		staticName();
		mm.callStaticName();
		//mm.tit();
	}

	void printMyName() {
		System.out.println("Sushmita");
	}

	void printTheName(String name) {
		System.out.println(name);
	}

	void printTheNameNo(int num, String name) {
		System.out.println(num + "  " + name);
	}

	void callMyName() {
		printMyName();// Can call non static method from another non static method, without creating
						// object if in the same class.
	}

	static void staticName() {
		System.out.println("StaticName");
	}

	void callStaticName() {
		staticName();// cam call a static method from a non static method.
	    callMyName();
	}
	
	
	void tit() {
		System.out.println("Tit");
		tat();
	}
	void tat() {
		System.out.println("Tat");
		tit();
	}
}
