//grouping we use for running only the specific method 
//create a xml file and run their

package TestNG_Task;

import org.testng.annotations.Test;

public class GroupingConcept {
	@Test(groups = "odd")
	public void f1() {
		System.out.println("Printing f1");
	}

	@Test(groups = "even")
	public void f2() {
		System.out.println("Printing f2");
	}

	@Test(groups = "odd")
	public void f3() {
		System.out.println("Printing f3");
	}

	@Test(groups = "even")
	public void f4() {
		System.out.println("Printing f4");
	}

	@Test
	public void f5() {
		System.out.println("aaaaaa");
	}

}
