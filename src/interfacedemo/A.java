package interfacedemo;

public class A {
	void print() {
		int n=13,i=1,count=0;
		do {
			if (i%n==0) {
				count++;
			} ++i;
				
		}while (i<=n);
			if (count==2) {
				System.out.println(n + "Is a prime number");
			}else {
				System.out.println(n + "Is non prime number");
			}

	}
}
