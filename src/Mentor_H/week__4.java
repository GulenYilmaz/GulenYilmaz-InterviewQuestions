package Mentor_H;
/*
 * First of all, we will start our session with 10 mins daily stand-up!
--What did you do yesterday?
--What will you do today?
--Do you have any blockers?
The Questions that we are going to discuss during the session are below;
1.Write a program to print first 10 numbers of fibonacci series.
2.What is immutability in java?
3.What is the difference between checked and unchecked exception?
4.How many locators do you know in Selenium?
5.How do you handle dropdowns?
 */
public class week__4 {
	public static void main(String[] args) {
		
		
		//0  1  1  2  3  5  8  13
		//a  b  c=a+b
		//   a  b  c=a+b
		//      a  b  c=a+b
		
		int a=0;
		int b=1;
		int c;
		
		for(int i=0;i<10; i++) {
			
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
		
		
		
		

		/*
		 * What is immutability in java?
		 */
		  String str="hello";
		  str.concat("world");//hello
		  str=str.concat("world");
		  System.out.println(str);//helloworld
		  
		  StringBuilder str1=new StringBuilder("hello");
		  str1.append("world");
		  System.out.println(str1);//helloworld
		
		
		
		
		/*
		 * What is the difference between checked and unchecked exception?
		 * checked exception is compiler time exception 
		 * 
		 * 
		 * unchecked exception is a runtime exception
		 */
		
	}
	
	
}
