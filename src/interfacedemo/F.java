package interfacedemo;

public class F implements c , D {
	public void demo() {
		int fact=1, n=10;
		int temp=n;
		for (;n>=1;n--) {
			fact=fact*n;
		}
		System.out.println("Factorial value of "+temp+ " number is "+fact);	
	}
	public void display() {
		int n=3;
		int evensum=0, oddsum=0;
		 while (n<=14) {
			 if (n%2==0) {
				 evensum=evensum+n;
			 }else {
				 oddsum=oddsum+n;
			 }
			++n;
		 }
		 System.out.println("sum of even numbers is " +evensum);
		 System.out.println("sum of odd numbers is " +oddsum);
	}
	public static void main(String[] args) {
		F ob = new F();
		
		ob.display();
		ob.demo();
	}
}
