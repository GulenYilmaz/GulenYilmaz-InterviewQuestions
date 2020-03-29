package InterviewQuestionss;

public class StringReverse5 {

	public static void main(String[] args) {
		// Write a java program to reverse String? 
		//Reverse a string word by word? kelime kelime tersden yazdirma

		
		String str="Opportunity seldom knocks twice";
		
		char[] chars= str.toCharArray();
		int length= chars.length;
		
		System.out.println(length);
		
		for(int i=length-1;i>=0;i--) {
		
			System.out.print(chars[i]);
	    }
		
		
		
		
		
		
		
		
		
		String given ="I love java";
		
		String revered="";
		
		for(int i=given.length()-1; i>0; i--) {
			revered=revered+given.charAt(i);
		}
		System.out.println("Reversed String = "+revered);
		
		String[] array=given.split(" ");
		String reverseWords="";
		
		
		 for( int i=array.length-1; i>0;i--) {
			 reverseWords=reverseWords+array[i];
			 
		 }
		System.out.println("Reversed String word by word ="+ reverseWords);
		
	}

}