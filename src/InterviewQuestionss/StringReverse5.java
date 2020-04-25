package InterviewQuestionss;

public class StringReverse5 {

	public static void main(String[] args) {
		// Write a java program to reverse String? 
		//Reverse a string word by word? kelime kelime tersden yazdirma

		
		String str="Opportunity seldom knocks twice";
		
		char[] arrays=str.toCharArray();
		
		int length= arrays.length;
		
		System.out.println(length);
		
		for(int i=length-1;i>=0;i--) {
		
			System.out.print(arrays[i]);
	    }
		System.out.println("");
		
		
		System.out.println("-----second way-------");
		
		
		
		
		
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