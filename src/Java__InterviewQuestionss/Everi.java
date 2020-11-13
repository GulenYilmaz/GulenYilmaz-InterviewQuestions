package Java__InterviewQuestionss;

public class Everi {
public static void main(String[] args) {
	int a=10;
	int b=20;
	
	a=a+b;
	b=a-b;
	a=a-b;
	
	System.out.println(a);
	System.out.println(b);
	
	
	
	
	String origin="hello";
	String reverse="";
	 
	for(int i=origin.length()-1; i>=0;i--) {
		reverse=reverse+origin.charAt(i);
		
	}
	
	System.out.println(reverse);
	
	
	
	//prime
	
	int given=10;
	boolean isPrime=true;
	
	if(given>1) {
		
		for(int i=2;i<given; i++) {
			if(given%i==0) {
				isPrime=false;
				break;
				
			}else {
				isPrime=true;
			}System.out.println(given);
		}
	}
}
}
