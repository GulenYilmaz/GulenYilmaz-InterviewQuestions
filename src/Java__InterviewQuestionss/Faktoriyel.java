package Java__InterviewQuestionss;

import java.util.Scanner;

public class Faktoriyel {

	public static void faktoriyel() {
		Scanner scan =new Scanner (System.in);//import java.util.Scanner;
		System.out.println("number ");
		
		int num;
		num=scan.nextInt();
		int faktoriyel=1;
		while (num>0) {
			
			faktoriyel=faktoriyel*num;
			num--;
		}
		System.out.println("Faktoriyel " + faktoriyel);
		
		
	}
	
	
	public static void main(String[] args) {

		faktoriyel();
		
	}

}
