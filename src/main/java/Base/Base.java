package Base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    WebDriver webDriver;
    AndroidDriver androidDriver;
    DesiredCapabilities capabilities;

    public void initializatoin() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("VERSION", "11");
        capabilities.setCapability("deviceName","ZF622732C8");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", "com.google.android.calculator");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Automation Started.......");
    }
}
