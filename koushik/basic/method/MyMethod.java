package koushik.basic.method;

public class MyMethod {
	public static void main(String[] args) {
		MyMethod mm=new MyMethod();
		mm.printMyName();
		mm.printTheName("Santo");
		mm.printTheNameNo(10,"Sushmita");
	}
	
	
	
	
	
	void printMyName() {
		System.out.println("Sushmita");
	}

	void printTheName(String name) {
		System.out.println(name);
	}
	
	void printTheNameNo(int num,String name) {
		System.out.println(num +"  "+name);
	}
	
	
}
