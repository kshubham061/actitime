package BasicTestScript;

import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;

public class ClassB {
	public class CreateProductTest extends BaseClassFinder {
		
		@Test
		public void createCustomer() {
			System.out.println("The Customer is created");
			
		}
	}

}
