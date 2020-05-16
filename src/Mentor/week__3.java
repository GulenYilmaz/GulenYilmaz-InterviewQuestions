package Mentor;
/*
 * 	/*meeting---3----
 First of all, we will start our session with 10 mins daily stand-up!
--What did you do yesterday?
--What will you do today?
--Do you have any blockers?




The Questions that we are going to discuss during the session are below;

1.Write a program to check if given number is prime.

2.Write a program to print first 10 numbers of fibonacci series.

3.Write a program to check if given String is palindrome.

4.Print numbers Start to End,
  When number is multiple of 3, print Fizz,
  When number is multiple of 5, print Buzz,
  When number is multiple of 3 and 5, print FizzBuzz,
  Else print the number.
		 
		 
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *public class Primenom {
	public static boolean checkPrime(int givenNumber) {
		boolean isPrime = true;
		if (givenNumber > 1) {
			for (int i = 2; i <= givenNumber / 2; i++) {
				if (givenNumber % i == 0) {
					isPrime = false;
					break;
				}
			}
		} else {
			System.out.println("Please enter a number bigger than 1");
		}
		return isPrime;
	}
	public static void main(String[] args) {
		System.out.println(checkPrime(12));
	}
}
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		public static boolean checkPolindrom(String str) {
        
        
        String reverse = "";
        
        for(int i=str.length()-1;i>=0;i--) {
            reverse += str.charAt(i);
        }
        
        if(str.equalsIgnoreCase(reverse)){
            return true;
        }else {
            return false;
        }
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.println(checkPolindrom("Serhan"));
        System.out.println(checkPolindrom("kayak"));
    }
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *This is for palindrome: package interview.questionsHard;
import java.util.Scanner;
public class PalindromeMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a text:");
		String str = input.nextLine();
		System.out.println("Is this text a palindrome :" + isPalindrome(str));
	}
	public static boolean isPalindrome(String str) {
		String str2 = "";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}
		if (str2.equals(str)) {
			return true;
		} else {
			return false;
		}
	}
}

		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *public class IsPalindrom {
    public void checkPalindrom(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
//      String reverse = "";
//      
//      for(int i=str.length()-1; i>=0;i--) {
//          reverse=reverse+str.charAt(i);
//      }
//      
        if(reverse.equals(str)) {
            System.out.println("This string is a palindrome");
        }else {
            System.out.println("This string is NOT a palindrome");
        }   
        
        
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("Please enter a String :");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        
        IsPalindrom obj = new IsPalindrom();
        obj.checkPalindrom(str);
        
    }
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 *
		 */
 
public class week__3 {

}




