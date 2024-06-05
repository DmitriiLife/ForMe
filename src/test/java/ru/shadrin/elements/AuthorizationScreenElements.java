package ru.shadrin.elements;

import org.openqa.selenium.By;

public class AuthorizationScreenElements {

    //string
    public String stringMarketPhone = "9111342707";
    public String stringMarketPhoneNonQpoint = "9818867491";
    public String stringMarketPassword = "qwerty12345";
    public String stringIproLogin = "1326156sdv";
    public String stringIproPassword = "qwerty12345";


    //text
    public By textLoginToIPRO = By.xpath("//*[@text='Вход в систему iPRO']");

    //button
    public By buttonRegistration = By.xpath("//*[@resource-id='login-registration-button']");
    public By buttonPressBack = By.xpath("//*[@resource-id='cart-header-left-element']");
    public By buttonMarket = By.xpath("//*[@content-desc='Частное лицо']");
    public By buttonIpro = By.xpath("//*[@content-desc='Организация']");
    public By buttonMarketEye = By.xpath("//*[@resource-id='login-individual-password-eye']");
    public By buttonForgotPassword = By.xpath("//*[@resource-id='login-forgot-password']");
    public By buttonLoginToAccount = By.xpath("//*[@resource-id='login-enter-button']");
    public By buttonIproEye = By.xpath("//*[@resource-id='login-organization-password-eye']");

    //input
    public By inputMarketPhone = By.xpath("//*[@resource-id='login-individual-phone']");
    public By inputMarketPassword = By.xpath("//*[@resource-id='login-individual-password']");
    public By inputIproLogin = By.xpath("//*[@resource-id='login-organization-login']");
    public By inputIproPassword = By.xpath("//*[@resource-id='login-organization-password']");


}
