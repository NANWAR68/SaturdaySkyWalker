package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	
	@Before                                              //Before Action will run before executing any scenario
	public void beforeActions(Scenario scen){            //Pass cucumber scenario parameter to get feature file scenario name
		System.out.println("Initializing Driver ....");
		SetupDrivers.setupDriver();                    //Calling setup driver method to execute before
		System.out.println("Test Scenario name:"+scen.getName());
	}
	
}
