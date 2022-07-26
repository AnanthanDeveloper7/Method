class A
{
	public void show() {
		System.out.println(" Class A");
	}
}
class B extends A
{
	public void show() {												// METHOD OVERRIDING
		System.out.println(" Class B");
	}
}
class C extends A
{
	public void show() {												// METHOD OVERRIDING
		System.out.println(" Class C");
	}
}
class Adam{
	int age =23;														// INSTANCE VARIABLE
	public void show() {
		int exp =2;														//LOCAL VARIABLE
	}
}
public class VariablesTypes {
	public static void main(String args[]) {
		Adam out = new Adam();
		out.age=9;
		out.exp = 3;										// can't access the local var outside the method or class
		
	}
}
