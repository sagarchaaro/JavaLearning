package JavaProgrammes;

// to arrange numbers in ascending order

public class Nestedifstatements {
	public static void main(String[] args) {
		int a=25, b=36, c=16;
			if(a<b && a<c) {
			System.out.println("a= "+a);
				if(b<c) {
					System.out.println("b= "+b);
					System.out.println("c= "+c);
				}else {
					System.out.println("c= "+c);
					System.out.println("b= "+b);
				}
			}else if(b<a && b<c) {
				System.out.println("b= "+b);
				if(a<c) {
					System.out.println("a= "+a);
					System.out.println("c=" +c);
				}else {
					System.out.println("c= "+c);
					System.out.println("a= "+a);
				}
			}else if(c<a && c<b) {
				System.out.println("c= "+c);
				if(a<b) {
					System.out.println("a= "+a);
					System.out.println("b= "+b);
				}else {
					System.out.println("b= "+b);
					System.out.println("a= "+a);
				}
				}
			}
	}
	


// To arrange numbers in descending order

class Nestedifstatements1 {
	public static void main(String[] args) {
		int a=52, b=76, c=48;
		if (a>b && a>c) {
			System.out.println("a= "+a);
				if (b>c) {
					System.out.println("b= "+b);
					System.out.println("c=" +c);
				}else {
					System.out.println("c= "+c);
					System.out.println("b= "+b);
				}
		}else if (b>c && b>a) {
			System.out.println("b= "+b);
				if (c>a) {
					System.out.println("c= "+c);
					System.out.println("a= "+a);
				}else {
					System.out.println("a= "+a);
					System.out.println("c= "+c);
				}
		}else if (c>a && c>b) {
			System.out.println("c= "+c);
				if(a>b) {
					System.out.println("a= "+a);
					System.out.println("b= "+b);
				}else {
					System.out.println("b= "+b);
					System.out.println("a= "+a);
				}
		}
	}
	
}