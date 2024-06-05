package ru.shadrin.steps;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import ru.shadrin.elements.*;
import ru.shadrin.methods.Methods;

public class AuthorizationScreenSteps {
    private final AuthorizationScreenElements authorizationScreenElements = new AuthorizationScreenElements();
    private final TabBarScreenSteps tabBarScreenSteps = new TabBarScreenSteps();
    private final Methods methods = new Methods();
    private final InfoMenuScreenElements infoMenuScreenElements = new InfoMenuScreenElements();
    private final ProfileScreenElements profileScreenElements = new ProfileScreenElements();

    @Owner("Шадрин Дмитрий")
    @Description("Авторизация ФЛ")
    @DisplayName("Авторизация ФЛ")
    public void loginMarket() throws InterruptedException {
        tabBarScreenSteps.goToInfoMenu();
        methods.waitForElementPresent(infoMenuScreenElements.textHeaderInfoMenu);
        methods.waitForElementAndClick(infoMenuScreenElements.buttonEnterInfo);
        methods.waitForElementPresent(authorizationScreenElements.textLoginToIPRO);
        methods.waitForElementAndSendKeys(authorizationScreenElements.inputMarketPhone,
                authorizationScreenElements.stringMarketPhone);
        methods.waitForElementAndSendKeys(authorizationScreenElements.inputMarketPassword,
                authorizationScreenElements.stringMarketPassword);
        methods.waitForElementAndClick(authorizationScreenElements.buttonLoginToAccount);
        tabBarScreenSteps.goToProfile();
        methods.waitForElementAndCheckText(profileScreenElements.textFio,
                profileScreenElements.stringMarketFio);
    }
}
