class Stud1{
	private int sid;
	public void setSid(int id) {
		sid = id;
	}
	public int getSid() {
		return sid;
	}
}
public class TestStud {
	public static void main(String[] args) {
		Stud1 s = new Stud1();
		s.setSid(101);
		System.out.println(s.getSid());
	}

}
