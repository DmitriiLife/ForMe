package ru.shadrin.elements;

import org.openqa.selenium.By;

public class EnterDeliveryAddressScreenElements {

    //text
    public By textChangedDeliveryAddress = By.xpath("//*[@text='Измените адрес доставки']");
    public By textEnterDeliveryAddress = By.xpath("//*[@text='Укажите адрес доставки']");
    public By textSavedAddress = By.xpath("//*[@text='Сохраненные адреса']");
    public By textSelectAddress = By.xpath("//*[@text='Выберите адрес доставки']");
    public By textAddNewAddressSPB = By.xpath("//*[@text='Россия, Санкт-Петербург, 1 линия, метро Ленинский проспект']");

    //input
    public By inputAddAddress = By.xpath("//*[@resource-id='delivery-form-address']");
    public By inputSelectAddress = By.xpath("//*[@text='Введите адрес']");
    public By inputAddName = By.xpath("//*[@resource-id='delivery-form-name']");
    public By inputAddContactPerson = By.xpath("//*[@resource-id='delivery-form-contact-person']");
    public By inputAddPhone = By.xpath("//*[@resource-id='delivery-form-phone']");
    public By inputAddWorkTime = By.xpath("//*[@resource-id='delivery-form-work-time']");
    public By inputAddDinnerTime = By.xpath("//*[@resource-id='delivery-form-dinner-time']");
    public By inputAddComment = By.xpath("//android.widget.EditText[@resource-id='delivery-form-comment']");

    //button
    public By buttonAddNewAddressDelivery = By.xpath("//*[@resource-id='primary-button']");
    public By buttonBackHeader = By.xpath("//*[@resource-id='cart-header-left-element']");
    public By buttonSave = By.xpath("//*[@resource-id='primary-button']");
    public By buttonChangedAddressDelivery = By.xpath("//*[@resource-id='saved-address-options']");
    public By buttonChanged = By.xpath("//*[@text='Изменить']");


    //String
    public String stringNewAddress = "Санкт-Петербург, ленинский проспект";
    public String stringIdAddComment = "delivery-form-comment";
}
