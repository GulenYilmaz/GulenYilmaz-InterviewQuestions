package Java__InterviewQuestionss;

public class FibonacciNumber3 {

	public static void main(String[] args) {
		//   Write a Java Program to print first 10 numbers of Fibonacci series.
        // 1  1  2  3  5  8  13  21  34  55...
		// a  b  c
		//    a  b  c
		//       a  b  c...
	
//		System.out.println("--------fibonacci array--------");
//		
//		
//		int fib []=new int [12];
//		
//		fib[0]=1;
//		fib[1]=1;
//		
//		for(int i=0; i<10; i++) {
//			fib[i+2]=fib[i+1]+fib[i];  //aslinda bu sekilde yazmamiz gerekiyor ama 
//		
//			System.out.println(fib[i]);//i=0 dan basladigi icin i ye 2 ekliyoruz--->fib[i]=fib[i-1]+fib[i-2];
//		}
//		
		
		int a,b,c;
		a=0;
		b=1;
		for(int i=1; i<=10; i++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			}

		
	}

}
