package BasicTestScript;

import org.testng.annotations.Test;

import TestNg.BaseClass;



public class ClassA extends BaseClass {
	
	@Test
	public void createCustomer() {
		System.out.println("The Customer is created");
		
	}
	
	@Test
	public void createProduct() {
		System.out.println("The Product is created");
		
	}

}
