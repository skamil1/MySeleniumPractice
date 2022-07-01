package com.cydeo.test.avengersHours.day1;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P01_isDisplayed extends TestBase {
    @Test
    public void test1(){
        driver.get("http://www.uitestpractice.com/");
        System.out.println(driver.findElement(By.xpath("//a[.='Testing Controls ']")).getText());
        System.out.println(driver.findElement(By.xpath("//a[.='Testing Controls ']")).isEnabled());
        Assert.assertTrue(driver.findElement(By.xpath("//a[.='Testing Controls ']")).isDisplayed());

    }
}
