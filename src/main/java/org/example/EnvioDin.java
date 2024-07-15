package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class EnvioDin {
    public static AppiumDriver driver;

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
    public  void Envio (){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Fresa26_");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btn_pri")).click();
        //menu inferior
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

        //Menu inferior sin opción "mas"
        By.id("mx.com.miapp.dev:id/tv_send_money").findElement(driver).click();
        driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"mx.com.miapp.dev:id/btnElement\"])[2]")).click();
        driver.findElement(By.id("mx.com.miapp.dev:id/imgOtherAccounts")).click();
        driver.findElement(By.xpath("(//android.view.ViewGroup[@resource-id=\"mx.com.miapp.dev:id/layout\"])[2]")).click();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Importe\").instance(" + "0" + "))"));
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Importe\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Importe\"]")).sendKeys("1000");
        //driver.findElement(By.xpath("//android.widget.EditText[@text=\"Concepto\"]")).sendKeys("Envio frecuentes");
        //driver.findElement(By.xpath("mx.com.miapp.dev:id/btnNext")).click();
        //continuara-......



    }

}
