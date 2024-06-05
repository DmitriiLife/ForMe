package ru.shadrin.elements;

import org.openqa.selenium.By;

public class CartProductScreenElements {

    //button
    public By buttonGoToBasket = By.xpath("//*[@resource-id='good-open-cart-button']");
    public By buttonAddToBasket = By.xpath("//*[@resource-id='good-add-to-cart-button']");
    public By buttonCloseCarouselImage = By.xpath("//*[@resource-id='carousel-fullscreen-close-button']");
    public By buttonCarouselImage = By.xpath("//*[@resource-id='carousel-image-0']");
    public By buttonShareButton = By.xpath("//*[@resource-id='header-share-button']");
    public By buttonShareCopy = By.xpath("//*[@resource-id='com.android.intentresolver:id/copy']");
    public By buttonAddToFavorite = By.xpath("//*[@resource-id='header-favourite-button']");
    public By buttonHeaderBack = By.xpath("//*[@resource-id='header-left-element-button']");
    public By buttonCategory = By.xpath("//*[contains(@text, 'Категория:')]");
    public By buttonCopyCode = By.xpath("//*[@resource-id='good-copy-code-button']");
    public By buttonCopyVendorCode = By.xpath("//*[@resource-id='good-copy-vendor-code-button']");
    public By buttonOpenCategory = By.xpath("//android.view.ViewGroup[@resource-id='good-open-category-button']/android.widget.TextView");
    public By buttonTooltipPrice = By.xpath("//*[@resource-id='good-price-tooltip-button']");
    public By buttonOpenPopUpPointEtm = By.xpath("//*[@resource-id='catalog-item-etm-points']");
    public By buttonOpenRemains = By.xpath("//*[@resource-id='good-open-remains-button']");
    public By buttonOpenCharacteristics = By.xpath("//*[@resource-id='good-characteristics-open-button']");
    public By buttonOpenDescription = By.xpath("//*[@resource-id='good-description-open-button']");
    public By buttonOpenMaterial = By.xpath("//*[@resource-id='good-material-open-button']");
    public By buttonOpenRelatedCategories = By.xpath("//*[@resource-id='good-related-categories-open-button']/android.widget.TextView");

    public By buttonOpenMenuSimilar(int number) {
        return By.xpath("//*[@resource-id='good-one-type-menu-" + number + "']/android.widget.TextView[2]");
    }

    public By buttonOpenTypeSimilar(int number) {
        return By.xpath("//*[@resource-id='good-one-type-property-" + number + "']/android.widget.TextView");
    }

    public By buttonOpenRelatedCardGood(int number) {
        return By.xpath("//*[@resource-id='related-good-open-card-button-" + number + "']/android.widget.TextView");
    }

    public By buttonOpenRelatedRemainsGood(int number) {
        return By.xpath("//*[@resource-id='related-good-open-remains-button-" + number + "']");
    }

    public By buttonAddToBasketRelatedGood(int number) {
        return By.xpath("//*[@resource-id='good-add-to-cart-button-" + number + "']");
    }

    public By buttonChangeRelatedCategories(int number) {
        return By.xpath("//*[@resource-id='related-category-row-radio-" + number + "']/android.widget.TextView");
    }

    public By buttonDecreaseRelatedCategories(int number) {
        return By.xpath("//*[@resource-id='good-decrease-cart-button-" + number + "']");
    }

    public By buttonIncreaseRelatedCategories(int number) {
        return By.xpath("//*[@resource-id='good-increase-cart-button-" + number + "']");
    }

    public By buttonApplyCartProduct = By.xpath("//*[@resource-id='catalog-goods-added-to-cart-update-accept']");


    //string

    //input
    public By inputChangeCountProduct = By.xpath("//android.view.ViewGroup[@resource-id='good-change-cart-count-button']/android.widget.TextView[1]");
    public By inputUpdateCountProduct = By.xpath("//android.widget.EditText[@resource-id='catalog-good-added-to-cart-update']");


}
