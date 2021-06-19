package Stringprograms;

public class Demo1 {
	public static void main(String[] args) {
		
		String s1= "Hello vijetha, welcome to the class";
		
		char c[]= s1.toCharArray();
		char temp[]= new char[c.length];
		int i, j;
		
		for (i=c.length-1,j=0;   i>=0&&j<=temp.length-1;   i--,j++) {
			temp[j]=c[i];
		}
		
		String s2= new String(temp);
		
		String s3[]=s2.split(" ");
		String s4=" ";
		
		for(int k=s3.length-1;k>=0;k--) {
			s4=s4.concat(s3[k]+" ");
		}
		
		System.out.println(s4);

	}

}
