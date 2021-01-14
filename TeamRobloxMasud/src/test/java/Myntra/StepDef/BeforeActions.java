package Myntra.StepDef;

import Myntra.Utilities.MyntraSetUpDrivers;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeActions {
	
	@Before
	public void beforeScenario(Scenario scen) {

		System.out.println("..Chrome Driver initialization..");
		MyntraSetUpDrivers.myntraSetUpDrivers();
		System.out.println("..Chrome Driver initialized..");
		System.out.println("scen.getName()");

	}
}
