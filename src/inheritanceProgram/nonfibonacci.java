package inheritanceProgram;

public class nonfibonacci {
	
	int a=0, b=1,c=0,d=1;

		void nfdemo(int n) {
			for (int i=0;i<=n;i++) {
				c=a+b;
				a=b;
				b=c;
				d=a+b;
				for (int j=c+1;j<d;j++) {
					if(j<=n) {
						System.out.print(j + " ");
					}
			}
		}	
	}
	public static void main(String[] args) {
			
		nonfibonacci ob = new nonfibonacci();
		ob.nfdemo(20);
			
	}
}	


