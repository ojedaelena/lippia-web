package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.TimeTrackerService;

public class TimeTrackerSteps extends PageSteps {
    // TEST 1
    @When("Click on the manual icon")
    public void clickOnTheManualIcon() {
        TimeTrackerService.manualIcon();
    }

    @And("^Set the description (.*) of the new time tracker$")
    public void setTheDescription(String description) {
        TimeTrackerService.setTheDescription( description );
    }

    @And("Click on 'Project'")
    public void clickOnProject() {
        TimeTrackerService.projectTime();
    }

    @And("Click on the project name 'project_work'")
    public void clickOnProjectWork() {
        TimeTrackerService.projectWork();
    }

    @And("^Set the start time (.*)$")
    public void setStartTime(String startTime) {
        TimeTrackerService.setStartTime( startTime );
    }

    @And("^Set the end time (.*)$")
    public void setEndTime(String endTime) {
        TimeTrackerService.setEndTime( endTime );
    }

    @And("^Set the date (.*)$")
    public void setDate(String date) {
        TimeTrackerService.setDate( date );
    }

    @And("Click on the 'ADD' button")
    public void clickOnTheAddButton() {
        TimeTrackerService.addButton();
    }

    @Then("The user sees the time tracker create message")
    public void theTimeTrackerCreateMessage() {
        TimeTrackerService.theTimeTrackerCreateMessage();
    }

    // TEST 2
    @When("Click on the timer icon")
    public void clickOnTheTimerIcon() {
        TimeTrackerService.timerIcon();
    }
    @And("^Set the description (.*) to discard$")
    public void setTheDescriptionToDiscard(String newDescription) {
        TimeTrackerService.setTheDescriptionToDiscard( newDescription );
    }

    @And("Click on the 'START' button")
    public void clickOnTheStartButton() {
        TimeTrackerService.startButton();
    }

    @And("Click on the three vertical points icon")
    public void clickOnTheThreeVerticalPointsIcon() {
        TimeTrackerService.threeVerticalPointsIcon();
    }

    @And("Click on the 'Discard' option")
    public void clickOnTheDiscardOption() {
        TimeTrackerService.discardOption();
    }
    @And("Click on the 'DISCARD' button")
    public void clickOnTheDiscardButton(){
        TimeTrackerService.discardButton();
    }

    @Then("The user sees the time tracker cancellation message")
    public void theTimeTrackerCancellationMessage() {
        TimeTrackerService.theTimeTrackerCancellationMessage();
    }

    // TEST 3
    @When("^Set the new description (.*) to modify$")
    public void setNewDescription(String newDescription) {
        TimeTrackerService.setNewDescription( newDescription );
    }

    @Then("The user sees the time tracker update message")
    public void theTimeTrackerUpdateMessage() {
        TimeTrackerService.theTimeTrackerUpdateMessage();
    }


}
