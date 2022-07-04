package com.bleucrm.step_definitions;

import com.bleucrm.pages.EvenTabPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EventStepDefinitions {
    EvenTabPage evenTabPage = new EvenTabPage();

    @Given("user is on the bleucrm login page and click even tab")
    public void user_is_on_the_bleucrm_login_page_and_click_even_tab() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        evenTabPage.login();
        evenTabPage.Event.click();
        BrowserUtils.sleep(5);
    }

    @Given("user adds Event start date and time")
    public void user_adds_event_start_date_and_time() {
        String sDate = "09/11/2023";
        String sTime = "10:00 am";
        evenTabPage.startdatebox.clear();
        evenTabPage.startdatebox.sendKeys(sDate);
        evenTabPage.starttime.clear();
        evenTabPage.starttime.sendKeys(sTime);
        BrowserUtils.sleep(5);
    }

    @Given("user adds Event ending date and time")
    public void user_adds_event_ending_date_and_time() {
        String eDate = "09/28/2023";
        String eTime = "11:00 am";
        evenTabPage.endtime.clear();
        evenTabPage.enddatebox.clear();
        evenTabPage.enddatebox.sendKeys(eDate);
        evenTabPage.endtime.sendKeys(eTime);
        BrowserUtils.sleep(5);
    }

    @When("click all day box")
    public void click_all_day_box() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(evenTabPage.allday).doubleClick().perform();
        BrowserUtils.sleep(2);
    }

    @When("reclick all day box")
    public void reclick_all_day_box() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(evenTabPage.allday).click().perform();
        BrowserUtils.sleep(2);
    }

    @When("click specify the time zone first box")
    public void click_specify_the_time_zone_first_box() {
        evenTabPage.specifytimezone.click();
        BrowserUtils.sleep(1);
    }

    @When("select {string}")
    public void select(String string) {
        Select select = new Select(evenTabPage.fromzone);
        select.selectByVisibleText("(UTC +03:00) Europe/Istanbul");
        BrowserUtils.sleep(2);
    }

    @When("click specify the time zone second box")
    public void click_specify_the_time_zone_second_box() {
        Select select = new Select(evenTabPage.tozone);
        select.selectByVisibleText("(UTC +03:00) Europe/Kiev");
    }


    @When("type reminder time {string}")
    public void type_reminder_time(String string) {
        evenTabPage.remindertime.clear();
        BrowserUtils.sleep(2);
        evenTabPage.remindertime.sendKeys("2");
        BrowserUtils.sleep(2);
    }

    @When("select type of reminder time {string}")
    public void select_type_of_reminder_time(String string) {
        Select select = new Select(evenTabPage.timetype);
        select.selectByVisibleText("hours");
        BrowserUtils.sleep(1);
    }


    @When("select event location {string}")
    public void select_event_location(String string) {
       evenTabPage.location.clear();
       String locate="East Meeting Room";
       evenTabPage.location.sendKeys(locate);
    BrowserUtils.sleep(4);
    /*second way
    activityStreamPage.eventLocationBox.click();
        activityStreamPage.chooseLocation(location);
     */
    }
    @Then("system should display {string} as location")
    public void system_should_display_as_location(String string) {
        String expected="East Meeting Room";
        Assert.assertEquals(expected,evenTabPage.location.getAttribute("value"));
    }

    @Given("user clicks to add person {string}")
    public void user_clicks_to_add_person(String string) {
    evenTabPage.addPersonGroupDepartmentBox.click();
    evenTabPage.person.click();
    BrowserUtils.sleep(2);

    }
    @Given("user clicks to add group  {string}")
    public void user_clicks_to_add_group(String string) {
    evenTabPage.group.click();
    BrowserUtils.sleep(2);
    }
    @Given("user clicks to add department {string}")
    public void user_clicks_to_add_department(String string) {
    evenTabPage.department.click();
    evenTabPage.hrdepartment.click();
    evenTabPage.closedepartment.click();
    BrowserUtils.sleep(4);
    }
    @Then("system should display selected person on members box")
    public void system_should_display_selected_person_on_members_box() {
    Assert.assertTrue(evenTabPage.checkperson.isDisplayed());
    }
    @When("type Event Name {string}")
    public void type_event_name(String string) {
    evenTabPage.eventName.click();
    evenTabPage.eventName.sendKeys("Meeting");
BrowserUtils.sleep(4);
    }
    @When("click send button")
    public void click_send_button() {
    evenTabPage.sendButton.click();
    BrowserUtils.sleep(1);
    }

    @When("click sending button")
    public void click_sending_button() {
        evenTabPage.sendButton.click();
        BrowserUtils.sleep(1);
    }
    @When("click cansel button")
    public void click_cansel_button() {
    evenTabPage.canselbutton.click();
    BrowserUtils.sleep(2);
    }

}





