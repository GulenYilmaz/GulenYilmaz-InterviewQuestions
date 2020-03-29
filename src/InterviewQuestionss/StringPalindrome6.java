////import java.util.Scanner;
////
////public class StringPalindrome6 {// tersden de ayni sekilde okunan kelime
////
////	public static void main(String[] args) {
//
//
//// Function that returns true if String is a palindrome
//			
//		
////		String original="";
////		String reverse = ""; //2 Strings
////		
////		Scanner scan = new Scanner(System.in);
////		System.out.println("Enter a String:");
////		
////		
////		original = scan.nextLine();
////		      
////		int length = original.length(); //length of the original
////		      
////		for ( int i=length-1; i>= 0; i-- )
////		         reverse = reverse + original.charAt(i);//  didid-->01234 length--->5 5-1=4
////		      
////		if (original.equalsIgnoreCase(reverse))
////		         System.out.println(original+" is a palindrome");
////		     
////		else
////		         System.out.println(original+" is not a palindrome");
////		
//		
//		
//		String str="kayak";
//		//how to create reverse of string
//		//1 way
//		char[] charArray=str.toCharArray();
//		
//		String reverse="";
//		System.out.println(reverse.isEmpty());
//		
//	    for(int i=charArray.length-1; i>=0; i--) {
//			reverse+=charArray[i];
//		}
//	    System.out.println("word is= "+str);
//		System.out.println("reverse is= "+reverse);
//		
//		if(str.contentEquals(reverse)) {
//			System.out.println("yes it is a palindrome");
//		}else {
//			System.out.println("no it is not a palindrome");
//		}
//		
//		
//		
//		
//		
//		
//	}
//
//}
