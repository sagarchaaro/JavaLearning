package JavaProgrammes;

import java.util.Scanner;

public class Fibonaccidemo {
	public static void main(String[] args) {
		int a=0, b=1, c=2, n=100 ;
		 for (; a<=n;a++) {
			 a=b;
			 b=c;
			 c=a+b;
			 System.out.print(a+" ");
		 }
		 System.out.println();
	}
}

//alternate method with scanner

class Fibonaccidemo1 {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("entre value of n");
		int n= s.nextInt();
		
		int a=0, b=1, c;
		c=a+b;
		System.out.print(b+" ");
		while(c<=n) {
			a=b;
			b=c;
			c=a+b;
			
			if(c<=n) {
				System.out.print(c+" ");
			}
		}
		
		 System.out.println();
	}
}


class Fibonaccidemo2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Entre value of n");
		int n=s.nextInt();//8
		
		int a=0, b=1,c;
		c=a+b;
		System.out.print(a+" "+b+" ");//2
		int i;
		
		for(i=3;i<=n;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(c+" ");
			
			
		}
			
		System.out.println();
	}
}

