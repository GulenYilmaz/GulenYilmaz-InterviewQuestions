package WeeklyIQStudy;
/*
 * @ahmet What is the use of @Listener annotation in TestNG?
@Ayse Ozkan (online) Ozkan (online) What is TestNG?What are the advantages of TestNG?
@Ali Kemal Tarlaci (online) How to exclude a particular test method from a test 
case execution testng.xml file?
@Tugba Akca (online)How to create Group of Groups in TestNG.xml file?
@Turker Dogruer (online)What is Maven?Why Maven? How it helps you developing your 
project effectively?
@Bayramgul Atageldiyeva Difference between JUnit and TestNG
@Kurt What is assertions in TestNG?
@Gulen Where do you find your dependencies/libraries?What is .m2 folder?
@Servet AKGUC What is test base Class ? and How do you implement in your framework ?
@Adile Karadeniz (online)What are @Factory and @DataProvider annotation?
 */
public class week__9 {
/*
What is the difference btw TESTNG and Junit



TestNG vs Junit:                                                                                                                                                                                           TestNG supports testing in groups but it is not supported in JUnit.
TestNG has a feature to configure dependency tests. Dependency test
configuration for software web applications is not possible in JUnit.
 Test prioritization, Parallel testing is possible in TestNG. 
 It is not supported by
JUnit.
 TestNG compare to Junit provides additional annotations such as:
 @BeforeSuite
 @BeforeTest
 @BeforeGroups
 @AfterGroups
 @Aftertest
 @AfterSuite
 * 
 * 
 * What is Assertion in TESTNG?
TestNG Asserts helps us to verify the conditions of the test in the middle of the test run  and decide whether test has failed or passed. A test is considered successful ONLY if it is completed without throwing any exception.
TestNG Asserts are the most frequently used methods while creating Selenium Scripts. 
Here I do take two test conditions. In the first condition, I take a title value correctly and use assertEquals statement and in the second condition, I take incorrect title value to deliberately throw the exception.
Step 1: Open Gmail
Step 2: Verify whether the title matches to the given String. If it matches, go to the email field and type the given text in the sendKeys method else it throws an exception
Note: In this step, I took the actualTitle value correctly in the below script. So it goes to the email filed and type the given text.
Step 3: Again open gmail
Step 4: Verify whether the title matches to the given String. If it matches, go to the email field and type the given text in the sendKeys method else it throws an exception
Note: In this step, I took incorrect actualTitle value. Here due to assertion fails, it throws an exception.
 */
}
