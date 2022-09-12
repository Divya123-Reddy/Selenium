
public class Calculator {

		double a=10.5,b=4.5;
		public void addition(){
			double add=a+b;
			System.out.println("addition of two numbers "+add);
			
			
		}
		public void substraction() {
			double sub=a-b; 
			System.out.println("substraction of two numbers "+sub);
		}
		public void multiplication() {
			double mul=a*b;
			System.out.println("multipication of two numbers "+mul);
		}
		public void division()
		{
			double div=a/b;
			System.out.println("division of two numbers "+div);
		}
		public static void main(String args[]) {
			
			Calculator cal=new Calculator();
			cal.addition();
			cal.substraction();
			cal.multiplication();
			cal.division();
			
			
		}
	}


