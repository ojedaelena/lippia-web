package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import junit.framework.Assert;
import lippia.web.constants.TimeTrackerConstants;

import static com.crowdar.core.actions.ActionManager.*;

public class TimeTrackerService {
    // TEST 1
    public static void manualIcon() {
        WebActionManager.click(TimeTrackerConstants.MANUAL_ICON);
    }

    public static void setTheDescription(String description) {
        WebActionManager.setInput( TimeTrackerConstants.DESCRIPTION_INPUT, description );
    }

    public static void projectTime() {
        WebActionManager.click( TimeTrackerConstants.PROJECT_TIME );
    }

    public static void projectWork() {
        WebActionManager.click( TimeTrackerConstants.PROJECT_WORK_BUTTON );
    }

    public static void setStartTime(String startTime) {
        WebActionManager.click(TimeTrackerConstants.START_TIME_INPUT);
        WebActionManager.setInput( TimeTrackerConstants.START_TIME_INPUT, startTime );
    }

    public static void setEndTime(String endTime) {
        WebActionManager.click(TimeTrackerConstants.END_TIME_INPUT);
        WebActionManager.setInput( TimeTrackerConstants.END_TIME_INPUT, endTime );
    }

    public static void setDate(String date) {
        WebActionManager.click( TimeTrackerConstants.DATE_INPUT );
        WebActionManager.setInput( TimeTrackerConstants.DATE_INPUT, date );
    }

    public static void addButton() {
        WebActionManager.click( TimeTrackerConstants.ADD_BUTTON );
    }

    public static void theTimeTrackerCreateMessage() {
        waitVisibility(TimeTrackerConstants.CREATE_MESSAGE);
        Assert.assertTrue(isVisible(TimeTrackerConstants.CREATE_MESSAGE));
    }


    // TEST 2
    public static void timerIcon() {
        WebActionManager.click(TimeTrackerConstants.TIMER_ICON);
    }

    public static void setTheDescriptionToDiscard(String newDescription) {
        WebActionManager.setInput( TimeTrackerConstants.DESCRIPTION_INPUT, newDescription );
    }

    public static void startButton() {
        WebActionManager.click( TimeTrackerConstants.START_BUTTON );
    }

    public static void threeVerticalPointsIcon() {
        WebActionManager.click( TimeTrackerConstants.THREE_POINTS_ICON );
    }

    public static void discardOption() {
        WebActionManager.click( TimeTrackerConstants.DISCARD_OPTION );
    }

    public static void discardButton() {
        WebActionManager.click( TimeTrackerConstants.DISCARD_BUTTON );
    }

    public static void theTimeTrackerCancellationMessage() {
        waitVisibility(TimeTrackerConstants.CANCEL_MESSAGE);
        Assert.assertTrue(isVisible(TimeTrackerConstants.CANCEL_MESSAGE));
    }


    // TEST 3
    public static void setNewDescription(String newDescription) {
        WebActionManager.click(TimeTrackerConstants.DESCRIPTION_MODIFY_INPUT, false);
        WebActionManager.waitVisibility(TimeTrackerConstants.DESCRIPTION_MODIFY_INPUT).clear();
        WebActionManager.setInput( TimeTrackerConstants.DESCRIPTION_MODIFY_INPUT, newDescription );
        WebActionManager.click(TimeTrackerConstants.FREE_CONTAINER);
        WebActionManager.click(TimeTrackerConstants.DESCRIPTION_MODIFY_INPUT, false);
    }

    public static void theTimeTrackerUpdateMessage() {
        waitVisibility(TimeTrackerConstants.UPDATE_MESSAGE);
        Assert.assertTrue(isVisible(TimeTrackerConstants.UPDATE_MESSAGE));
    }

}
