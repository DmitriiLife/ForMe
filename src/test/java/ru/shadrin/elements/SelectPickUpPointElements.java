package ru.shadrin.elements;

import org.openqa.selenium.By;

public class SelectPickUpPointElements {

    //input
    public By inputA = By.xpath("//*[@content-desc='?']");

    //button
    public By buttonFindOnMap = By.xpath("//*[@resource-id='find-on-map']");
    public By buttonChooseFirstAddress = By.xpath("//*[@resource-id='search-by-address-radio-btn-0']");
    public By buttonChoose = By.xpath("//*[@resource-id='primary-button']");
    public By buttonE = By.xpath("//*[@resource-id='']");


    //string
    public String stringI = "?";

    //text
    public By textSelectPickUpPoint = By.xpath("//*[@text='Выберите пункт выдачи']");
    public By textSearchOnAddress = By.xpath("//*[@text='Поиск по адресу']");
    public By textCdeck = By.xpath("//*[@resource-id='search-by-address-radio-btn-0']");

}
