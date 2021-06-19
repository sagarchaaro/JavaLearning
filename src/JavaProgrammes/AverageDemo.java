package JavaProgrammes;

public class AverageDemo {
	public static void main(String[] args) {
	int telugu=80, hindi=75, english=32, sanskrit=30;
	long avg=(telugu+hindi+english+sanskrit)/4;
	System.out.println("average marks=" +avg);
	if(telugu<=30 || hindi<=30 || english<=30 || sanskrit<=30) {
		System.out.println("Fail");
	}else if(avg>=70) {
		System.out.println("First class with Distinction");
		}else if(avg<70 && avg>=60) {
			System.out.println("Second Class");
		}else if(avg<60 && avg>=50) {
			System.out.println("Third Class");
		}else if(avg<50 && avg>=40) {
			System.out.println("Fail");
		}
	}
}

// same code in another way (( error code))

class AverageDemo1 {
	public static void main(String[] args) {
	int telugu=80, hindi=75, english=32, sanskrit=30;
	long avg=(telugu+hindi+english+sanskrit)/4;
	System.out.println("average marks=" +avg);
	boolean flag=telugu<=30 ||hindi<=30 ||english<=30 ||sanskrit<=30;
	if(flag && avg>=70) {
		System.out.println("First class with Distinction");
		}else if(flag && avg<70 && avg>=60) {
			System.out.println("Second Class");
		}else if(flag && avg<60 && avg>=50) {
			System.out.println("Third Class");
		}else if(flag && avg<50 && avg>=40) {
			System.out.println("Fail");
		}
	}
}