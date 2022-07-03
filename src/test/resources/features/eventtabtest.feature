Feature:Event tab functionality of Bleucrm Application
  As a user, I should be able to create events by clicking on Event tab under Activity Stream.

  Background: For the scenarios in the feature file, user is expected to be on login page and click even tab
    Given user is on the bleucrm login page and click even tab

  Scenario:User add Event start and ending date and time, select "All day" and specify the time zone.
    When click Event start date box,
    And click a month selection
    And select the month "September"
    And click a year selection
    And select  a year "2023"
    And click day "11"

    And click starting time box
    And select hours "10"
    And select minutes "30"
    And clik set time box

    And click Event ending date box
    And click a ending month selection
    And select the ending month "September"
    And click a ending year selection
    And select  a ending year "2023"
    And click ending day "28"

    And click ending time box
    And select ending hours "12"
    And select ending minutes "30"
    And clik ending set time box

    And click All day box
    And click specify the time zone first box
    And select "(Utc + 03:00) Europe/Istanbul"
    And click specify the time zone second box
    And select "(Utc + 03:00) Europe/Kiev"


