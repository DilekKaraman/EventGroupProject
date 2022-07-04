package com.bleucrm.pages;

import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EvenTabPage {

    public EvenTabPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement loginBox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement inputPassword;

    @FindBy(className = "login-btn")
    public WebElement loginButton;

    @FindBy(xpath = "//span[.='Event']")
    public WebElement Event;

    public void login() {
        loginBox.sendKeys(ConfigurationReader.getProperty("userlogin"));
        inputPassword.sendKeys(ConfigurationReader.getProperty("userpassword"));
        loginButton.click();
    }

    @FindBy(id="feed-cal-event-fromcal_3Jcl")
    public WebElement startdatebox;

    @FindBy(id="feed_cal_event_from_timecal_3Jcl")
    public WebElement starttime;

    @FindBy(id="feed-cal-event-tocal_3Jcl")
    public WebElement enddatebox;

    @FindBy(xpath = "//input[@id='feed_cal_event_to_timecal_3Jcl']")
    public WebElement endtime;


    @FindBy(id="event-full-daycal_3Jcl")
    public WebElement allday;

    @FindBy(xpath="//span[@class='feed-ev-tz-open']")
    public WebElement specifytimezone;

    @FindBy(id="feed-cal-tz-fromcal_3Jcl")
    public WebElement fromzone;

    @FindBy(id="feed-cal-tz-tocal_3Jcl")
    public WebElement tozone;

    @FindBy(id="event-remind_countcal_3Jcl")
    public WebElement remindertime;

    @FindBy(id="event-remind_typecal_3Jcl")
    public WebElement timetype;

    @FindBy(id="event-locationcal_3Jcl")
    public WebElement location;
    /*second way
public void chooseLocation(String location) {
        int numOfLocator = 0;
        switch (location) {
            case "Central Meeting Room":
                numOfLocator = 1;
                break;
            case "East Meeting Room":
                numOfLocator = 2;
                break;
            case "West Meeting Room":
                numOfLocator = 3;
                break;
        }
        String locator = "//div[@class='bxecpl-loc-popup calendar-inp calendar-inp-time calendar-inp-loc']/div["+numOfLocator+"]";
        Driver.get().findElement(By.xpath(locator)).click();
    }
     */

    @FindBy(id="feed-event-dest-cont")
    public WebElement addPersonGroupDepartmentBox;

    @FindBy(id="calnAJEM3_last_U693")
    public WebElement person;

    @FindBy(xpath = "//div[@class='bx-finder-box-item-t7-name']")
    public WebElement group;

    @FindBy(id="destDepartmentTab_calnAJEM3")
    public WebElement department;

    @FindBy(xpath = "//div[.='hr2@cybertekschool.com']")
    public WebElement hrdepartment;

    @FindBy(xpath = "//span[@class='popup-window-close-icon']")
    public WebElement closedepartment;

    @FindBy(xpath= "//span[@class='feed-event-destination-text']")
    public WebElement checkperson;

    @FindBy(id="feed-cal-event-namecal_3Jcl")
    public WebElement eventName;

    @FindBy(id="blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(id="blog-submit-button-cancel")
    public WebElement canselbutton;




}