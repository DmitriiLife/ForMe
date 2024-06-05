package ru.shadrin.elements;

import org.openqa.selenium.By;

public class OrderIsProcessedElements {

    //text
    public By textNumberOrder(String s) {
        return By.xpath("//*[@text='" + s + "']");
    }

    public By textOrderIsProcessed = By.xpath("//*[@text='Заказ оформлен']");
    public By textNumberOrderIsProcessed = By.xpath("//*[@text='Номер вашего заказа:']");
    public By textDetailsOrderIsProcessed = By.xpath("//*[@text='Для уточнения деталей позвоните на 8 800 775 17 71. Вы можете отслеживать статус заказа в разделе Мои заказы']");
    public By textOrderSpecificationCreated = By.xpath("//*[@text='Спецификация создана']");
    public By textDetailsOrderIsProcessedIpro = By.xpath("//*[@text='В ближайшее время с вами свяжется наш менеджер для уточнения деталей. Также вы можете позвонить нам по номеру 8 800 775 17 71 Вы можете отслеживать статус заказа в разделе Документы.']");
    public By textMarketNumberAndDateOrder = By.xpath("//*[contains(@text, '999/')]");
    public By textIproNumberAndDateOrder = By.xpath("//*[contains(@text, '997/')]");
    //public By textIproNumberAndDateOrder = By.xpath("//*[contains(@text, 'test.')]");

    //button
    public By buttonGoToCatalog = By.xpath("//*[@resource-id='primary-button']");
    public By buttonGoToMyOrder = By.xpath("//*[@content-desc='Перейти в документы']");


}
