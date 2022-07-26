class Ananth{
	int num;
	final double pi =3.14;									// FINAL keyword
	public void increment(){
		 num=num+1;
		 pi=6.28;
	 }
	
}
public class Final {
	public static void main(String[] args) {
		Ananth res =new Ananth();
		System.out.println(res.num);
		res.increment();
		System.out.println(res.num);
		System.out.println(res.pi);
	}
}
