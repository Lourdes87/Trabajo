package org.example;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Login1 {
    public AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        String appiumServerURL = "http://127.0.0.1:4723/";
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppActivity("mx.com.miapp.ui.general.splash.SplashActivity");
        options.setPlatformName("android");
        options.setDeviceName("XEGNW18320002180");
        options.setAppPackage("mx.com.miapp.dev");
        options.setNoReset(true);
        options.setAutomationName("UiAutomator2");
        driver = new AndroidDriver(new URL(appiumServerURL), options);
    }

    @Test
    public void login() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Fresa26_");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btn_pri")).click();
    }
}



