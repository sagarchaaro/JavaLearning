package JavaProgrammes;

public class triangledemo {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
				
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			 	}
					System.out.println();
		    }
		}
	}


class triangledemo1 {
	public static void main(String[] args) {
		int n=3, vijetha=1;
		
		for(int i=1;i<=n;i++) {
			int space=n-i;
			
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++) {
				System.out.print(vijetha);
				vijetha++;
			}
			System.out.println();
		}
							
	}
}



class triangledemo2 {
	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
				
			for(int j=5;j>=i;j--) {
				System.out.print(i+" ");
			 	}
					System.out.println();
		    }
		}
	}


class triangledemo3 {
	public static void main(String[] args) {
		int n=1;
		for (int i=5;i>=n;i--) {
			int space=i-n;
				for(int j=1;j<=space;j++) {
					System.out.print(" ");
				}
					for (int k=5;k>=i;k--) {
						System.out.print(i);
					}
						System.out.println();
		}
			
		
	}
}