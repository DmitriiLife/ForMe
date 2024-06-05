package ru.shadrin.steps;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import ru.shadrin.elements.CatalogScreenElements;
import ru.shadrin.elements.CitySelectionScreenElements;
import ru.shadrin.elements.SplashScreenElements;
import ru.shadrin.methods.Methods;

public class SplashScreenSteps {
    private final CitySelectionScreenElements citySelectionScreenElements = new CitySelectionScreenElements();
    private final CatalogScreenElements catalogScreenElements = new CatalogScreenElements();
    private final SplashScreenElements splashScreenElements = new SplashScreenElements();
    private final Methods methods = new Methods();

    @Owner("Шадрин Дмитрий")
    @Description("Первый пуск, проверка текста и тап далее до каталога")
    @DisplayName("Первый пуск, проверка текста и тап далее до каталога")
    public void firstRunApp() throws InterruptedException {
        methods.checkIsDisplayed(splashScreenElements.textEarnPoints, true);
        methods.checkIsDisplayed(splashScreenElements.textLearnPoints, true);
        methods.waitForElementAndClick(splashScreenElements.buttonNextOnboard);
        methods.checkIsDisplayed(splashScreenElements.textBuySmart, true);
        methods.checkIsDisplayed(splashScreenElements.textFindProducts, true);
        methods.waitForElementAndClick(splashScreenElements.buttonNextOnboard);
        methods.checkIsDisplayed(splashScreenElements.textSaveTime, true);
        methods.checkIsDisplayed(splashScreenElements.textControlOrders, true);
        methods.waitForElementAndClick(splashScreenElements.buttonNextOnboard);
        methods.waitForElementAndClick(citySelectionScreenElements.textCitySelection);
        methods.waitForElementAndClick(citySelectionScreenElements.textNameCityAlmetevsk);
        methods.checkIsDisplayed(catalogScreenElements.buttonCatalogListFirst, true);
    }
}
