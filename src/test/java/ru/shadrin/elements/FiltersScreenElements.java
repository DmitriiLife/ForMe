package ru.shadrin.elements;

import org.openqa.selenium.By;

public class FiltersScreenElements {
    //button
    public By buttonCatalogFilter = By.xpath("//*[@resource-id='catalog-header-filter']/android.widget.TextView");
    public By buttonClearFilters = By.xpath("//*[@resource-id='filter-catalog-clear']");
    public By buttonHeaderBackFilter = By.xpath("//*[@resource-id='cart-header-left-element']");
    public By buttonProductTypeFilters = By.xpath("//*[@content-desc='Тип изделия']");
    public By buttonMadeInRussFilters = By.xpath("//*[@resource-id='filter-catalog-item-from_rus']");
    public By buttonReady = By.xpath("//*[@resource-id='primary-button']");
    public By buttonApply = By.xpath("//*[@resource-id='primary-button']");
    public By buttonProductTypeStubFilter = By.xpath("//*[@content-desc='Заглушка']");
    public By buttonDeleteFilterProductType = By.xpath("//android.view.ViewGroup[@content-desc='Тип изделия,  (1),   Заглушка']/android.view.ViewGroup");

    //text
    public By textSelectedFilters = By.xpath("//*[contains(@text, 'Выбрано:')]");
    public By textHeaderFilter = By.xpath("//*[contains(@text, 'Фильтр')]");
    public By textHeaderProductTypeFilters = By.xpath("//*[contains(@text, 'Тип изделия')]");
    public By textProductTypeFilterSelected = By.xpath("//*[@content-desc='Тип изделия,  (1),   Заглушка']");

    //string

    //input

}
