package Mentor_H;
/*What is OOP?
What is Polymorphism?
-Diff between method overloading/overriding
What is Inheritance?
What is Abstract?
What is Encapsulation?
Reverse String




 * //meeting--2--
/*Cucumber and TestNG are similar ,we will use one of them at work
Interview Question: How do you use polymorphism on your framework?
Creating a framework on our own is the best practice.
Difficult part of the interview is Java part
Java is not 100% Object Oriented- due to primitive data types
Interview question: Inheritance in real world is “when your parents are rich, you are rich”, in java, the child can be even richer because child not only inherits from parent but also comes up with own methods and variables
Interview question : What is polymorphism: I am acting as father, worker, citizen, etc during the day. Can happen in two different ways : overriding and overloading
Interview question :Encapsulation: ssn number: you do not need to show all data-
 * 
 * 
 * (a) If a number is Prime or not 
 * (b) if a string is a Palindrome or not 
 * (c) the nth number in Fibonacci series or first n elements in the Fibonacci series 
 * 
 * 
 * 
 *public class ReverseStringWithBothMethods {
	public static String reverseStr(String str) {
		String reverse = "";
		for (int i = 0; i < str.length(); i++) {
			reverse = reverse + str.charAt(str.length() - 1 - i);
		}
		return reverse;
	}
	public static String reverseStr2(String str) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			sb = sb.append(str.charAt(str.length() - 1 - i));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(reverseStr("Cekoslovakyalilastiramadiklarimizdan miydiniz"));
		System.out.println(reverseStr("Cekoslovakyalilastiramayageldiklerimizden miydiniz"));
	}
 
 * 
 * 
 * 
 */
public class week__2 {

}
/*/*
 * public class FizzBuzz {
	public static void main(String[] args) {
		int start;
		int end;
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a decimal  number:");
		int num1 = input.nextInt();
		System.out.println("Please enter a decimal  number:");
		int num2 = input.nextInt();
		if (num1 > 0 && num2 > 0) {
			if (num1 < num2) {
				start = num1;
				end = num2;
			} else if (num2 < num1) {
				start = num2;
				end = num1;
			} else {
				start = num1;
				end = num2;
				System.out.println("You must enter different numbers");
			}
		} else {
			start = num1;
			end = num2;
			System.out.println("Both numbers should be  positive");
		}
		fizzBuzz(start, end);
	}
	public static void fizzBuzz(int start, int end) {
		if (start != end && start > 0 && end > 0) {
			for (int i = start; i <= end; i++) {
				if (i % 15 == 0) {
					System.out.println("FizzBuzz");
				} else if (i % 3 == 0) {
					System.out.println("Fizz");
				} else if (i % 5 == 0) {
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		}
	}
}
 * 
 * 
 */


