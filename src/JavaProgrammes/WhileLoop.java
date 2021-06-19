package JavaProgrammes;

// sum of even and odd numbers between 3 to 14

public class WhileLoop {
	public static void main(String[] args) {
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
}


