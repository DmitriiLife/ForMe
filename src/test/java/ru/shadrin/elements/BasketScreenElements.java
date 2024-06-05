package ru.shadrin.elements;

import org.openqa.selenium.By;

public class BasketScreenElements {

    //button
    public By buttonFirstProduct = By.xpath("//*[@resource-id='cart-list-item-0']");

    public By buttonTextName(String nameButton) {
        return By.xpath("//*[@text='" + nameButton + "']");
    }

    public By buttonDeleteAllItems = By.xpath("//*[@resource-id='cart-list-delete-selected']");
    public By buttonBack = By.xpath("//*[@resource-id='cart-header-left-element']");
    public By buttonShare = By.xpath("//*[@resource-id='cart-header-right-element']");
    public By buttonSelectAllItems = By.xpath("//*[@resource-id='cart-list-select-all']");
    public By buttonSelectOneCheckBoxItem = By.xpath("//*[@resource-id='cart-list-item-selected-checkbox']");
    public By buttonAvailableQuantity = By.xpath("//*[@resource-id='cart-list-item-available-amount']");
    public By buttonChangeDateDelivery = By.xpath("//*[@resource-id='cart-list-item-delivery-date']");
    public By buttonGoToAnalogues = By.xpath("//*[@resource-id='cart-list-item-analogues']");
    public By buttonDeleteOneItem = By.xpath("//*[@resource-id='cart-list-item-delete']");
    public By buttonGoToCheckout = By.xpath("//*[@resource-id='cart-total-go-to-checkout']");
    public By buttonSaveAsEstimate = By.xpath("//*[@resource-id='cart-total-save-as-smeta']");
    public By buttonSaveAsSpecification = By.xpath("//*[@resource-id='cart-total-create-specification']");
    public By buttonTermsOfDiscountsBalls = By.xpath("//*[@resource-id='cart-total-terms-of-discounts--and-balls']");
    public By buttonChangeCity = By.xpath("//*[@resource-id='cart-main-select-city']/android.widget.TextView");
    public By buttonChangeStock = By.xpath("//*[@resource-id='cart-main-store-sklad']");
    public By buttonAddPromoCode = By.xpath("//*[@resource-id='activate-promocode']");
    public By buttonApplyPromoCode = By.xpath("//*[@resource-id='primary-button']");
    public By buttonTermDiscount = By.xpath("//*[@resource-id='cart-total-terms-of-discounts']");
    public By buttonTermChargesAmpers = By.xpath("//*[@resource-id='cart-total-terms-of-ampers']");
    public By buttonDeletePromoCode = By.xpath("//*[@resource-id='delete-promocode']");
    public By buttonDelete = By.xpath("//*[@resource-id='cart-list-delete-all-goods']");
    public By buttonCancel = By.xpath("//*[@resource-id='cart-list-cancel-goods-deleting']");
    public By buttonCancelAlertDelete = By.xpath("//*[@resource-id='android:id/button2']");
    public By buttonOkAlertDelete = By.xpath("//*[@resource-id='android:id/button1']");
    public By buttonGoToCatalog = By.xpath("//*[@resource-id='primary-button']");
    public By buttonCopyShare = By.xpath("//*[@resource-id='android:id/chooser_copy_button']");
    public By buttonApply = By.xpath("//*[@text='Применить']");

    public By buttonDeleteSpecificItem(int number) {
        return By.xpath("//android.view.ViewGroup[@content-desc='cart-list-item-" + number + "']/android.view.ViewGroup[6]");
    }


    //text
    public By textInformer(String s) {
        return By.xpath("//*[@text='" + s + "']");
    }

