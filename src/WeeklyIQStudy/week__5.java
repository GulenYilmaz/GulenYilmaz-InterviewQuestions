package WeeklyIQStudy;
/*
 * 
@Haciosmanoglu  Abstraction,Please give example and share your screen?
@Gulen Interface, Please give example and share your screen?
@Seyma Atasoy Atasoy String split,String trim(), String substring Please give example and share your screen?
@Ayse Ozkan (online) Ozkan (online) String replace,String replaceAll, indexof() Please give example and share your screen?
@Ali Kemal Tarlaci (online) wrapper classes,Autoboxing and Unboxing Please give example and share your screen?
@Tugba Akca (online) Inheritance, Please give example and share your screen?
@Turker Dogruer (online)  What are the differences between Heap and Stack Memory in Java?
@Adile Karadeniz (online) Explain public static void main(String args[])?
@Bayramgul Atageldiyeva Polymorphisms,Please give example and share your screen??
@Servet AKGUC  Encapsulation example?
Please share your screen.
 * 
 */
public class week__5 {
/*
 * 
Stack
very fast access
don't have to explicitly de-allocate variables
space is managed efficiently by CPU, memory will not become fragmented
local variables only
limit on stack size (OS-dependent)
variables cannot be resized

Heap
variables can be accessed globally
no limit on memory size
(relatively) slower access
no guaranteed efficient use of space, memory may become fragmented over time as blocks of memory are allocated, then freed
you must manage memory (you're in charge of allocating and freeing variables)
variables can be resized using 
 * 
 * 
 */
	
	//public class FibonacciDeneme {
		public static void main(String[] args) {
			int maxNumber=10;
			int previousNumber=0;
			int nextNumber=1;
			System.out.println("Fibonacci series first "+maxNumber+" numbers");
			for(int i =1;i<maxNumber;i++) {
				System.out.println(previousNumber+" ");
				int sum=previousNumber+nextNumber;
				previousNumber=nextNumber;
				nextNumber=sum;
				/* On each iteration, we are assigning second number
	             * to the first number and assigning the sum of last two
	             * numbers to the second number
	             */
			}
		}
	
	
		
		
		//public class StringSwap {
		//	public static void main(String[] args) {
			//	StrSwap("Ali", "Veli");
			//}
			public static void StrSwap(String a, String b) {
				a = a + b;
				b = a.substring(0, a.length() - b.length());
				a = a.substring(b.length());
				System.out.println("After swap new string a is " + a + " After swap new string b is  " + b);
			}
			
			
			
			
			
			public static void swapNum (int num1, int num2) {
				 num1=num1+num2;
				 num2=num1-num2;
				 num1=num1-num2;
				 System.out.println("after swap new num1 is "+num1+" "+" after swap new num2 is "+num2);
			 }
		
			
			
//			public class PrimeChallenge {
//				/*
//				 * prime number is a number bigger than 1
//				 * And can be divided by itself and 1
//				 * only .
//				 */
//				public static void main(String[] args) {
//					PrimeChallenge obj = new PrimeChallenge();
//					System.out.println(obj.checkForPrime(7));
//				}
//				/**
//				 * this method will give check if the number
//				 *
//				 * is a PrimeNumber or not
//				 *
//				 * @param givenNumber
//				 * @return
//				 */
//				public boolean checkForPrime(int givenNumber) {
//					boolean isItPrime = true;
//					if (givenNumber > 1) {
//						for (int i = 2; i <= givenNumber / 2; i++) {
//							if (givenNumber % i == 0) {
//								isItPrime = false;
//								break;
//							}
//						}
//					} else {
//						isItPrime = false;
//						return isItPrime;
//					}
//					return isItPrime;
//				}
			
		
			
			
			
			
			
			
			
			
			
//			
//			//public static void main(String[] args) {
//		        /*Write a java program to check whether a 
//		         * given number is prime or not?
//		         * 
//		         * prime number is a number that is greater than 1
//		         * Prime number should meet 2 conditions(divisible by 1 and itself only)
//		         * 
//		         */
//		        int given=-2;
//		        boolean isPrime=true;
//		        
//		        if(given>1) {
//		            for(int i=2;i<given;i++) {
//		                if(given%i==0) {
//		                    isPrime=false;
//		                    break;
//		                }
//		            }
//		            System.out.println("Given number "+given+" is prime? "+isPrime);
//		        }else {
//		            System.out.println("Given number is NOT a prime Number");
//		        }
//		        
//		    }
		
	
}
