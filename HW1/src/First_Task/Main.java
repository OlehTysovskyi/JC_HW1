package First_Task;

public class Main {
	public static void main(String[] args) {
		
		// 1)
//		byte bt = 2;
//		short srt = 10;
//		int m = 1233;
//		long lng = 12303324;
//
//		double dbl = 4.432543;
//		float flt = 10.3f;
//
//		char chr = '$';
//		String word = "Hello";
//		boolean bln = true;

		// 2)
		System.out.println("Min and Max values:");
		System.out.println("Byte: " + Byte.MIN_VALUE + " | " + Byte.MAX_VALUE);
		System.out.println("Short: " + Short.MIN_VALUE + " | " + Short.MAX_VALUE);
		System.out.println("Integer: " + Integer.MIN_VALUE + " | " + Integer.MAX_VALUE);
		System.out.println("Long: " + Long.MIN_VALUE + " | " + Long.MAX_VALUE);
		System.out.println("Double: " + Double.MIN_VALUE + " | " + Double.MAX_VALUE);
		System.out.println("Float: " + Float.MIN_VALUE + " | " + Float.MAX_VALUE);

		// 3)
		int max = 0;
		int min = 0;
		int[] array = { 2, -7, 23, 14, -86, 47, 134, 25467, 0, -6 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
		}
		;
		System.out.println("min= " + min + "\n" + "max= " + max);
	}
}
