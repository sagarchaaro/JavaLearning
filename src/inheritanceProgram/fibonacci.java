package inheritanceProgram;

public class fibonacci extends prime {
	int a=0, b=1, c=2, n=100;
	 void demo () {
		 for (;a<=n;a++) {
			 a=b;
			 b=c;
			 c= a+b;
			 
			 System.out.print(a + " ");
		 	}
	 }
	
	public static void main(String[] args) {
		fibonacci ob = new fibonacci(); 
		
		ob.demo();
	 
	 	System.out.println();
	 	ob.primedemo();
	 	
 	}
}
