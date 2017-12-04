package utils;

public class Math {
	public static int factorial(double num) {
		
		int fac = (int) num;
		
		if(num<=0) {
			return 1;
		}
		
		return fac * factorial(fac-1);
	}
	
	public static int factorialLoop(double num) {
		
		int fac = 1;
		
		int n = (int) num;
		
		for(int i=0; i<n; i++) {
			fac = fac * n;
			n--;
		}
		
		return fac;
	}
}
