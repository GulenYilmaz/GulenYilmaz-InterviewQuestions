package Mentor_H;

public class FibonacciNumbers {
public static void main(String[] args) {
	
	
	//0  1  1  2  3  5  8  13
	//a  b  c=a+b
	//   a  b  c=a+b
	//      a  b  c=a+b
	
	int a=0;
	int b=1;
	int c;
	
	for(int i=0;i<10; i++) {
		
		System.out.print(a+" ");
		c=a+b;
		a=b;
		b=c;
	}
	
}}