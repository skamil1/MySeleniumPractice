package com.cydeo.test.avengersHours.day2;

import com.cydeo.test.OfficeHours.utilities.Driver;
import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P01_SliderCont extends TestBase {
    @Test
    public void testName() throws InterruptedException {
        driver.get("http://www.uitestpractice.com/");
        Assert.assertFalse(driver.findElement(By.xpath("//div[.='20']")).isDisplayed());
        //Move to right the slider handle and make number 20 visible
        WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-state-default ui-corner-all']"));
        actions.moveToElement(slider).clickAndHold().moveByOffset(700, 0).perform();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.xpath("//div[.='20']")).isDisplayed());

    }
}
