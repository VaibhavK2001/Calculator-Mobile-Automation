package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator_Test {

    AndroidDriver driver;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("BROWSER_NAME", "Android");
        capabilities.setCapability("VERSION", "4.4.2");
        capabilities.setCapability("deviceName","Emulator");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", "com.android.calculator2");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Automation Started.......");
    }

    @Test
    public void addition(){
        driver.findElement(By.id("com.android.calculator2:id/digit_5")).click();
        driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
    }

    @Test
    public void subtraction(){
        driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
        driver.findElement(By.id("com.android.calculator2:id/op_sub")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
    }

    @Test
    public void multiplication(){
        driver.findElement(By.id("com.android.calculator2:id/digit_8")).click();
        driver.findElement(By.id("com.android.calculator2:id/op_mul")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
    }

    @Test
    public void division(){
        driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
        driver.findElement(By.id("com.android.calculator2:id/op_div")).click();
        driver.findElement(By.id("com.android.calculator2:id/digit_0")).click();
        driver.findElement(By.id("com.android.calculator2:id/eq")).click();
    }
}
