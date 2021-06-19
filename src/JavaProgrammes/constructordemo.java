package JavaProgrammes;

public class constructordemo {
	int a[]= {151,145,153,178};
	int n, temp, r,z, sum, fact;
	
	constructordemo (){
		
		for (int i=0;i<=a.length-1;i++) {
			n=a[i];
			z=a[i];
			temp=0;
			while (n!=0) {
				r=n%10;
				temp=temp*10+r;
				n=n/10;
			}		
			
			if (temp==z) {
				System.out.println(temp + " Is a palindrome number");
			}else {
				System.out.println(temp + " Is not a palindrome number");
			}
		}
	}	
	
	void printStrongNumber(int[] x) {
		
		for (int i=0;i<=a.length-1;i++) {
			n=a[i];
			sum=0;
			fact=1;
			
			while (n!=0) {
				this.r=this.n%10;
				
				fact=1;
				for (int j=1;j<=r;j++) {
					fact= fact*j;
				}
				
				sum=sum+fact;
				n=n/10;
			}
			
			if(sum==a[i]) {
				System.out.println("a[" +i+ "] " + "is a Strong number :"+a[i]);
			}else {
				System.out.println("a[" +i+ "] " + "is not a strong number :"+a[i]);
			}
				
		}
		
	}
	
	int getArmStrongNumber(int x){
		this.sum=0;
		while (x!=0){
			int r=x%10;
			this.sum = this.sum+r*r*r;
			x=x/10;
		}
		
		return this.sum;
				
	}

	public static void main(String[] args) {			
		constructordemo ob =new constructordemo();
		
		ob.printStrongNumber(ob.a);
		
		for(int i=0;i<=ob.a.length-1;i++) {
			ob.n=ob.a[i];
			int z=ob.getArmStrongNumber(ob.n);
			
			
			if (z==ob.n) {
				System.out.println(ob.n + " is an Armstrong number");
			}else {
				System.out.println(ob.n + " is not an Armstrong number");
			}
			
		}
		
		
	
	

	}
	
}

