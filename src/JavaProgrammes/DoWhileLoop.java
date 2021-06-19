package JavaProgrammes;

//prime number between 1 to 15

public class DoWhileLoop {
	public static void main(String[] args) {
		int i=1, n=13, count=0;
		do {
			if (n%i==0) {
				count++;
			} ++i;		
		}while (i<=n);
			if(count==2) {
				System.out.println("Prime Number");
			}else {
				System.out.println("Not a Prime Number");
			}
		
	}
}

	