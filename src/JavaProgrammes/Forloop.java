package JavaProgrammes;

// form a triangle

public class Forloop {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}


// tables demo

class forloop1{
	public static void main(String[] args) {
		 for(int i=2;i<=5;i++) {
			 
			 for(int j=1;j<=10;j++) {
				 System.out.println(i+ " * "+j+ " = " +i*j);
			 }
			 System.out.println("===================");
		 }
	}
}	

/// Prime numbers between 1 to 100

class primenumbers {
	public static void main(String[] args) {
		for(int n=1;n<=100;n++) {
			int Count=0;
				for(int i=1;i<=n;i++) {
						if(n%i==0){
							Count++;
						}
					}
				if(Count==2) {
					System.out.print(n+" ");
					}
					
				}
		}
	}

