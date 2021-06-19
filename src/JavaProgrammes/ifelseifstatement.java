package JavaProgrammes;

// To find type of a triangle

public class ifelseifstatement {
	public static void main(String[] args) {
		int a=5, b=6, c=5;
		if(a==b && b==c) { 
			System.out.println("It is an Equilateral triangle");
		}else if (a!=b && b!=c && c!=a){
			System.out.println("It is an scalene triangle");
		}else if (a==b || b==c || c==a){
			System.out.println("It is an Isosceles triangle ");
		}
	}

}

