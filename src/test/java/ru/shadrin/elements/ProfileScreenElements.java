package ru.shadrin.elements;

import org.openqa.selenium.By;

public class ProfileScreenElements {

    //string
    public String stringMarketFio = "Шадрин Дмитрий Вадимович";
    public String stringMarketFioNonQpoint = "Qpoint Фл Нет";
    public String stringIproFio = "Шадрин Дмитрий Вадимович";
    public String stringSaleTen = "10%  скидки";
    public String stringQuantityBalls = "9597";
    public String stringBalls = "баллов";

    //text
    public By textFio = By.xpath("//*[@text='Шадрин Дмитрий Вадимович']");
    public By textSupervisor = By.xpath("//*[@text='Руководитель']");
    public By textYouManager = By.xpath("//*[@text='Ваш персональный менеджер']");
    public By textYouManagerFIO = By.xpath("//*[@text='Бакулин В.В.']");
    public By textIproDateProfile = By.xpath("//*[@text='Данные профиля']");
    public By textToastInformerWebU = By.xpath("//*[contains(@text, 'Вы перешли на веб-сайт')]");
    public By textQuantitySale = By.xpath("//*[@resource-id='profile-header-label']/android.view.ViewGroup/android.widget.TextView[1]");
    public By textQuantityBalls = By.xpath("//*[@resource-id='profile-header-label']/android.view.ViewGroup/android.widget.TextView[2]");
    public By textBalls = By.xpath("//*[@resource-id='profile-header-label']/android.view.ViewGroup/android.widget.TextView[3]");

    //button
    public By buttonOrder = By.xpath("//*[@text='Мои документы']");
    public By buttonHeaderName = By.xpath("//*[@resource-id='profile-header-name']//android.widget.TextView[1]");
    public By buttonHeaderLabel = By.xpath("//*[@resource-id='profile-header-label']");
    public By buttonMarketChooseCity = By.xpath("//*[@resource-id='profile-market-choose-city']");
    public By buttonMyEstimates = By.xpath("//*[@resource-id='profile-list-estimates']");
    public By buttonMyFavorites = By.xpath("//*[@resource-id='profile-list-favorites']");
    public By buttonListNoty = By.xpath("//*[@resource-id='profile-list-noty']");
    public By buttonMarketPersonalData = By.xpath("//*[@resource-id='profile-list-market-personal-data']");
    public By buttonIproMessageManager = By.xpath("//*[@resource-id='profile-ipro-message']");
    public By buttonIproTelephoneManager = By.xpath("//*[@resource-id='profile-ipro-phone']");
    public By buttonIproFinancialInformation = By.xpath("//*[@resource-id='profile-list-ipro-financial-information']");
    public By buttonIproMyDocs = By.xpath("//*[@resource-id='profile-list-ipro-my-docs']");
    public By buttonIproEDISettings = By.xpath("//*[@resource-id='profile-list-ipro-EDI-settings']");
    public By buttonIproContactDetails = By.xpath("//*[@resource-id='profile-list-contact-details']");

}
