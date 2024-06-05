package ru.shadrin.elements;

import org.openqa.selenium.By;

public class FormSberbankCartScreenElements {

    //input
    public By inputNumberCart = By.xpath("//android.view.View/android.view.View[1]/android.view.View[2]/android.widget.EditText");
    public By inputFIO = By.xpath("//*[@resource-id='iTEXT']");
    public By inputiCVC = By.xpath("//android.view.View[3]/android.view.View[2]/android.widget.EditText");
    public By inputPassword = By.xpath("//*[@resource-id='cvc']");
    public By inputNumberMonth = By.xpath("//android.view.View[2]/android.view.View/android.widget.EditText");
    public By inputNumberYear = By.xpath("//android.view.View[2]/android.view.View[3]/android.view.View/android.widget.EditText");
    public By inputEmail = By.xpath("//android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");

    //button
    public By buttonPayment = By.xpath("//*[@resource-id='submitcvc']");

    //form
    public By formSberbankCart = By.xpath("//*[@resource-id='wrap']");

    //text

    //string
    public String stringNumberYear = "24";
    public String stringNumberMonth = "12";
    public String stringNumberCart = "4111 1111 1111 1111";
    public String stringFio = "Y A";
    public String stringiCVC = "123";
    public String stringPassword = "12345678";

}
