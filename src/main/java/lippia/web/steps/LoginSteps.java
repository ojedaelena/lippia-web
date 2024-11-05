package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.LandingService;
import lippia.web.services.LogInService;

public class LoginSteps extends PageSteps {

    @Given("The user is on the landing page")
    public void theUserIsOnTheLandingPage() {
        LandingService.navegarWeb();
    }

    @And("^The user login with credentials email (.*) and password (.*)$")
    public void login(String email, String password) {
        LandingService.clickOnLogIn();
        LogInService.logInManually();
        LogInService.setTheEmail( email );
        LogInService.setThePassword( password );
        LogInService.buttonLogIn();
    }

}
