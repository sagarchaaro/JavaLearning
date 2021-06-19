package interfacedemo;

public class G extends A implements c{
	public void display() {

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
	public static void main(String[] args) {
		G ob1 = new G();
		
		ob1.display();
}
}
