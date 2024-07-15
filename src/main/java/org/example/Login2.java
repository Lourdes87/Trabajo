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



public class Login2 {
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


    public void login() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Fresa26_");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btn_pri")).click();
        //menu inferior
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        By.id("mx.com.miapp.dev:id/img_more").findElement(driver).click();
        //Fin menu inferior

       /*  //Menu inferior CVV
        By.xpath("(//android.view.ViewGroup[@resource-id=\"mx.com.miapp.dev:id/btn_container_action\"])[1]").findElement(driver).click();
        driver.findElement(By.id("mx.com.miapp.dev:id/btnGenerateSecurityCode")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btnIfinish")).click();
        //Fin del CVV */

        /* //menu inferior Token
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        By.xpath("(//android.view.ViewGroup[@resource-id=\"mx.com.miapp.dev:id/btn_container_action\"])[12]").findElement(driver).click();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btnContinue")).click();
        //Fin de Token*/

        //RST
        /*
        By.xpath("(//android.view.ViewGroup[@resource-id=\"mx.com.miapp.dev:id/btn_container_action\"])[5]").findElement(driver).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("2000");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //esta linea sire para que se baje buscando un elemento como el botón continuar opción texto
         //driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Continuar\").instance(0))")).click();
        //esta linea sire para que se baje buscando un elemento como el botón continuar opción ID ya que xptah es una lata
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"" + "mx.com.miapp.dev:id/btnContinue" + "\").instance(" + "0" + "))"));
/*
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btnContinue")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btnContinue")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"" + "mx.com.miapp.dev:id/btnEnd" + "\").instance(" + "0" + "))"));
        driver.findElement(By.id("mx.com.miapp.dev:id/btnEnd")).click();
        //FIn del RTS */


        //Disponer efectivo
        /*
        By.xpath("(//android.view.ViewGroup[@resource-id=\"mx.com.miapp.dev:id/btn_container_action\"])[8]").findElement(driver).click();
        driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"mx.com.miapp.dev:id/btnElement\"])[1]")).click();
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"mx.com.miapp.dev:id/product_name\" and @text=\"CUENTA EFECTIVA DIGITAL GC ***6037\"]")).click();
        //esta linea sire para que se baje buscando un elemento como el campo Otra cantidad buscando por la opción texto
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Otra cantidad\").instance(" + "0" + "))")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@text=\"Otra cantidad\"]")).sendKeys("1000");
        //nueva opción para esconder el teclado para appium 2.0
        driver.navigate().back();
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Continuar\").instance(0))")).click();
        driver.findElement(By.id("mx.com.miapp.dev:id/continue_opt")).click();
        driver.findElement(By.id("mx.com.miapp.dev:id/continue_opt")).click();
        //fin de disposicion de efectivo
        */




    }
}

