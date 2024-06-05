package ru.shadrin.test.android;

import io.qameta.allure.Description;
import org.junit.jupiter.api.*;
import ru.shadrin.resources.CoreTestCase;
import ru.shadrin.steps.AuthorizationScreenSteps;
import ru.shadrin.steps.SplashScreenSteps;

public class MarketTest extends CoreTestCase {
    private final SplashScreenSteps splashScreenSteps = new SplashScreenSteps();
    private final AuthorizationScreenSteps authorizationScreenSteps = new AuthorizationScreenSteps();

    @Test
    @Description("Первый пуск МП, авторизация ФЛ")
    @DisplayName("Первый пуск МП, авторизация ФЛ")
    public void testFirstRunAndLoginMarket() throws InterruptedException {
        System.out.println("HELLO");
        splashScreenSteps.firstRunApp();
        authorizationScreenSteps.loginMarket();
    }
}