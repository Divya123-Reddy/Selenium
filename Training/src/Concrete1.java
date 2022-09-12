
public class Concrete1 implements abstract1 {

	@Override
	public void add() {
		
		
	}

	@Override
	public void getarea(int a) {
		
		int sqr=a*a;
		System.out.println(sqr);
		
	}
	public static void main(String[] args) {
		Concrete1 con=new Concrete1();
		con.getarea(10);
		
	}

	

	
	}



