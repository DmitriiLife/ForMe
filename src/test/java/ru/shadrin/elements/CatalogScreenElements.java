package ru.shadrin.elements;

import org.openqa.selenium.By;

public class CatalogScreenElements {

    //button
    public By buttonCatalogListFirst = By.xpath("//*[@resource-id='catalog-list-0']");
    public By buttonFirstProductList = By.xpath("//*[@resource-id='catalog-goods-item-0']");
    public By buttonCables = By.xpath("//*[@text='Кабели']");
    public By buttonGoToCartCardProduct = By.xpath("//*[@content-desc='Перейти в корзину']");
    public By buttonCablesWithCopperConductor = By.xpath("//*[@text='Кабели с медной токопроводящей жилой']");
    public By buttonAddToCart = By.xpath("//*[@resource-id='catalog-goods-add-to-cart']");
    public By buttonChangeCategoryCatalog = By.xpath("//*[@resource-id='catalog-change-or-select-category']");
    public By buttonChangeCategoryCatalogName = By.xpath("//android.view.ViewGroup[@resource-id='catalog-change-or-select-category']/android.widget.TextView[1]");
    public By buttonSearchClear = By.xpath("//*[@resource-id='search-clear-test']");
    public By buttonShowProducts = By.xpath("//*[@resource-id='primary-button']");
    public By buttonSortType = By.xpath("//*[@resource-id='catalog-header-sort-type']/android.widget.TextView");
    public By buttonShowAvailabilityInfo = By.xpath("//android.view.ViewGroup[@resource-id='catalog-good-item-availability-info'][1]");
    public By buttonHeaderLeft = By.xpath("//*[@resource-id='header-left-element-button']");

    public By buttonFirstProductAll(int number) {
        return By.xpath("//android.view.ViewGroup[@content-desc='catalog-goods-item-0']/android.view.ViewGroup[" + number + "]");
    }

    //input
    public By inputSearch = By.xpath("//*[@resource-id='search-bar-input']");

    public By inputAddedCount(int number) {
        return By.xpath("//android.view.ViewGroup[@resource-id='catalog-goods-to-cart-added-count']/android.widget.TextView[" + number + "]");
    }

    //String
    public String stringZ2Product = "9575814";
    public String stringAffiliateProduct = "4614800";
    public String stringMachineProduct = "9532795";
    public String stringStubForFilters = "5945277";
            //"6894739";
    public String stringIdAddToCart = "catalog-goods-add-to-cart";

    //Text
    public By textFirstProductAll(int number) {
        return By.xpath("//android.view.ViewGroup[@content-desc='catalog-goods-item-0']/android.widget.TextView[" + number + "]");
    }

    public By textZ2Product = By.xpath("//*[@text='Шпилька А2М64-6gх370.120.88.25Х2М1Ф.019 ГОСТ9066-75 для фланцевых соединений']");
    public By textAffiliateProduct = By.xpath("//*[@text='К2']");
    public By textMachineProduct = By.xpath("//*[@text='Выключатель автоматический однополюсный 16А C ВА47-29 4.5кА']");
    public By textPackProductM4 = By.xpath("//*[@text='Шайба DIN127b пружинная оцинк. М4']");
    public By textCableProduct = By.xpath("//*[@content-desc='Кабель силовой ВВГнг(А)-LS 3x2,5 ок(N, PE)-0.66   бухта 100м ТРТС, Кабэкс, 76.62, ₽, 85.5']");
    public By textPackProduct = By.xpath("//*[@text='Шайба DIN 125 М6 плоская покрытие цинк']");
    public By textInstallationBox = By.xpath("//*[@text='Коробка установочная 68х45мм для сплошных стен']");
    public By textLEDLamp = By.xpath("//*[@text='Светильник светодиодный ДБП-12w 4000К 900Лм IP65 круглый белый']");

    //image
    public By imageFirstProductAll(int number) {
        return By.xpath(" //android.view.ViewGroup[@content-desc=\"catalog-goods-item-0\"]/android.widget.ImageView[" + number + "]");
    }

}
