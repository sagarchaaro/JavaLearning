package JavaProgrammes;

import java.util.Scanner;

public class arraydemo {
	int a[]= {121,345,145,167,234};
	int n,sum;
	public static void main(String[] args) {
		arraydemo ob= new arraydemo();
		
		for (int i=0;i<=ob.a.length-1;i++) {
			ob.n=ob.a[i];
			ob.sum=0;
			
			while (ob.n!=0) {
				int r= ob.n%10;
				int fact=1;
				
				for (int j=1;j<=r;j++) {
					fact= fact*j;
				}
				
				ob.sum=ob.sum+fact;
				//System.out.println("Factorial of number"+ fact);
				ob.n=ob.n/10;
			}
			
			if(ob.sum==ob.a[i]) {
				System.out.println("a[" +i+ "] " + "is a Strong number :"+ob.a[i]);
			}else {
				System.out.println("a[" +i+ "] " + "is not a strong number :"+ob.a[i]);
			}
		}
	}
}


class arraydemo1 {
	static int prime[]= {56,78,13,15,54};
	static int i=1,count=0,n;
	public static void main(String[] args) {
				
		for (int p=0;p<=prime.length-1;p++) {
			count=0;
			arraydemo1.i=1;
			
			arraydemo1.n=prime[p];
			
			
			do {
				if (arraydemo1.n%arraydemo1.i==0) {
					arraydemo1.count++;
				}
				
				++arraydemo1.i;
				
			}while (arraydemo1.i<=arraydemo1.n); 
				
			if (arraydemo1.count==2) {
				System.out.println("prime[" +p+ "]" + " is a prime number :"+arraydemo1.n +" Count value is :"+count);
			}else {
				System.out.println("prime[" +p+ "]" + " is not a prime number :"+arraydemo1.n+" Count value is :"+count);

			}
		}
	}
}
