package InterviewQuestionss;

public class Swap__String {

	public static void main(String[] args) {
		//another way
				String s1="Hello";
				String s2="Bye";
				
				
				s1=s1+s2;//HelloBye
				
				
				
				s2 = s1.replace(s2, "");//--->bye   bye=HelloBye.replace(bye,"");--->hello
				s1 = s1.replace(s2, "");//--->hellobye-->bye
				
				System.out.println("The value of s1 = "+s1);
				System.out.println("The value of s2 = "+s2);
				

	}

}
