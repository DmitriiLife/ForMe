package ru.shadrin.elements;

import org.openqa.selenium.By;
import ru.shadrin.methods.Methods;

public class OrderScreenElements {
    private final Methods methods = new Methods();

    //button
    public By buttonDateCalendarReceiveTheKit(String month, String date) {
        return By.xpath("//*[@resource-id='undefined.day_2024-" + month + "-" + date + "']");
    }

    public By buttonShowProducts(int number) {
        return By.xpath("//android.view.ViewGroup[@resource-id='cart-checkout-show-goods-with-different-delivery-date-" + number + "']");
    }

    public By buttonBackSplitOrder = By.xpath("//*[@resource-id='order-split-header-left-element-button']");
    public By buttonHeaderBack = By.xpath("//*[@resource-id='header-left-element-button']");
    public By buttonOldHeaderBack = By.xpath("//*[@content-desc='extended-header-left']");
    public By buttonEtmList = By.xpath("//*[@content-desc='Списком']");
    public By buttonOpenFirstOrder = By.xpath("//*[@resource-id='documents-item-0']/android.widget.TextView[1]");
    public By buttonOpenSecondOrder = By.xpath("//*[@resource-id='documents-item-1']/android.widget.TextView[1]");
    public By buttonSelectAction = By.xpath("//*[@resource-id='primary-button']");
    public By buttonSave = By.xpath("//*[@resource-id='primary-button']");
    public By buttonGetTheKit = By.xpath("//*[@content-desc='Получить комплект']");
    public By buttonDelivery = By.xpath("//*[@content-desc='Доставка']");
    public By buttonPickUp = By.xpath("//*[@content-desc='Самовывоз']");
    public By buttonOpenFirstPickUpEtm = By.xpath("//*[@resource-id='documents-item-0']");
    public By buttonReady = By.xpath("//*[@resource-id='primary-button']");
    public By buttonConfirmTheOperation = By.xpath("//*[@content-desc='Подтвердить операцию']");
    public By buttonSelectPointDelivery = By.xpath("//*[@resource-id='documents-get-kit-select-delivery-point']");
    public By buttonAddNewAddress = By.xpath("//*[@resource-id='documents-get-kit-add-new-address']");
    public By buttonSelectFirstAddressDelivery = By.xpath("//*[@resource-id='documents-new-delivery-0']");
    public By buttonSelectDate = By.xpath("//*[@resource-id='documents-shipping-date']");
    public By buttonSelectTimeFrom = By.xpath("//*[@resource-id='documents-shipping-time-from']");
    public By buttonSelectTimeUntil = By.xpath("//*[@resource-id='documents-shipping-time-until']");
    public By buttonRightCalendar = By.xpath("//*[@resource-id='undefined.header.rightArrow']");

    public By buttonFilterStatusDocument(int number) {
        return By.xpath("//*[@resource-id='filter-status-modal-item-" + number + "']");
    }

    //text
    public By textOrderSplitList = By.xpath("//*[@resource-id='order-split-list-item-0']");
    public By textToastChangedOrder = By.xpath("//*[contains(@text, 'В документ № ')]");
    public By textDateInCalendar = By.xpath("//*[contains(@text, '" + methods.betweenFourteen() + "')]");
    public By textInformerApplication = By.xpath("//*[contains(@text, 'Ваша заявка принята в обработку.')]");
    public By textOperation = By.xpath("//*[@text='Операция осуществима для товаров:']");
    public By textHeaderOrder = By.xpath("//android.widget.TextView[@text='Документы']");
    public By textMarketHeaderOrder = By.xpath("//*[@text='Мои заказы']");
    public By textHeaderDelivery = By.xpath("//*[@text='Доставка']");
    public By textDetails = By.xpath("//*[@text='Детали']");
    public By textStatusSpecification = By.xpath("//*[@text='Спецификация']");
    public By textChangedStatusSpecification = By.xpath("//*[@text='Временный резерв на складе пос. Шушары, Ленсоветовская дорога, Центральный склад ЛЦ']");
    public By textNewDelivery = By.xpath("//*[@text='Новая доставка']");
    public By textCreateNewPoint = By.xpath("//*[@text='Создать новую точку']");
    public By textAddAddress = By.xpath("//*[@text='Россия, Санкт-Петербург']");
    public By textShelfLifeOfKits = By.xpath("//*[@text='Срок хранения комплектов: ']");
    public By textFourteenDays = By.xpath("//*[@text='14 дней']");
    public By textStatusOrder = By.xpath("//*[@resource-id='documents-item-0']/android.widget.TextView[4]");

    //input
    public By inputEmail = By.xpath("//android.widget.EditText[@resource-id='email-and-1c-send-component']");
    public By inputAddNewPointAddress = By.xpath("//android.widget.EditText[@resource-id='documents-create-new-point-address']");
    public By inputAddNewPointName = By.xpath("//android.widget.EditText[@resource-id='documents-create-new-point-name']");
    public By inputContactPerson = By.xpath("//android.widget.EditText[@resource-id='documents-create-new-point-contact-person']");
    public By inputPhone = By.xpath("//android.widget.EditText[@resource-id='documents-create-new-point-phone']");
    public By inputWorkTime = By.xpath("//android.widget.EditText[@resource-id='documents-create-new-point-work-time']");
    public By inputDinnerTime = By.xpath("//android.widget.EditText[@resource-id='documents-dinner-time']");
    public By inputNewPointDinnerTime = By.xpath("//android.widget.EditText[@resource-id='documents-create-new-point-dinner-time']");
    public By inputComment = By.xpath("//android.widget.EditText[@resource-id='documents-comment']");
    public By inputNewPointComment = By.xpath("//android.widget.EditText[@resource-id='documents-create-new-point-comment']");
    public By inputAddAddress = By.xpath("//*[@text='Введите адрес']");
    public By inputSearchBar = By.xpath("//android.widget.EditText[@resource-id='search-bar-input']");

    //string
    public String stringCommentForDelivery = "Комментарий к доставке";
    public String stringAddAddressCity = "СПБ";
    public String stringCity = "";

    //radio-button
    public By radioButtonCancel(String cause) {
        return By.xpath("//*[@resource-id='radio-cancel-reason-" + cause + "']");
    }
}
