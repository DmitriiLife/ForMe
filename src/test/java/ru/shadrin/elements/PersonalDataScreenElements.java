package ru.shadrin.elements;

import org.openqa.selenium.By;

public class PersonalDataScreenElements {
    //text
    public By textToastInformer(String text) {
        return By.xpath("//*[contains(@text, '" + text + "')]");
    }

    //string

    //input
    public By inputFirstName = By.xpath("//android.widget.EditText[@resource-id='first-name-input']");
    public By inputSecondName = By.xpath("//android.widget.EditText[@resource-id='second-name-input']");
    public By inputLastName = By.xpath("//android.widget.EditText[@resource-id='last-name-input']");
    public By inputCurrentPassword = By.xpath("//android.widget.EditText[@resource-id='current-password-input']");
    public By inputNewPassword = By.xpath("//android.widget.EditText[@resource-id='new-password-input']");
    public By inputRepeatPassword  = By.xpath("//android.widget.EditText[@resource-id='repeat-new-password-input']");
    //button
    public By buttonSave = By.xpath("//*[@resource-id='primary-button']");

    public By  buttonQuestions(int question, int numberRadioButton) {
        return By.xpath("//*[@resource-id='question-" + question + "-answer-" + numberRadioButton + "-radio-button']");
    }
}
