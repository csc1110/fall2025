/*
 jj
*/
package taylor;

import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		int i = 3;
		double x = 1.5;
		System.out.println((double)i);    // 3.0
		System.out.println(i / (int)x);   // 3
		System.out.println((int)x * 2);   // 1 * 2      = 2
		System.out.println((int)(x * 2)); // (int)(3.0) = 3
		String word = "" + i;
		System.out.println("happy" + 2);     // happy2
		System.out.println("happy" + 2 * 2); // happy22 happy4
		System.out.println(2 + "happy");     // 2happy
		System.out.println(2 + 2 + "happy"); // 4happy

	}
}
