package Stringprograms;

public class demo {
	public static void main(String[] args) {
		String s1= "hello team, welcome to the class";
		
		char c[]= s1.toCharArray();
		char temp[]= new char[c.length];
		int i, j;
		
		
		
		for (i=c.length-1,j=0;   i>=0&&j<=temp.length-1;   i--,j++) {
			temp[j]=c[i];
		}
		
		String s2= new String(temp);

		 System.out.println(s2);
	}
}
