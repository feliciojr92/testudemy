package org.example.teste;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class DeviceFarmLogin {
    private static ScreenLogin ScreenLogin;
    private static AppiumDriver<RemoteWebElement> driver1;

    @BeforeClass
    public static void caps() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        //Set your access credentials
        caps.setCapability("browserstack.user","feliciojunior_PhXWEy");
        caps.setCapability("browserstack.key","GjRakxPtiqFsEc15C8sx");

        //Set URL of the application under test
        caps.setCapability("app","bs://069db7f8c1e2f7461770b83fb4b77545f960dda6");

        //Specify device and os_version for testing
        caps.setCapability("device","Google Pixel 3");
        caps.setCapability("os_version","9.0");


        //Set other BrowserStack capabilities
        /*caps.setCapability("project","First Java Project");
        caps.setCapability("build","Java Android");
        caps.setCapability("name","first_test");*/

        driver1 = new AndroidDriver<RemoteWebElement>(new URL("http://hub.browserstack.com/wd/hub"), caps);
        ScreenLogin = new ScreenLogin(driver1);
    }

    @Test
    public void testeLogin() {

        ScreenLogin.logar();
    }

}
