package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class AppTest {
    @Test
        public void Testcase1() {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://yopmail.com/en");
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5));

        WebElement inputBar = driver.findElement(By.className("ycptinput"));
        inputBar.sendKeys("testing");
        WebElement enterKey = driver.findElement(By.xpath("//button[@class=\"md\"]"));
        enterKey.click();
        WebElement titleEmail = driver.findElement(By.className("bname"));

//        Assert.assertEquals(titleEmail.getText(), "testing@yopmail.com>");

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(titleEmail.getText(), "testing@yopmail.com");

//        Wait<WebDriver> wait = new WebDriver(driver, Duration.ofSeconds(30));
//        wait.until(d-> inputBar.isDisplayed());
        driver.quit();
        softAssert.assertAll();

//        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
//        driver.getTitle();
//
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
//
//        WebElement textBox = driver.findElement(By.name("my-text"));
//        WebElement submitButton = driver.findElement(By.cssSelector("button"));
//
//        textBox.sendKeys("Selenium");
//        submitButton.click();
//
//        WebElement message = driver.findElement(By.id("message"));
//        message.getText();

//        driver.quit();

        }}
