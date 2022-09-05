package org.example.teste;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class ScreenLogin {

    public ScreenLogin(AppiumDriver<RemoteWebElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "login_username")
    //@iOSFindBY(accessibility="") para IOS
    private RemoteWebElement campoEmail;

    @AndroidFindBy(id = "login_password")
    //@iOSFindBY(accessibility="") para IOS
    private RemoteWebElement campoSenha;

    @AndroidFindBy(id = "login_button")
    //@iOSFindBY(accessibility="") para IOS
    private RemoteWebElement botaoLogin;

    public void logar() {
        campoEmail.sendKeys("qazando@gmail.com");
        campoSenha.sendKeys("1234");
        botaoLogin.click();
    }

}
