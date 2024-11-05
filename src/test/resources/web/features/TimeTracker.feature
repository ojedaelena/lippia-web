@TimeTracker
Feature: Time tracker

  Background:
    Given The user is on the landing page
    And The user login with credentials email ojedaelena121@gmail.com and password contraseña123

  # TEST 1
   @Smoke @RegisterTimeTrackerSuccessful
  Scenario: Register time tracker successful
    When Click on the manual icon
    And Set the description meet_afternoon of the new time tracker
    And Click on 'Project'
    And Click on the project name 'project_work'
    And Set the start time 17:00
    And Set the end time 17:45
    And Set the date 06/11/2024
    And Click on the 'ADD' button
    Then The user sees the time tracker create message

  # TEST 2
   @Smoke @CancelTimeTrackerSuccessful
  Scenario: Cancel time tracker successful
    When Click on the timer icon
    And Set the description new_meet to discard
    And Click on 'Project'
    And Click on the project name 'project_work'
    And Click on the 'START' button
    And Click on the three vertical points icon
    And Click on the 'Discard' option
    And Click on the 'DISCARD' button
    Then The user sees the time tracker cancellation message

  # TEST 3
  @Do @Smoke @ModifyTimeTrackerSuccessful
  Scenario: Modify time tracker successful
    When Set the new description new_time to modify
    Then The user sees the time tracker update message





