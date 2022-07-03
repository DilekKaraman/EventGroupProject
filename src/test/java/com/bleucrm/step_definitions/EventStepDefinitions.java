package com.bleucrm.step_definitions;

import com.bleucrm.pages.EvenTabPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EventStepDefinitions {
    EvenTabPage evenTabPage=new EvenTabPage();
    @Given("user is on the bleucrm login page and click even tab")
    public void user_is_on_the_bleucrm_login_page_and_click_even_tab() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        evenTabPage.login();
        evenTabPage.Event.click();
    }
    @When("click Event start date box,")
    public void click_event_start_date_box()  {
    evenTabPage.startdatebox.click();
    }
    @When("click a month selection")
    public void click_a_month_selection()  {
        evenTabPage.startmonth.click();
    }
    @When("select the month {string}")
    public void select_the_month(String string) {
        for (WebElement eachmonth : evenTabPage.selectmonth) {
            String expectedmonth = "September";
            if (eachmonth.getText().equals(expectedmonth)) {
                eachmonth.click();
            }
        }
    }
    @When("click a year selection")
    public void click_a_year_selection()  {
        evenTabPage.startyear.click();
        BrowserUtils.sleep(1);
    }
    @When("select  a year {string}")
    public void select_a_year(String string)  {
        for(WebElement eachyear:evenTabPage.selectyear) {
            String expectedyear="2023";
            if (eachyear.getText().equals(expectedyear)) {
                eachyear.click();
            }
        }
        BrowserUtils.sleep(1);
    }
    @When("click day {string}")
    public void click_day(String string) {
    evenTabPage.startday.click();
        BrowserUtils.sleep(1);
    }
    @When("click starting time box")
    public void click_starting_time_box() {
    evenTabPage.starttime.click();
        BrowserUtils.sleep(2);
    }
    @When("select hours {string}")
    public void select_hours (String string) {
        /*
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(evenTabPage.starthour).doubleClick().sendKeys("10").perform();
        BrowserUtils.sleep(1);

*/


    }
    @When("select minutes {string}")
    public void select_minutes(String string) {

    }
    @When("clik set time box")
    public void clik_set_time_box() {
    evenTabPage.setTime.click();
    }

    @When("click Event ending date box")
    public void click_event_ending_date_box() {
    evenTabPage.enddatebox.click();
        BrowserUtils.sleep(2);
    }
    @When("click a ending month selection")
    public void click_a_ending_month_selection()  {
        evenTabPage.endmonth.click();
        BrowserUtils.sleep(2);
    }

    @When("select the ending month {string}")
    public void select_the_ending_month(String string) {
        for (WebElement eachmonth : evenTabPage.selectendmonth) {
            String expectedmonth = "September";
            if (eachmonth.getText().equals(expectedmonth)) {
                eachmonth.click();
            }
        }
    }
    @When("click a ending year selection")
    public void click_a_ending_year_selection()  {
        evenTabPage.endyear.click();
        BrowserUtils.sleep(1);
    }

    @When("select  a ending year {string}")
    public void select_a_ending_year(String string)  {
        for(WebElement eachyear:evenTabPage.selectendyear) {
            String expectedyear="2023";
            if (eachyear.getText().equals(expectedyear)) {
                eachyear.click();
            }
        }
        BrowserUtils.sleep(2);
    }

    @When("click ending day {string}")
    public void click_ending_day(String string) {
        evenTabPage.endday.click();
        BrowserUtils.sleep(2);
    }



    @When("click ending time box")
    public void click_ending_time_box() {
        evenTabPage.starttime.click();
        BrowserUtils.sleep(2);
    }
    @When("select ending hours {string}")
    public void select_ending_hours (String string) {

    }
    @When("select ending minutes {string}")
    public void select_ending_minutes(String string) {

    }
    @When("clik ending set time box")
    public void clik_ending_set_time_box() {
    evenTabPage.endsetTime.click();
    }



    @When("click All day box")
    public void click_all_day_box(String string) {
    evenTabPage.allday.click();
    }
    @When("click specify the time zone first box")
    public void click_specify_the_time_zone_first_box() {
    evenTabPage.specifytimezone.click();
    }
    @When("select {string}")
    public void select(String string) {
        Select select=new Select(evenTabPage.fromzone);
        select.selectByVisibleText("(Utc + 03:00) Europe/Istanbul");
    }
    @When("click specify the time zone second box")
    public void click_specify_the_time_zone_second_box() {
        Select select=new Select(evenTabPage.tozone);
        select.selectByVisibleText("(Utc + 03:00) Europe/Kiev");
    }
}
