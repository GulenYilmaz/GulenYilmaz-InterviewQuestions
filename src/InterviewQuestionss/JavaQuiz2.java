package InterviewQuestionss;

public class JavaQuiz2 {

	public static void main(String[] args) {
		
	//2 	What is the output of the below Program

		 

//		public class ArraysConcept {
//
//		public static void main(String[] args) {
////
//		int nums[] = { 12, 15, 16, 17, 19 };
//
//		   for (int i = nums.length-1; i >0; i--) {
//
//		      System.out.println(nums[i]);
//
//		    }

//		}
//
//		}
//
//		Group of answer choices
//
//		12 15 16 17 19
//
//		Throws ArrayIndexOutOfBoundsException
//
//		19 17 16 15-->
//
//		19 17 16 15 12	
		
		
	//	What is the output of the below Program ?
//				int i = 50;
//
//				int[] a = new int[10];
//				System.out.println(a.length);
//
//				a = new int[100];
//				System.out.println(a.length);
//
//				a = new int[i];
//				System.out.println(a.length);
			//	}}
//				Group of answer choices
//
//				Throws ArrayIndexOutOfBoundsException
//
//				10 10 10
//
//				10 100 50-->
//
//				Compilation Error
//		
		// 4  public class ArraysConcept {

		//	public static void main(String[] args) {
//			int[] a = {12, 15, 11, 13, 9, 25};
//			int[] a2 = {12, 15, 11, 13, 9, 25};
//			int sum = 0;
//			for (int i = 0; i <a.length; i++) {
//			         if (a[i] % 2== a2[i ] % 5)  {
//			                  sum += i * i;
//			         }
//			}
//			System.out.println("sum = " + sum);
		//	}

		//	}

//			Group of answer choices
//
//			sum = 1
//
//			sum = 2
//
//			sum = 4
//
//			sum = 0
//		
		
	// 5	A Java array that would have rows and columns is called a _____ array?
//				Group of answer choices
//
//				Sequence
//
//				Cubic
//
//				Two-dimensional
//
//				Three-dimensional	
//		
//		
		
//	6	What is the output of the below program?
//
//				public class ArraysConcept {
//
//				public static void main(String[] args) {
//				int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };
//
//				for ( int index= 0 ; index < 5 ; index++ ) {
//				       System.out.print( egArray[ index ] + " " );
//				}
//
//				}}
//
//				Group of answer choices
//
//				2 4 6 8
//
//				2 4 6 8 10--->
//
//				Throws ArrayIndexOutOfBoundsException
//
//				2 4 6 8 10 1 3 5 7 9	
//		
		
		//7 Which of these is an incorrect array declaration?
//				a) int arr[] = new int[5];
//				b) int [] arr = new int[5];
//				c) int arr[] = new int[5];
//				d) int arr[] = int [5] new;
			//	Group of answer choices

//		8  What is the output of the below program?
//
//				public class ArraysConcept {
//
//				public static void main(String[] args) {
//				char array_variable [] = new char[10];
//				for (int i = 0; i < 10; ++i) {
//				         array_variable[i] = 'i';
//				         System.out.print(array_variable[i] + " ");
//				}
			//	}}

//				Group of answer choices
//
//				1 2 3 4 5 6 7 8 9 10
//
//				0 1 2 3 4 5 6 7 8 9 10
//
//				i i i i i i i i i i i
//
//				i i i i i i i i i i
		
//	9	What is the output of the below program?
//
//				public class ArraysConcept {
//
//				public static void main(String[] args) {

//				int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//
//				int sum = 0;
//
//				for (int i = 0; i < 3; ++i) {
//
//				   for (int j = 0; j < 3; ++j) {
//
//				       sum = sum + array_variable[i][j];
//
//				   }
//
//				}
//
//				System.out.print(sum / 5);//}}

//				Group of answer choices
//
//				0
//
//				Compilation Error
//
//				9
//
//				10
//		
		
		
		
		
		
		
		
		
//	//10 	public class ArraysConcept {
//
//		//	public static void main(String[] args) {
//
//			int[] array = { 1, 4, 3, 6, 8, 2, 5 };
//
//			int what = array[0];//1
//
//			for (int index = 0; index < array.length; index++) {//-->7
//
//			       if (array[index] > what) {
//
//			                  what = array[index];
//
//			        }  }System.out.println(what);
////		6
//
//		2
//
//		8--->
//
//		5
//
//			}
//
//			System.out.println(what);-->8
//
//		
		
//		11  What is the output of the below Program?
//
//				int[] zip = new int[5];
//
//				zip[0] = 7;
//				zip[1] = 3;
//				zip[2] = 4;
//				zip[3] = 1;-->
//				zip[4] = 9;
//
//				System.out.println( zip[ 2 + 1 ] );-->1
//				}}	
//		
		
	//12	Output of the program
//
//		for(int i=1; i<15; i=i+3) {
//
//		    System.out.print(i);
//
//		}

	//	Group of answer choices

	//	14710156

	//	147101356

	//	15

	//	1471013-->
	
		//13	What is the output?
//			
//		int x=1;
//
//		while(x<5) {   
//
//		   x++;   
//
//		   System.out.print(x);
//
//		}

			//	Group of answer choices

			//	2345-->

			//	1234

			//	None

			//	2346		
		
		
	//14	What will be the output of the following program?

			//	public class YZ {
			//	   public static void main(String args[]) {
//				     int z = 0;
//				     for (int y = 0; y >= z; y++) {
//				         System.out.print(y + "~");
//				         System.out.println(z);
//				     }
//				  }
//				}

//				Group of answer choices
//
//				Compilation Error
//
//				0~0
//
//				Goes to infinite loop--->
//
//				Run Time Error
		
//	15	Which of the following is true regarding the continue statement in a
//		for loop?
//
//		Group of answer choices
//
//		continue transfers the control flow to the initialization statement of the for loop.
//
//		continue transfers the control flow to the statement just before the for loop
//
//		continue transfers the control flow to the update statement of the for loop.--corrct
//
//		continue transfers the control flow to the conditional statement of the for loop.--->
//		
		
		//16How many times will the following code print "Welcome to Java"?
//				int count = 0;
//				while (count++ < 10) {
//				System.out.println("Welcome to Java");
//				}

//				Group of answer choices
//
//				Infinty
//
//				11 times
//
//				0 times
//
//				10 times-->	
//		
		//17 The while loop and the do loop are equivalent in their expressive power; 
		//in other words, you can rewrite a while loop using a do loop, and vice versa.

//		Group of answer choices
//
//		True--->
//
//		False	
//		
//	18	This type of loop is ideal in situations where the exact number of iterations is known.
//
//		Group of answer choices
//
//		None of the above
//
//		For-->
//
//		While
//
//		Do While	
	//19	What is y after the following for loop statement is executed?
//				int y = 0;
//				for (int i = 0; i < 10; ++i) {
//				y += 1;
//				}System.out.println(y);

//				Group of answer choices
//
//				10--->correct
//
//				0--->
//
//				11
//
//				1
//		
			//	Question 20
			//	What will be the output of the following program?

////
//				for(int i = 0; i <= 5; i++ ) {
//				   System.out.println("i = " + i );
//				}
//
//				System.out.println("i after the loop = " + i );

//				Group of answer choices
//
//				i = 0 i = 1 i = 2 i = 3 i = 4 i = 5 i after the loop = 6
//
//				i = 0 i = 1 i = 2 i = 3 i = 4 i = 5
//
//				i = 0 i = 1 i = 2 i = 3 i = 4 i = 5 i = 6
//
//				Compilation Errors-->
//	
//	
		//	21	What is the output of the below program? 
 
						//class ForSample
					//	{

						//    public static void main(String s[])
						 //   {
//						        for(int i = 0; i <= 5; i++ )
//						        {
//						            System.out.println("i = " + i );
//						        }
//						 //   }
					//	}

//						Group of answer choices
//
//						Compilation Error
//
//						i = 0--->
//
//						i = 1
//
//						i = 2
//
//						i = 3
//
//						i = 4
//
//						i = 5
//
//
//						i = 0 i = 1 i = 2 i = 3 i = 4 i = 5
						        
						        
					//22	        What is the output of the program?
//
//						        		int k=3, tot=0;
//
//						        		do{
//
//						        		   tot=tot+k;
//
//						        		   k++;
//
//						        		} while(k<11);
//
//						        		System.out.print(tot);

//						        		Group of answer choices
//
//						        		52--->
//
//						        		56
//
//						        		Run time error
//
//						        		54				        
//						        
						        
						        
			//23	What is the output of below program
////
//				int x=1;
//
//				do{
//
//				   x++;
//
//				   System.out.print(x);
//
//				}while(x<5);

//				Group of answer choices
//
//				2345-->
//
//				2346
//
//				run time error
//
//				Compilation Error				        
//						        
//						        
						        
			//24	What is the output of below program?
////
//						int z=2, sum=0;
//
//						while(z<9) {
//
//						   z++;
//
//						   sum=sum+z;
//
//						}
//
//						System.out.print(sum);

//						Group of answer choices
//
//						None of the above
//
//						46
//
//						42--->
//
//						44				        

	
	
			//25	What is the Output?

//						int m=2, total=0;
//
//						while(m<6) {
//
//						   total=total+m;
//
//						   m++;
//
//						}
//
//						System.out.print(total);

//						Group of answer choices
//
//						14-->
//
//						16
//
//						20
//
//						18
//	
//	
	
	
	
	
	
	
	
			}}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	
