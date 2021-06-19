package JavaProgrammes;

import java.util.Scanner;

public class classvariabledemo {
	int n,temp,sum=0;
	public static void main(String[] args) {
		classvariabledemo ob = new classvariabledemo();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of n");
		ob.n = s.nextInt();
		ob.temp=ob.n;
		
		while (ob.n!=0) {
			int r=ob.n%10, fact=1;
			for (int i=1;i<=r;i++) {
				fact=fact*i;
			}
			ob.sum=ob.sum+fact;
			System.out.println("Factorial of number"+fact);
			ob.n=ob.n/10;
		}
		
		if (ob.sum==ob.temp) {
			System.out.println("Strong number");
		}else { 
			System.out.println("Not a Strong Number");
		}
		
		
	}
}
