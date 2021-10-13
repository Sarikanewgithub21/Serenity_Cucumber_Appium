package starter.Pages;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import starter.ElementDefinitions.Login;

public class LoginPage extends ScenarioSteps {


    Login login ;

    @Step("Open the app on a mobile device")
    public void openApplication() {

        login.loadApp();
        System.out.println("Hai");
        System.out.println("Changes done");
        System.out.println("This is working fine");
        System.out.println("Done");
        System.out.println("Tested");
    }
    }



