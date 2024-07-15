import com.google.common.collect.ImmutableMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CvvToken {
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
    public void cvv() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/container_cvv_layout")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/text_input_end_icon")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.EditText")).sendKeys("Fresa25_");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //esta linea ayuda a dar el enter, se deben instalar la libreria de google
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "done"));
        driver.findElement(By.id("mx.com.miapp.dev:id/btnGenerateSecurityCode")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btnIfinish")).click();
    }

    /*public void Token(){
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/img_token_digital")).click();
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
        driver.findElement(By.id("mx.com.miapp.dev:id/btnContinue")).click();
    }*/


}
