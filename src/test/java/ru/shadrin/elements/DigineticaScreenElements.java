package ru.shadrin.elements;

import org.openqa.selenium.By;

public class DigineticaScreenElements {

    //button
    public By buttonDigineticaSearchCancel = By.xpath("//*[@resource-id='diginetica-search-cancel']");

    public By buttonDigineticaHistory(int number) {
        return By.xpath("//*[@resource-id='diginetica-history-" + number + "']/android.widget.TextView");
    }

    public By buttonDigineticaHistoryDelete(int number) {
        return By.xpath("//*[@resource-id='diginetica-history-delete-" + number + "']");
    }

    public By buttonDigineticaCategory(int number) {
        return By.xpath("//*[@resource-id='diginetica-category-" + number + "']/android.widget.TextView");
    }

    public By buttonDigineticaProduct(int number) {
        return By.xpath("//*[@resource-id='diginetica-product-" + number + "']");
    }

}
