package ru.shadrin.elements;

import org.openqa.selenium.By;

public class MyEstimatesScreenElement {
    //text
    public By textNameEstimate = By.xpath("//*[@text='Наименование']");
    public By textReNameEstimate = By.xpath("//*[@text='Переименовать смету']");
    public By textToastInformerSendEstimate = By.xpath("//*[contains(@text, 'Смета отправлена')]");
    public By textToastInformerAddEstimateToOrder = By.xpath("//*[contains(@text, 'Создан заказ')]");
    public By textEmail = By.xpath("//*[@text='Email']");
    public By textSendEstimates = By.xpath("//*[@text='Отправить смету']");
    public By textAttentionEstimates = By.xpath("//*[@text='Внимание!']");
    public By textAttentionInformationEstimates = By.xpath("//*[@text='Товары из сметы будут добавлены в корзину. Товары, находящиеся в данный момент в корзине не будут удалены.']");
    public By textMyEstimates = By.xpath("//*[@text='Мои сметы']");
    public By textHeaderOneEstimate = By.xpath("//*[@text='Смета']");
    public By textEstimateWithoutNumber = By.xpath("//*[contains(@text, 'Смета №')]");
    public By textFoundEstimates = By.xpath("//*[contains(@text, 'Найдено')]");
    public By textDonNotFoundEstimates = By.xpath("//*[@text='Сметы не найдены']");
    public By textChangeSearchOptions = By.xpath("//*[@text='Измените параметры поиска']");
    public By textAlertConfirmation = By.xpath("//*[@text='Подтверждение']");
    public By textAlertYouAreSureDeleteEstimate = By.xpath("//*[@text='Вы точно хотите удалить смету?']");

    //button
    public By buttonNameFirstEstimate = By.xpath("//*[@resource-id='estimated-list-item-press-0']/android.view.ViewGroup/android.widget.TextView[1]");
    public By buttonHeaderBack = By.xpath("//*[@content-desc='smetas-header-back']");
    public By buttonAlertCancel = By.xpath("//*[@resource-id='android:id/button2']");
    public By buttonAlertOK = By.xpath("//*[@resource-id='android:id/button1']");
    public By buttonApply = By.xpath("//*[@resource-id='primary-button']");
    public By buttonSend = By.xpath("//*[@resource-id='primary-button']");
    public By buttonConfirmTheOperation = By.xpath("//*[@resource-id='primary-button']");
    public By buttonAddBasketEstimate = By.xpath("//*[@content-desc='В корзину']");
    public By buttonSendEstimate = By.xpath("//*[@content-desc='Отправить смету']");
    public By buttonReNameEstimate = By.xpath("//*[@content-desc='Переименовать']");
    public By buttonDeleteEstimate = By.xpath("//*[@content-desc='Удалить']");
    public By buttonCancel = By.xpath("//*[@content-desc='Отменить']");
    public By buttonAddToOrder = By.xpath("//*[@content-desc='В заказ']");
    public By buttonModalCancel = By.xpath("//*[@resource-id='modal-confirm-cancel']");
    public By buttonCancelSendEstimate = By.xpath("//*[@resource-id='estimates-send-smeta-cancel']");
    public By buttonCancelReNameEstimate = By.xpath("//*[@resource-id='estimates-rename-cancel']");
    public By buttonFilterDateFromValue = By.xpath("//*[@resource-id='filter-header-from-value']");
    public By buttonFilterDateUntilValue = By.xpath("//*[@resource-id='filter-header-until-value']");
    public By buttonFilterDateFromEmpty = By.xpath("//*[@resource-id='filter-header-from-empty']");
    public By buttonFilterDateUntilEmpty = By.xpath("//*[@resource-id='filter-header-until-empty']");
    public By buttonReady = By.xpath("//*[@resource-id='primary-button']");
    public By buttonCalendarRight = By.xpath("//*[@resource-id='filter-calendar.header.rightArrow']");
    public By buttonCalendarLeft = By.xpath("//*[@resource-id='filter-calendar.header.leftArrow']");
    public By buttonFilterClear = By.xpath("//*[@resource-id='filter-total-clear']");
    public By buttonFilterClearAll = By.xpath("//*[@text=' очистить']");
    public By buttonFilterDateFromClear = By.xpath("//*[@resource-id='filter-header-from-value-clear']");
    public By buttonFilterDateUntilClear = By.xpath("//*[@resource-id='filter-header-until-value-clear']");
    public By buttonPressEstimate(int number) {
        return By.xpath("//*[@resource-id='estimated-list-item-press-" + number + "']");
    }
    public By buttonFilterDate(int date) {
        return By.xpath("//*[@text='" + date + "']");
    }
    public By buttonBurgerMenuEstimate = By.xpath("//*[@resource-id='estimated-list-item-more']");
    public By buttonSearchClear = By.xpath("//*[@resource-id='search-clear-test']");
    public By buttonFilterStatus = By.xpath("//*[@resource-id='filter-header-status-selector']");
    public By buttonFilterAll = By.xpath("//*[@text=' -- Все -- ']");
    public By buttonFilterProcessed = By.xpath("//*[@text='Обработанные']");
    public By buttonFilterUnProcessed = By.xpath("//*[@text='Необработанные']");
    public By buttonMoveInBasket = By.xpath("//*[@resource-id='secondary-button']");


    //input
    public By inputSearch = By.xpath("//*[@resource-id='search-bar-input']");
    public By inputEstimateSend = By.xpath("//*[@resource-id='estimates-send-smeta-input']/android.widget.EditText");
    public By inputEstimateReName = By.xpath("//*[@resource-id='estimates-rename-input']/android.widget.EditText");

    //string
    public String stringEmail = "shadrin_dv@etm.ru";
    public String stringNewNameEstimate = "11111";

}
