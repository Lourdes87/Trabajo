package org.example;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.google.common.collect.ImmutableMap;
import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



public class Login {
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



    public void login(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Fresa01_");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btn_pri")).click();
        //menu inferior
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        By.id("mx.com.miapp.dev:id/img_more").findElement (driver).click();
        //Fin menu inferior
        By.xpath("//android.view.ViewGroup").findElement(driver).click();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("2000");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //esta linea sire para que se baje buscando un elemento como el botón continuar
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"" + "mx.com.miapp.dev:id/btnContinue" + "\").instance(" + "0" + "))"));

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btnContinue")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btnContinue")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().resourceId(\"" + "mx.com.miapp.dev:id/btnEnd" + "\").instance(" + "0" + "))"));
        driver.findElement(By.id("mx.com.miapp.dev:id/btnEnd")).click();


        //driver.findElement(By.xpath("//android.widget.ScrollView")).click();
        //driver.findElement(By.xpath("//android.widget.ScrollView")).scroll(with(Down ));
        //driver.findElement(By.id("mx.com.miapp.dev:id/tvLabelNotChangeDevice")).click();

                       }


   /* public void cvv() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/container_cvv_layout")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/text_input_end_icon")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Fresa01_");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //esta linea ayuda a dar el enter, se deben instalar la libreria de google
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "done"));
    }*/


}