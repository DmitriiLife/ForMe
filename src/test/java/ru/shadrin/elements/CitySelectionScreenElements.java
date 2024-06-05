package ru.shadrin.elements;

import org.openqa.selenium.By;

public class CitySelectionScreenElements {
    //input
    public By inputSearchCity = By.xpath("//*[@resource-id='search-bar-input']");
    //String text
    public String textBanner = "Важно! При смене города могут измениться сроки доставки, наличие и стоимость товара";

    //button
    public By buttonRadioBtn = By.xpath("//*[@resource-id='radio-btn']");

    //text
    public By textCitySelection = By.xpath("//*[@text='Выбор города']");
    public By textStockSelection = By.xpath("//*[@text='Выбор склада']");
    public By textNameCityAlmetevsk = By.xpath("//*[@text='Альметьевск']");
    public By textBannerCity = By.xpath("//*[@text='" + textBanner + "']");
    public By textBannerStock = By.xpath("//*[@text='Важно! При смене склада могут измениться сроки доставки и наличие товара']");


}
