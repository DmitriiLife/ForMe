package ru.shadrin.elements;

import org.openqa.selenium.By;

public class SplashScreenElements {

    //text
    public By textEarnPoints = By.xpath("//*[text(),'Копите баллы']");
    public By textLearnPoints = By.xpath("//*[text(),'Узнавайте, сколько баллов вам начислено, оплачивайте ими покупки']");
    public By textBuySmart = By.xpath("//*[text(),'Покупайте с умом']");
    public By textFindProducts = By.xpath("//*[text(),'Находите товары в наличии и по акции при помощи фильтров']");
    public By textSaveTime = By.xpath("//*[text(),'Экономьте время']");
    public By textControlOrders = By.xpath("//*[text(),'Контролируйте заказы и получайте моментальные уведомления по статусам заказов']");
    public By textAlertTitle = By.xpath("//*[@resource-id='android:id/alertTitle']");


    //button
    public By buttonNextOnboard = By.xpath("//*[@resource-id='onboard-next-btn']");
    public By buttonAlertGoToStore = By.xpath("//*[@resource-id='android:id/button2']");
    public By buttonAlertCancel = By.xpath("//*[@resource-id='android:id/button1']");



}
