package abstraction;

public class A extends demo{
	void print() {
		int a=0, b=1, c=2, n=100;
		for (;a<=n;a++) {
			 a=b;
			 b=c;
			 c=a+b;
			 
			 System.out.print(a + " ");
		 	}
			System.out.println();
	}

}
