package JavaProgrammes.april17th;

class SimpleInterestDemo {
	public static void main(String[] args) {
		int p=10000, t=2;
		float r=0.03f, A;
		
		A=p*(1+r*t);
		System.out.println("total value is :"+A);
		
		float interest=A-p;
		System.out.println("simple Interest is :"+interest);
		
		float vij_interest=(p*r*t)/100;
		System.out.println("Interest is :"+vij_interest);
	}
}
