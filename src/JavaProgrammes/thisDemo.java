package JavaProgrammes;

public class thisDemo {
	int n=151,temp,r;
	int reverseNumber (int n) {
		while (n!=0) {
			r=n%10;
			temp=temp*10+r;
			n=n/10;
		}
			return temp;
	}
	public static void main(String[] args) {
	
		thisDemo ob = new thisDemo();
	
		int z= ob.reverseNumber (ob.n);
		
		if (z==ob.n) {
			System.out.println(ob.n + " Is a palindrome number");
		}else {
			System.out.println(ob.n + " Is not a palindrome number");
		} 
	}
}

class thisDemo1 {
	int n=151, r, temp, vijetha;
	int reversenumber () {
		while (this.n!=0) {
			this.r=this.n%10;
			this.temp= this.temp*10+r;
			this.n=this.n/10;
		}
			return this.temp;
	}
	public static void main(String[] args) {
		
		thisDemo1 ob= new thisDemo1();
		ob.vijetha=ob.n;
		int z= ob.reversenumber ();
		
		if (z==ob.vijetha) {
			System.out.println(ob.vijetha + " Is a palindrome number");
		} else {
			System.out.println(ob.vijetha + " Is not a palindrome number");
		}
	}	
}