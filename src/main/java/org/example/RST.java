package org.example;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class RST {
    public AndroidDriver driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
        String appiumServerURL ="http://127.0.0.1:4723/wd/hub";
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("appActivity", "mx.com.miapp.ui.general.splash.SplashActivity");
        caps.setCapability("platformName", "android");
        caps.setCapability("deviceName", "XEGNW18320002180");
        caps.setCapability("appPackage", "mx.com.miapp.dev");
        caps.setCapability("noReset","true");
        driver = new AndroidDriver(new URL(appiumServerURL),caps);
    }
    @Test
    public void RTC (){

        //selecciona llave
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btn_pri")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/img_bottom_sheet")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/img_card_withdrawal")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("2000");
        driver.hideKeyboard();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btnContinue")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btnContinue")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.ScrollView")).click();
        //driver.findElement(By.xpath("//android.widget.ScrollView")).scroll(with(Down ));
        driver.findElement(By.id("mx.com.miapp.dev:id/tvLabelNotChangeDevice")).click();
    }
}
