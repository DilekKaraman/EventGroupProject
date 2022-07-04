Feature:Event tab functionality of Bleucrm Application
  As a user, I should be able to create events by clicking on Event tab under Activity Stream.

  Background: For the scenarios in the feature file, user is expected to be on login page and click even tab
    Given user is on the bleucrm login page and click even tab
@AC1
  Scenario:User adds Event start and ending date and time, select "All day" and specify the time zone.
  And user adds Event start date and time
  And user adds Event ending date and time
  And click all day box
  And reclick all day box
  And click specify the time zone first box
  And select "(Utc + 03:00) Europe/Istanbul"
  And click specify the time zone second box
  And select "(Utc + 03:00) Europe/Kiev"

  @AC2
  Scenario: User creates set reminder
    When type reminder time "2"
    And select type of reminder time "hours"
  @AC3
  Scenario: User selects the event location from the dropdown.
    When select event location "East Meeting Room"
    Then system should display "East Meeting Room" as location

  @AC4
  Scenario:User adds members by selecting contacts individually or adding groups and departments.
    And user clicks to add person "John Terrry"
    And user clicks to add group  "Corporate Christmas Party"
    And user clicks to add department "hr2@cybertekschool.com"
    Then system should display selected person on members box

    @AC5
    Scenario:User sends messages by filling the mandatory fields.
      When type Event Name "Meeting"
      And click send button

    @AC6
    Scenario:User cancels sending event at any time before sending.
      When click sending button
      And click cansel button
      Then Message should display be selected on screen







