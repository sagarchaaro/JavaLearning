package abstraction;

public class B extends demo{
	void print () {
		int n=20;
		int a=0, b=1, c=0, d=1;
		
		for (int i=0;i<=n;i++) {
			c=a+b;
			a=b;
			b=c;
			d=a+b;
			for(int j=c+1;j<d;j++) {
				if (j<=n) {
					System.out.print(j + " ");
				}
			}
		}
	}

}
