package org.example;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Prueba {
    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        String appiumServerURL = "http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "android");
        caps.setCapability("deviceName", "XEGNW18320002180");
        caps.setCapability("appPackage", "mx.com.miapp.dev");
        caps.setCapability("appActivity", "mx.com.miapp.ui.general.splash.SplashActivity");
        caps.setCapability("noReset", "true");
        driver = new AndroidDriver(new URL(appiumServerURL), caps);
    }

    @Test
    public void login() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Petalo_40");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btn_pri")).click();
    }

}