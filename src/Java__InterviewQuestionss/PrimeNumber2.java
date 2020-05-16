package Java__InterviewQuestionss;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		//2 Write a java program to check whether a given number is prime or not?

		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter number ");
		
		int given= scan.nextInt();
		
			/*
			 * Write a java program to check whether a given number is prime or not?
			 * 
			 * prime number is a number that is greater than 1
			 * prime number should meet 2 conditions(divisible by 1 and itself only)
			 * 2(1,2),3(2,3),5(2,3,4,5),7(2,3,4,5,6,7),11,13,17
			 */

			given = 10;
			boolean isPrime=true;

			if(given>1) {
				for(int i=2; i<given; i++) {
					if(given%i==0) {
						isPrime=false;
						break;
					}
				}

			}else {
				isPrime=false;
			}
			System.out.println("Given number "+given+" is prime? "+isPrime);

		}
	}