
public class AdvancedCalculator extends Calculator{
	
	public void modulus()
	{
		double mod=a/b;
		System.out.println("modulus of two numbers "+mod);
	}
	public void square() {
		double sqr=a*a;
		System.out.println("square of the number "+sqr);
	}
	public void squareroot() {
		double sqrt=Math.sqrt(b);
		System.out.println("square root of the number "+sqrt);
	}
	public static void main(String[] args) {
		
	
	 AdvancedCalculator advance=new  AdvancedCalculator();
	 advance.addition();
	 advance.substraction();
	 advance.multiplication();
	 advance.division();
	 advance.modulus();
	 advance.square();
	 advance.squareroot();

}
}