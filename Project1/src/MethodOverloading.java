class A{
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int add(int num1, int num2, int num3) {							// METHOD OVERLOADING
		return num1 + num2 + num3;
	}
	
	
}

public class MethodOverloading {
	public static void main(String [] args) {
		A obj = new A();
		int results = obj.add(28,9);
		int results1 = obj.add(12, 12, 12);
		System.out.println(results);
		System.out.println(results1);
		
	}

}
