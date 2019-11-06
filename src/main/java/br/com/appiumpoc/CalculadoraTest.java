package br.com.appiumpoc;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculadoraTest {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("plataformName", "Android");
        // para saber o nome do device, digitar no terminal adb devices
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("automationName","uiautomator2");
        desiredCapabilities.setCapability("appPackage","com.android.calculator2");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("unicodeKeyboard", true);
        desiredCapabilities.setCapability("resetKeyboard", true);



        AndroidDriver<MobileElement> driver = new AndroidDriver (new URL("http://localhost:4723/wd/hub"), desiredCapabilities);
        // MobileElement el3 = (MobileElement) driver.findElements(By.id("com.android.calculator2:id/digit_2"));

        driver.findElement(By.id("com.android.calculator2:id/digit_2")).click();

        driver.findElement(By.id("com.android.calculator2:id/digit_3")).click();


        //MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
        //el3.click();






    }
}
