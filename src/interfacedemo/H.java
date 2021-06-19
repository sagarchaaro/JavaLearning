package interfacedemo;

public class H extends A implements c , D{
	public void demo () {
		int a=0, b=1, c=2, n=100 ;
		 for (; a<=n;a++) {
			 a=b;
			 b=c;
			 c=a+b;
			 System.out.print(a+" ");
		 }
		 System.out.println();
	}
	
	public void display () {
		int y=2021;
		if (y%4 ==0) {
			System.out.println("2021 is a leap year");
		}else {
			System.out.println("2021 is not a leap year");
		}
		
	}
		
	public static void main(String[] args) {
		 H ob2 = new H();
		 ob2.display();
		 ob2.demo();
	}
}