    public By textForAllOrder = By.xpath("//*[@text='Для всего заказа']");
    public By textInformerDateDeliveryUpdate = By.xpath("//*[@content-desc='Дата доставки успешно обновлена']");
    public By textInformerSaveEstimates = By.xpath("//*[@resource-id='toastAnimatedContainer']");
    public By textPlaceholderPromoCode = By.xpath("//*[@text='Введите промокод']");
    public By textBannerNotFullAmountPromoCode = By.xpath("//*[@text='Для использования полной скидки по промокоду, увеличьте сумму корзины']");
    public By textAmountPromoCodeThousand = By.xpath("//*[@text='Промокод на скидку до 500']");
    public By textBannerCableInBasket = By.xpath("//*[@text='В вашем заказе имеется мерная продукция. Проверьте правильность выбора товара - наименование, метраж.']");
    public By textTermsOfDiscountsBalls = By.xpath("//*[@text=' Условия предоставления скидок и начисления баллов']");
    public By textInformerDeleteItem = By.xpath("//*[@text='Товар удален']");
    public By textInformerAddPromoCode = By.xpath("//*[@text='Промокод успешно добавлен']");
    public By textInformerDeletePromoCode = By.xpath("//*[@text='Промокод удален']");
    public By textCheckPromoCodeInBasketMarket = By.xpath("//*[@text='Промокод mar применен']");
    public By textCheckPromoCodeInBasketIpro = By.xpath("//*[@text='Промокод ipro применен']");
    public By textHeaderHelpOnDiscountConditions = By.xpath("//*[@text='Справка по условиям скидки:']");
    public By textHeaderConditionsForProvidingAmperes = By.xpath("//*[@text='Условия предоставления амперов:']");
    public By textSelectItemsToProceedToCheckout = By.xpath("//*[@text='Выберите товары, чтобы перейти к оформлению']");
    public By text1 = By.xpath("//*[@text='Вам доступно пять уровней скидок от розничной цены.']");
    public By text2 = By.xpath("//*[@text='Как заработать Амперы?']");
    public By textHeaderBasket = By.xpath("//*[@text='Корзина']");
    public By textNote = By.xpath("//*[@text='Не отгружать, тестовый заказ, удалить']");
    public By textDeleteAllItems = By.xpath("//*[@text='Удалить все выбранные товары?']");
    public By textImpossibleToRestoreTheBasket = By.xpath("//*[@text='Восстановить корзину будет невозможно.']");
    public By textBasketEmpty = By.xpath("//*[@text='Корзина пуста']");
    public By textGoToTheCatalogAndAddProducts = By.xpath("//*[@text='Перейдите в каталог и добавьте товары']");
    public By textAlertConfirmation = By.xpath("//*[@resource-id='android:id/alertTitle']");
    public By textAlertMessage = By.xpath("//*[@resource-id='android:id/message']");
    public By textToastInformer1 = By.xpath("//*[@resource-id='toastAnimatedContainer']");
    public By textToastInformerEstimate = By.xpath("//*[contains(@text, 'Создана смета')]");
    public By textToastInformerSpecification = By.xpath("//*[contains(@text, 'Создана спецификация')]");

    //input
    public By inputAddNote = By.xpath("//*[@resource-id='cart-total-add-note']");
    public By inputAddPromoCode = By.xpath("//*[@content-desc='enter-promocode']");
    public By inputChangeQuantityOfGoods = By.xpath("//android.view.ViewGroup[@resource-id='change-btn']/android.widget.TextView");

    public By inputCart(int number) {
        return By.xpath("//android.view.ViewGroup[@resource-id='cart-list-item-" + number + "']/android.view.ViewGroup[4]/android.view.ViewGroup/android.widget.TextView");
    }

    public By inputChangeUpdateOfGoods = By.xpath("//*[@resource-id='catalog-good-added-to-cart-update']");
    public By inputZero = By.xpath("//*[@text='0']");
    public By inputOne = By.xpath("//*[@text='1']");


    //String
    public String stringIdButtonDeleteAll = "cart-list-delete-selected";
    public String stringPromoCodeMarket = "mar";
    public String stringPromoCodeIpro = "ipro";
    public String stringTextNote = "Не отгружать, тестовый заказ, удалить";
    public String stringTermsOfDiscountsBalls = " Условия предоставления скидок и начисления баллов";
    public String stringCheckTermsOfDiscountsBalls = "Условия предоставления скидок \n" +
            "и начисления баллов";
    public String stringCheckTermsOfDiscounts = "Условия предоставления скидок";
    public String stringCheckTermsOfDiscountsAmpers = "Условия начисления амперов";


    //class
}
