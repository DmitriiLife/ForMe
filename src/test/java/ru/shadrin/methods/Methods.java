package ru.shadrin.methods;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

import static ru.shadrin.resources.CoreTestCase.driver;

public class Methods {

    @Owner("Шадрин Дмитрий")
    @Description("Жду элемент, с указанием времени")
    @DisplayName("Жду элемент, с указанием времени")
    private WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + " " + by);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    @Owner("Шадрин Дмитрий")
    @Description("Жду элемент, без указания времени")
    @DisplayName("Жду элемент, без указания времени")
    public WebElement waitForElementPresent(By by) {
        return waitForElementPresent(by, "Время ожидания вышло ===> " + by,
                40);
    }

    @Owner("Шадрин Дмитрий")
    @Description("Жду элемент и тапаю его")
    @DisplayName("Жду элемент и тапаю его")
    public void waitForElementAndClick(By by) throws InterruptedException {
        WebElement element = waitForElementPresent(by);
        element.click();
    }


    @Owner("Шадрин Дмитрий")
    @Description("Жду элемент и передаю в него данные")
    @DisplayName("Жду элемент и передаю в него данные")
    public void waitForElementAndSendKeys(By by, String value) {
        WebElement element = waitForElementPresent(by);
        element.sendKeys(value);
    }

    @Owner("Шадрин Дмитрий")
    @Description("Жду элемент, проверяю текс этого элемента")
    @DisplayName("Жду элемент, проверяю текс этого элемента")
    public void waitForElementAndCheckText(By by, String value) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.textToBe(by, value));
    }

    @Owner("Шадрин Дмитрий")
    @Description("Жду элемент, проверяю, что его нет на экране")
    @DisplayName("Жду элемент, проверяю, что его нет на экране")
    private boolean waitForElementNotPresent(By by, String error_message, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "/n");
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    @Owner("Шадрин Дмитрий")
    @Description("Проверяю, что элемент отсутствует без указания времени(15)")
    @DisplayName("Проверяю, что элемент отсутствует без указания времени(15)")
    public boolean waitForElementNotPresent(By by) {
        return waitForElementNotPresent(by, "Время ожидания вышло ===>",
                15);
    }

    @Owner("Шадрин Дмитрий")
    @Description("Выбор случайно даты из 14 дней")
    @DisplayName("Выбор случайно даты из 14 дней")
    public int betweenFourteen() {
        LocalDate startInclusive = LocalDate.now().plusDays(1);
        LocalDate endExclusive = LocalDate.now().plusDays(14);
        long startEpochDay = startInclusive.toEpochDay();
        long endEpochDay = endExclusive.toEpochDay();
        long randomDay = ThreadLocalRandom
                .current()
                .nextLong(startEpochDay, endEpochDay);
        return LocalDate.ofEpochDay(randomDay).getDayOfMonth();
    }

    @Owner("Шадрин Дмитрий")
    @Description("Повторно кликнуть один и тот же элемент")
    @DisplayName("Повторно кликнуть один и тот же элемент")
    public boolean retryingFindClick(By by) throws InterruptedException {
        Thread.sleep(500);
        waitForElementPresent(by);
        boolean result = false;
        int attempts = 0;
        while (attempts < 2) {
            try {
                driver.findElement(by).click();
                result = true;
                break;
            } catch (StaleElementReferenceException e) {
                System.out.println("Tap again");
            }
            attempts++;
        }
        return result;
    }

    @Owner("Шадрин Дмитрий")
    @Description("Проверка, что элемент отображается или нет")
    @DisplayName("Проверка, что элемент отображается или нет")
    public void checkIsDisplayed(By by, boolean isDisplayed) {
        if (isDisplayed) {
            waitForElementPresent(by).isDisplayed();
        } else {
            waitForElementNotPresent(by);
        }
    }
}

