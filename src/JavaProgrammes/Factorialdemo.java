package JavaProgrammes;

import java.util.Scanner;

public class Factorialdemo {
	public static void main(String[] args) {
		int fact=1, n=10;
		int temp=n;
		for(;n>=1;n--) {
			fact=fact*n;
		}
		System.out.println("Factorial value of "+temp+ " number is "+fact);
	}
}

// alternate method

class Factorialdemo1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int fact=1, n;
			n=s.nextInt();
		int temp=n;
		for(;n>=1;n--) {
			fact=fact*n;
		}
		System.out.println("Factorial value of "+temp+ " number is "+fact);
	}
}