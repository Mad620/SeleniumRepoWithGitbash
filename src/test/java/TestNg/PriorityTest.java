package TestNg;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority=-3,invocationCount=3)
	public void m1() {
		System.out.println("insidem1");
	}
	@Test(priority=2,invocationCount=6)
	public void m2() {
		System.out.println("m2 will execute");
	}
	
	@Test(priority=-2,invocationCount=4)
	public void m3() {
		System.out.println("inside m3");
	}
	
	@Test(priority=4)
	public void m4() {
		System.out.println("m4 will execute");
	}


}