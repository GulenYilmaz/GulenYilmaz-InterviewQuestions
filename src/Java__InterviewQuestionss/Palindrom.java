package Java__InterviewQuestionss;

public class Palindrom {

	public static void main(String[] args) {
		String str="Kayak";
        String reverse="";
        for(int i=str.length()-1;i>=0;i--) {
            reverse+=str.charAt(i);
            }
        if(str.equals(reverse)) {
                System.out.println("It is palindrome");
            }else {
                System.out.println("It is NOT palindrome");
        }
        System.out.println(reverse);
    }
}