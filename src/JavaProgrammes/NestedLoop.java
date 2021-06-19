package JavaProgrammes;

// To form a triangle

public class NestedLoop {
	public static void main(String[] args) {
		int i=1, n=5;
		while (i<=n) {
			int j=1;
			while (j<=i) {
				System.out.print(i+" ");
				j++;
		}
			System.out.println();
			i++;
		}
	}
}


// to write 2 to 5 tables

class Nestedloop1 {
	public static void main(String[] args) {
		int i=1, n=10;
		while (i<=n) {
			int j=1;
			while (j<=i) {
			System.out.println("2 * " +i+ "="+ 2*i);
			j++;
			}
			i++;
		}
	}
}