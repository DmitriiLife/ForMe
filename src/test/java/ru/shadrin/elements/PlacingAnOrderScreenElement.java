package ru.shadrin.elements;

import org.openqa.selenium.By;
import ru.shadrin.methods.Methods;

public class PlacingAnOrderScreenElement {
    private final Methods methods = new Methods();

    //input
    public By inputA = By.xpath("//*[@content-desc='?']");
    public By inputInn = By.xpath("//*[@resource-id='placing-order-requisites-inn']");
    public By inputKpp = By.xpath("//*[@resource-id='placing-order-requisites-kpp']");
    public By inputName = By.xpath("//*[@resource-id='placing-order-requisites-name']");
    public By inputEmail = By.xpath("//*[@resource-id='placing-order-requisites-email']");


    //button

    public By buttonCheckBoxZ2 = By.xpath("//*[@resource-id='placing-order-mnager-order-noty']");

    //public By buttonCheckBoxZ2 = By.xpath("//android.view.ViewGroup[@content-desc='Я согласен с Условиями поставки и возврата заказного товара']/android.widget.ImageView");
    public By buttonPressBack = By.xpath("//*[@resource-id='cart-header-left-element']");
    public By buttonPickUp = By.xpath("//*[@resource-id='radio-area-pickup']");
    public By buttonDelivery = By.xpath("//*[@resource-id='radio-area-delivery']");
    public By buttonCheckoutOrder = By.xpath("//*[@resource-id='secondary-button']");
    public By buttonPayIssueAnInvoice = By.xpath("//*[@resource-id='radio-area-0']");
    public By buttonPayCardOnline = By.xpath("//*[@resource-id='radio-area-1']");
    public By buttonPayByAgreement = By.xpath("//*[@resource-id='radio-area-2']");
    public By buttonPayCardOnlineCdeck = By.xpath("//*[@resource-id='radio-area-0']");
    public By buttonPayUponReceipt = By.xpath("//*[@resource-id='radio-area-2']");
    public By buttonPayUponReceiptAffiliateProduct = By.xpath("//*[@resource-id='radio-area-0']");
    public By buttonPayUponReceiptCdeck = By.xpath("//*[@resource-id='radio-area-1']");
    public By buttonPayBall = By.xpath("//*[@resource-id='radio-area-3']");
    public By buttonCheckBoxEtm = By.xpath("//*[@resource-id='breadcrumbs-checker-item']");
    public By buttonDeliveryCalendar = By.xpath("//*[@resource-id='delivery-calendar-action']");
    public By buttonCalendarRight = By.xpath("//*[@resource-id='delivery-calendar-right-arrow']");
    public By buttonCalendarLeft = By.xpath("//*[@resource-id='delivery-calendar-left-arrow']");
    public By buttonCalendarReady = By.xpath("//*[@resource-id='primary-button']");
    public By buttonCalendarCancel = By.xpath("//*[@resource-id='delivery-calendar-cancel']");
    public By buttonDateOne = By.xpath("//android.view.ViewGroup[@content-desc='1']");
    public By buttonTestDateDelivery = By.xpath("//android.view.ViewGroup[@content-desc='" + methods.betweenFourteen() + "']");

    public By buttonNewDateDelivery(int number) {
        return By.xpath("//android.view.ViewGroup[@content-desc='" + number + "']");
    }

    public By buttonDeliveryTimeFrom = By.xpath("//*[@resource-id='delivery-time-from-action']");
    public By buttonDeliveryTimeUntil = By.xpath("//*[@resource-id='delivery-time-until-action']");


    //string
    public String stringCheckoutOrder = "secondary-button";
    public String stringSummPay = "Сумма для оплаты";
    public String stringInn = "782064583792";
    public String stringName = "Testing";
    public String stringEmail = "shadrin_dv@etm.ru";
    public String stringFirstnameCdeck = "Тестирование";
    public String stringSurnameCdeck = "Тестирование";
    public String stringLastnameCdeck = "Тестирование";
    public String stringPhoneCdeck = "9111340000";
    public String stringCheckBoxZ2 = "Я согласен с Условиями поставки и возврата заказного товара\n";


    //text
    public By textWillWriteOffBall = By.xpath("//*[contains(@text, 'Со счета будет списано')]");
    public By textApplyWriteOffBall = By.xpath("//*[@text='Подтвердите списание баллов']");
    public By textMonthCalendar = By.xpath("//*[@text='Октябрь 2023']");
    public By textNoTimeAvailable = By.xpath("//*[contains(@text, 'Нет доступного времени')]");
    public By textPlacingAnOrder = By.xpath("//*[@text='Оформление заказа']");
    public By textMethodOfObtaining = By.xpath("//*[@text='Способ получения']");
    public By textDateAndTimeDelivery = By.xpath("//*[@text='Дата и время доставки']");
    public By textMethodOfPay = By.xpath("//*[@text='Способ оплаты']");
    public By textRequisites = By.xpath("//*[@text='Реквизиты']");
    public By textRecipient = By.xpath("//*[@text='Получатель']");
    public By textInfoZ2 = By.xpath("//*[@text='По заказным позициям с вами свяжется наш менеджер, чтобы уточнить сроки поставки, актуальную цену и кратность товара. Оформленный заказ на заказные позиции появится в разделе «Заказы».\n" +
            "\n" +
            "Чтобы продолжить оформление заказа, пожалуйста, подтвердите своё согласие с Условиями поставки и возврата заказного товара.']");


    //changed
    public By inputFirstnameCdeck = By.xpath("//*[@resource-id='placing-order-cdek-first-name']");
    public By inputSurnameCdeck = By.xpath("//*[@resource-id='placing-order-cdek-last-name']");
    public By inputLastnameCdeck = By.xpath("//*[@resource-id='placing-order-cdek-surname']");
    public By inputPhoneCdeck = By.xpath("//*[@resource-id='placing-order-cdek-phone']");
}
