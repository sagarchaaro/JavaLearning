package Stringprograms;

public class reversedemo {
	public static void main(String[] args) {
		String s1="Hello vijetha, welcome to java";
		
		//java to welcome vijetha Hello
		
		
		String s2[]=s1.split(" ");
		String s3="";
		
		for(int i=s2.length-1;i>=0;i--) {
			s3=s3.concat(s2[i]+" ");
		}
		
		System.out.println(s3);
		
	}


	}


