package inheritanceProgram;

public class nonprime {
	final int n=100;
	int count=0;
	
	void nonprimedemo () {
		
		for(int i=1;i<=n;i++) {
			count=0;
			for (int j=1; j<=n;j++) {
				if (i%j==0) {
					count++;
				} 		 	
				
			}
			if (count>2) {
				System.out.println(i + " is non-prime number");
			}
			
		}
	}
	public static void main(String[] args) {
		
		nonprime ob = new nonprime();
		ob.nonprimedemo();
	}
}
