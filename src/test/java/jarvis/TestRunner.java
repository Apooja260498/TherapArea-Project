package jarvis;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//if hamare framework mai junit hya to cucumberoptions ka sath @Runwith annitation bhi lagta hya or AbstractTestNGCucumberTests iski jarurat nhi hya  but abhi testNG hya to @cucumberOptions ya annotation used hoga

@CucumberOptions(features = "src/test/resources/features/adminLogin.feature", glue="com.admin.stepDefinations",plugin = {
        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
} )
public class TestRunner extends AbstractTestNGCucumberTests {

}
	