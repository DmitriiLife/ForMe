package ru.shadrin.elements;

import org.openqa.selenium.By;

public class RegistrationScreenElements {
    //button
    public By buttonRegistration = By.xpath("//*[@resource-id='login-registration-button']");
    public By buttonBackHeader = By.xpath(" //android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
    public By buttonChooseCity = By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[1]");

    public By buttonKeyBoard(int index) {
        return By.xpath("//*[@content-desc='" + index + "']");
    }

    //input
    public By inputFormStepOne(int indexViewGroup, int indexEditText) {
        return By.xpath("//android.view.ViewGroup/android.view.ViewGroup[" + indexViewGroup + "]/android.widget.EditText[" + indexEditText + "]");
    }

    public By inputPhone = By.xpath("//android.widget.EditText");
}
