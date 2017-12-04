package test;
import animals.*;
import utils.Math;
import utils.ArrayUtils;

public class Driver {
	public static void main(String args[]) {
		
		double num = 15.4;
		
		Puppy Joey = new Puppy("Joey");
		Puppy Chandler = new Puppy("Chandler");
		Puppy Ross = new Puppy("Ross");
		
		String n1 = Joey.getName();
		String n2 = Chandler.getName();
		String n3 = Ross.getName();
		
		System.out.println(n1);
		
		System.out.println(n2);
		
		System.out.println(n3);
		
		int[] array = {9, 20, 3, 44, 88, 300};
		
		int[] arrayR = ArrayUtils.reverse(array);
		String arrayS = ArrayUtils.stringifyArray(arrayR);
		System.out.println(arrayS);
		
		
		int fact = Math.factorial(num);
		
		System.out.println(fact);
		
	}

}
