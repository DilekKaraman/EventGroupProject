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

    @FindBy(xpath ="//a[.='2022']")
    public WebElement startyear;


    @FindBy(xpath ="//span[.='2023']")
    public List<WebElement> selectyear;

    @FindBy(xpath ="//a[.='July']")
    public WebElement startmonth;

    @FindBy(xpath ="//span[.='September']")
    public List<WebElement> selectmonth;

    @FindBy(xpath ="//a[.='11']")
    public WebElement startday;

    @FindBy(id="feed_cal_event_from_timecal_3Jcl")
    public WebElement starttime;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement starthour;


    @FindBy(xpath = "//td[title='Increase (Up)']")
    public WebElement startmin;

    @FindBy(xpath = "//input[@value='Set Time']")
    public WebElement setTime;


    @FindBy(id="feed-cal-event-tocal_3Jcl")
    public WebElement enddatebox;

    @FindBy(xpath ="//a[@class='bx-calendar-top-month']")
    public WebElement endmonth;

    @FindBy(xpath ="//span[.='September']")
    public List<WebElement> selectendmonth;

    @FindBy(xpath ="//a[@class='bx-calendar-top-year']")
    public WebElement endyear;


    @FindBy(xpath ="//span[.='2023']")
    public List<WebElement> selectendyear;



    @FindBy(xpath ="//a[.='28']")
    public WebElement endday;

    @FindBy(xpath = "//input[@value='Set Time'][1]")
    public WebElement endsetTime;

    @FindBy(xpath = "//span[@name='EVENT_FULL_DAY']")
    public WebElement allday;

    @FindBy(xpath="//span[@class='feed-ev-tz-open']")
    public WebElement specifytimezone;

    @FindBy(id="feed-cal-tz-fromcal_3Jcl")
    public WebElement fromzone;

    @FindBy(id="feed-cal-tz-tocal_3Jcl")
    public WebElement tozone;

}