package Stringprograms;

public class Demo2 {
	public static void main(String[] args) {
		String s1="Hello I am S@gar Chakilala1, teaching9 selenium #cour8se in Hyderabad!";
		
		char ch[]= s1.toCharArray();
		
		double uc=0, lc=0, nc=0, sc=0;
		
		for(int i=0; i<=ch.length-1;i++) {
			
			if(ch[i]>=65 && ch[i]<=95) {
				uc++;

			}else if (ch[i]>=97 && ch[i]<=122) {
				lc++;
			}else if (ch[i]>=48 && ch[i]<=57) {
				nc++;
			}else {
				sc++;
			}
		}
		 int total = s1.length();
		 System.out.println("length of the string is :"+ total);
		 
		 double avg = (uc*100)/total;
		 System.out.println("number of uc characters is "+ uc+ " percentage of uc is " + avg);
		 
		 double avg1 = (lc*100)/total;
		 System.out.println("number of lc characters is "+ lc+" percentage of lc is " + avg1);
		 
		 double avg2 = (nc*100)/total;
		 System.out.println("number of nc characters is "+ nc+" percentage of nc is " + avg2);
		 
		 double avg3 = (sc*100)/total;
		 System.out.println("number of sc characters is "+ sc+" percentage of sc is " + avg3);

	}

}
