package thepackage;

public class FactorialGenerator {
	public double nthFactorial(int n) {
		return computeFactorialRecurse(n);
	}
	
	public double computeFactorialRecurse(int n) {
		if (n < 0) 
			//throw new IllegalArgumentException("n cannot be negative");
			assert n>=0 : "Illegal n: " + n;
		if (n == 0) {
			return 1;
		} else {
			return n * computeFactorialRecurse(n-1);	
		}
	}
	
	public static void main(String[] args) {
		FactorialGenerator factorial = new FactorialGenerator();
		/**for (int i = 1; i<=32; i++) {
			System.out.println(factorial.nthFactorial(i));
		}**/
		System.out.println(factorial.nthFactorial(-1));
	}
}
