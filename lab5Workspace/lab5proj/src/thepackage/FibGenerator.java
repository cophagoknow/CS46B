package thepackage;

public class FibGenerator {
	
	private int[] callCounter;
	public int nthFib(int n) {
		callCounter = new int[n+1];
		return computeFibRecurse(n);
	}
	
	public int computeFibRecurse(int n) {
		callCounter[n]++;
		if (n == 1 || n==2) {
			return 1;
		} else {
			return computeFibRecurse(n-1) + computeFibRecurse(n-2);
		}
	}
	
	public void printCallCounter() {
		for (int i=0; i<callCounter.length; i++) {
			System.out.println(callCounter[i] + " calls to fib(" + i + ")");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("STARTING");
		FibGenerator gen = new FibGenerator();
		/**for (int i=1; i<50; i++) {
			System.out.println(gen.nthFib(i));
		}**/
		gen.nthFib(20);
		gen.printCallCounter();
	}
}
