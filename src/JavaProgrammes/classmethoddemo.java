package JavaProgrammes;

public class classmethoddemo {
	static int n=153, sum;
	static void method() {
		
		while (n!=0){
			int r=n%10;
			sum = sum+r*r*r;
			n=n/10;
	 		}
	}
		public static void main(String[] args) {
		int temp=n;
			method();
		
		if (sum==temp) {
			System.out.println( "is an Armstrong number");
		}else {
			System.out.println("is not an Armstrong number");
		}
	}
}
