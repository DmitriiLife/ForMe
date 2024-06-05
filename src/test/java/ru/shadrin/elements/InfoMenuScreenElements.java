package ru.shadrin.elements;

import org.openqa.selenium.By;

public class InfoMenuScreenElements {

    //text
    public By textHeaderInfoMenu = By.xpath("//*[@text='Информация']");

    //button
    public By buttonHeaderBack = By.xpath("//*[@resource-id='header-left-element-button']");
    public By buttonEmailClear = By.xpath("//*[@resource-id='info-report-email-clear-icon']");
    public By buttonMessageClear = By.xpath("//*[@resource-id='info-report-commentary-clear-icon']");
    public By buttonSendReportABag = By.xpath("//*[@resource-id='info-report-send-button']");
    public By buttonReportAttachment = By.xpath("//*[@resource-id='info-report-attachment']");
    public By buttonEnterInfo = By.xpath("//*[@resource-id='info-enter-button']");

    public By buttonAddressShop(String list) {
        return By.xpath("//*[@resource-id='info-list-" + list + "']");
    }

    public By buttonAboutCompany(String list) {
        return By.xpath("//*[@resource-id='info-list-" + list + "']");
    }

    public By buttonAboutApp(String list) {
        return By.xpath("//*[@resource-id='info-list-" + list + "']");
    }

    public By buttonReportABug(String list) {
        return By.xpath("//*[@resource-id='info-list-" + list + "']");
    }

    public By buttonConnectWithUs(String list) {
        return By.xpath("//*[@resource-id='info-list-" + list + "']");
    }

    public By buttonVarioqub(String list) {
        return By.xpath("//*[@resource-id='info-list-" + list + "']");
    }

    public By buttonAttachment1 = By.xpath("//android.widget.FrameLayout[@content-desc='Время съемки: 25 апр. 2024 г., 11:10:55 AM. Длительность: 00:20.']/androidx.cardview.widget.CardView/android.widget.FrameLayout/android.widget.ImageView");
    public By buttonAttachment2 = By.xpath("//android.widget.FrameLayout[@content-desc='Фото, дата и время съемки: 25 апр. 2024 г., 11:10:55 AM'][1]/androidx.cardview.widget.CardView/android.widget.FrameLayout/android.widget.ImageView");
    public By buttonAttachment3 = By.xpath("//android.widget.FrameLayout[@content-desc='Фото, дата и время съемки: 25 апр. 2024 г., 11:10:55 AM'][2]/androidx.cardview.widget.CardView/android.widget.FrameLayout");
    public By buttonAttachment4 = By.xpath("//android.widget.FrameLayout[@content-desc='Время съемки: 6 мар. 2024 г., 10:47:08 AM. Длительность: 00:08.']/androidx.cardview.widget.CardView/android.widget.FrameLayout/android.widget.ImageView");
    public By buttonAttachment5 = By.xpath("//android.widget.FrameLayout[@content-desc='Время съемки: 11 янв. 2024 г., 9:15:04 PM. Длительность: 00:08.']/androidx.cardview.widget.CardView/android.widget.FrameLayout/android.widget.ImageView");
    public By buttonAddAttachmentGallery = By.xpath("//*[@resource-id='com.google.android.providers.media.module:id/button_add']");

    public By buttonDeleteAttachment(String index) {
        return By.xpath("(//android.widget.Button[@content-desc=\"\uDB80\uDD56\"])[" + index + "]");
    }

    //string
    public String stringEmail = "shadrin_dv@etm.ru";

    //input
    public By inputEmailReportABag = By.xpath("//android.widget.EditText[@resource-id='info-report-email-input']");
    public By inputMessageReportABag = By.xpath("//android.widget.EditText[@resource-id='info-report-commentary-input']");
}
