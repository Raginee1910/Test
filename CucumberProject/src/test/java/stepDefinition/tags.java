//package stepDefinition;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import io.cucumber.java.BeforeStep;
//import io.cucumber.java.en.*;
//
//public class tags {
//	
//	@Before(value="@Regression",order=1)
//	public void beforeHooks()
//	{
//		System.out.println("checking before hooks");
//	}
//	/*
//	 * @After(order=1) public void aftrerHooks() {
//	 * System.out.println("checking after hooks"); }
//	 * 
//	 * @BeforeStep(order=1) public void beforeStep() {
//	 * System.out.println("before step"); }
//	 * 
//	 * @AfterStep(order=1) public void afterStep() {
//	 * System.out.println("after step"); }
//	 * 
//	 * @Before(order=2) public void beforeSecondHook() {
//	 * System.out.println("before second hook"); }
//	 */
//	
//	/*
//	 * @After(order=2) public void afterSecondHook() {
//	 * System.out.println("after second hook"); }
//	 * 
//	 * @BeforeStep(order=2) public void beforeSecondStep() {
//	 * System.out.println(" before 2nd step"); }
//	 * 
//	 * @AfterStep(order=2) public void afterSecondStep() {
//	 * System.out.println("after second step"); }
//	 */
//	@Given("check my First Name")
//	public void m1() {
//		System.out.println(" I m in m1");
//	}
//	@And ("print my last name")
//	public void m2() {
//		System.out.println(" I m in m2");
//	}
//	@Given ("print bruno name")
//	public void m3() {
//		System.out.println(" I m in m3");
//	}
//	@And ("print bruno last name")
//	public void m4() {
//		System.out.println(" I m in m4");
//	}
//	@And ("print kikee name")
//	public void m5() {
//		System.out.println(" I m in m5");
//	}
//	@When ("her mother asked her name")
//	public void m6() {
//		System.out.println(" I m in m6");
//	}
//
//	public void m7() {
//
//	}
//
//	public void m8() {
//
//	}
//
//}
