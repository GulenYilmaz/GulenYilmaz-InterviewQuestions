package Java__InterviewQuestionss;

public class FindNumberOfWords4 {

	public static void main(String[] args) {
		//4  Find out how many alpha characters are present in a String?  
		//Find number of words in string?



        String str="Find number of words in string";
		
		String [] words= str.split(" ");
		int length= words.length;
		
		System.out.println(length);
		
		for(String word:words) {
		
			System.out.print(word+" ");
	    }System.out.println();
	
	
	String x="hjkdufh$^&* oio";
	x=x.replaceAll("[^A-Za-z]", "");
	int numbers=x.length();
	System.out.println("numbers of alpha characters ="+numbers);
	
	
	
	}
	
}
