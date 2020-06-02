package WeeklyIQStudy;

public class SwapNumbers {

	    public static void main(String[] args) {
	       //swap numbers with no temp variable
	        int a = 10;
	        int b = 20;
	        a = a + b;// first this should be there a=10+20=30
	        b = a - b; // b= 30-20=10
	        a = a - b; // a=30-10=20
	        System.out.println(a);
	        System.out.println(b);
	        //swap strings with no temp variable
	        String x="Hello";
	        String y="Welcome";
	        x=x+y; //HelloWelcome
	        y=x.substring(0,(x).length()-y.length());
	        x=x.substring(y.length());
	        System.out.println(x);
	        System.out.println(y);
	    }
}
