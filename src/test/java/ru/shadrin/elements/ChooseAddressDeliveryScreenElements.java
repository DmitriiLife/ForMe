package ru.shadrin.elements;

import org.openqa.selenium.By;

public class ChooseAddressDeliveryScreenElements {

    //string
    public String stringQ = "?";

    //button
    public By q = By.xpath("//android.view.ViewGroup[@content-desc='Я согласен с Условиями поставки и возврата заказного товара']/android.widget.ImageView");
    public By buttonChooseAddress = By.xpath("//*[@resource-id='select-saved-address']");
    public By buttonHeaderBack = By.xpath("//*[@resource-id='header-left-element-button']");


    //text
    public By textChooseAddressDelivery = By.xpath("//*[@text='Укажите адрес доставки']");
    public By textSavedAddressDelivery = By.xpath("//*[@text='Сохраненные адреса']");


}
