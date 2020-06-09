package WeeklyIQStudy;
/*
@Haciosmanoglu How to capture Screenshot in Selenium WebDriver?

@Seyma Atasoy  What are the different exceptions you have faced in Selenium WebDriver? What is
StaleElementReferenceException? Have you encountered it ever and how you handled it?

@Ayse Ozkan (online) What are the open-source Frameworks supported by Selenium WebDriver?

@Ali Kemal Tarlaci (online) How to press the ENTER key on a text box In Selenium WebDriver? How to press the TAB key in Selenium?

@Tugba Akca (online) How To Scroll Web Page Down Or Up Using Selenium WebDriver?

@Turker Dogruer (online)How to handle hidden elements in Selenium WebDriver? Is there a way to click hidden LINK in WebDriver?

@Adile Karadeniz (online) How do you handle the calendar elements? WebTables?

@Bayramgul Atageldiyeva How To Perform Right Click in Selenium WebDriver? Double Click? Hover over on a web element? Drag And Drop? What operations can you do using Actions class?

@Servet AKGUC Advantages of Page Object Model:. What is the difference between POM and PageFactory?

@Kurt Scenario: you have 2 frames on the page and in 1 you need to enter some text in
second you need to click a button. How can you do that? Can you switch from frame
to frame directly?

@Gulen  Scenario: there is a submit button on the page it has id property. By using id we got
an element not found exception, how will you handle this situation? What might be
the problem in this case?
 */
public class week_7 {
/*
 * public class Tester {
	public static void main(String[] args) {
		
		String reverse="";
		Scanner scan=new Scanner(System.in);
		System.out.println("give me a string to check if it is a Palindrome or not");
		reverse=scan.nextLine();
		int length=reverse.length();
		for(int i=length-1;i>=0;i--)
			reverse+=reverse.charAt(i);
		if(reverse.equals(reverse))
			System.out.println("This is a pure Palindrome");
		else
			System.out.println(" This is not  a palindrome");
	}
}
 */
	
	/*Cucumber Options tag is used to provide a link between the feature 
	 * files and step definition files. step defination file for corresponding method
 dryRun = enable us to quick scan our features without running them.
 In order to use @RunWith annotation we need to pass a class that is extended 
 from Runner. @RunWith(classNameRunner.class). 
 cunku runner class extend ve bunun icin RunWith kullaniyoruz. we invoke specific
  class as a test runner and responsible for junit test
DATA DRIVEN TABLE (DDT) =  Data Driven Testing, which allows to automatically run
 a test case multiple times with different input and validation values.
Scenario Outline – This is used to run the same scenario for 2 or more different 
sets of test data. E.g. In our scenario, if you want to register another user you 
can data drive the same scenario twice.
Examples – All scenario outlines have to be followed with the Examples section. 
This contains the data that has to be passed on to the scenario.
DATA DRIVEN REPORT (CUCUMBER REPORT ) =  Contain information about what scenarios 
have passed or failed. ... This page documents built-in formatter plugins, custom 
formatters and some common third-party plugins.
 
 @CucumberOptions = @CucumberOptions annotation provides the same options as the
  cucumber jvm command line
 HOW TO RUN CUCEMBER WITH JUNIT? = The first thing I would say about this question
  is Runner class needs to be set.  Cucumber uses Junit we need to have a Test
   Runner class. This class will use the Junit annotation @RunWith(), which tells
    JUnit what is the test runner class. It more like a starting point for Junit 
    to start executing your tests. In the src folder create a class called TestRunner
 SCENARIO OUTLINE? VS SCENARIO? = scenario will be executed once while scenario
  outline is executed for each example from the table. Scenaio include step will
   only executed one time, whereas multiple steps executed // In scenario data table
    works for specific step wheras SCENARIO works for SPECIFICS. 
 HOW TO USE MAPS IN CUCUMBER? = In the previous chapter of Data Tables in Cucumber,
  we consider a very simple example of passing UserName and Passwordin the step. 
  Let's take a little complex scenario where  a good amount of data is required to 
  pass in the step. Or what is there are multiple columns of test data is present.
   How would you handle it? The answer is to make a Use of Maps in Data Tables. 
   WE USE MAP TO IMPLEMENT THE SPECIFICS TO STORE THOSE DATA. we took data from 
   excel and store to MAP/LIST
    List<Map<String,String>> addEmployeeList  = dataTable.asMapList();
	 * 
	 */
}
