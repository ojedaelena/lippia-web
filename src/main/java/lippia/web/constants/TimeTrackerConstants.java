package lippia.web.constants;

public class TimeTrackerConstants {
    // TEST 1
    public static final String MANUAL_ICON = "xpath://*[@id='manual-mode']/img";
    public static final String DESCRIPTION_INPUT = "xpath://*[@id='layout-main']//input[@type='text']";
    public static final String PROJECT_TIME = "xpath://time-tracker-recorder//project-picker-label//a/span";
    public static final String PROJECT_WORK_BUTTON = "xpath://*[@id='layout-main']//time-tracker-recorder//project-picker//button";
    public static final String START_TIME_INPUT = "xpath://*[@id='layout-main']//time-tracker-recorder//single-date-picker2//input-time-ampm[1]/input";
    public static final String END_TIME_INPUT = "xpath://*[@id='layout-main']//time-tracker-recorder//single-date-picker2//input-time-ampm[2]/input";
    public static final String DATE_INPUT = "xpath://*[@id='layout-main']//time-tracker-recorder//single-date-picker2//div[3]/input";
    public static final String ADD_BUTTON = "xpath://*[@id='layout-main']//time-tracker-recorder//div[2]//div[3]//app-button[1]/button";
    public static final String CREATE_MESSAGE = "xpath://*[@aria-label='Time entry has been created']";

    // TEST 2
    public static final String TIMER_ICON = "xpath://*[@data-cy='timer-mode']/img";
    public static final String START_BUTTON = "xpath://*[@id='layout-main']//time-tracker-recorder//stopwatch//app-button[1]/button";
    public static final String THREE_POINTS_ICON = "xpath://*[@id='layout-main']//time-tracker-recorder//stopwatch//div[3]//img";
    public static final String DISCARD_OPTION = "xpath://*[@id='layout-main']//time-tracker-recorder//stopwatch//div[3]//div[2]//list-items//div[2]/a";
    public static final String DISCARD_BUTTON = "xpath://button[contains(text(),'Discard')]";
    public static final String CANCEL_MESSAGE = "xpath://*[@aria-label='Timer cancelled']";

    // TEST 3
    public static final String DESCRIPTION_MODIFY_INPUT = "xpath:(//span/div/input)[1]";
    public static final String FREE_CONTAINER = "xpath://*[@id='cdk-drop-list-0']/li[1]/div";
    public static final String UPDATE_MESSAGE = "xpath://*[@aria-label='Successfully updated description']";

}
