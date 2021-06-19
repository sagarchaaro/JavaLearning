package JavaProgrammes;

import java.util.Scanner; 

// Fibonacci series

public class Instancevariabledemo {
			int a=0, b=1,c;
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Entre value of n");
			int n=s.nextInt();//8
			
			Instancevariabledemo ob = new Instancevariabledemo();	
			
			ob.c=ob.a+ob.b;
			System.out.print(ob.a+" "+ob.b+" ");//2
			int i;
			
			for(i=3;i<=n;i++) {
				ob.a=ob.b;
				ob.b=ob.c;
				ob.c=ob.a+ob.b;
				System.out.print(ob.c+" ");
				
			}
			System.out.println();
		}
	}

// Prime number

class Instancevariabledemo1 {
	int i=1, n=13, count=0;
	public static void main(String[] args) {
		Instancevariabledemo1 ob= new Instancevariabledemo1();
	
		do {
			if (ob.n%ob.i==0) {
				ob.count++;
			} 
			++ob.i;		
		}while (ob.i<=ob.n);
		
		if(ob.count==2) {
			System.out.println("Prime Number and count value is :"+ob.count);
		}else {
			System.out.println("Not a Prime Number and count value is :"+ob.count);
		}
		
	}
}
	
	
