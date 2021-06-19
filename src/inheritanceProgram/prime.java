package inheritanceProgram;

import java.util.Scanner;

public class prime {
	int i=1,n=11,count=0;
	void primedemo() {
		do {
			if (n%i==0) {
				count++;
			} ++i;
			
		}while (i<=n);
			if (count==2) {
				System.out.println(n + " is prime number");
			}else {
				System.out.println(n + " is not a prime number");
				}
		}
	}
			 
		

