package utils;

public class ArrayUtils {
	public static int[] reverse(int[] array) {
		
		int n = array.length;
		
		int[] arr = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			arr[i]=array[n-1];
			n--;
		}
		return arr;
	}
	
	public static String stringifyArray(int[] arr) {
		
		String array = "";
		
		for(int i = 0; i<arr.length; i++) {
			if(i==0) {
				array = array + arr[i];
			}else {
				array = array + ", " + arr[i];
			}
		}
		
		return array;
	}
}
