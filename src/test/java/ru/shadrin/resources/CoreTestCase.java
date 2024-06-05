package ru.shadrin.resources;

import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;

public class CoreTestCase {

    public static AndroidDriver driver;
    private final static String AppiumUrl = "http://127.0.0.1:4723";

    @BeforeAll
    protected static void setUp() throws IOException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("appium:deviceName", "14");
        desiredCapabilities.setCapability("appium:app", "/Users/dmitrijsadrin/Desktop/iPRO.apk");
        desiredCapabilities.setCapability("appium:ignoreHiddenApiPolicyError", true);
        desiredCapabilities.setCapability("appium:noReset", true);
        desiredCapabilities.setCapability("appium:appWaitActivity", "*");
        desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
        desiredCapabilities.setCapability("appium:nativeWebScreenshot", true);
        desiredCapabilities.setCapability("appium:newCommandTimeout", 1500);
        desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);
        desiredCapabilities.setCapability("appium:automationName", "Uiautomator2");

        URL remoteUrl = new URL(AppiumUrl);

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @AfterAll
    protected static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
