package ru.shadrin.steps;

import ru.shadrin.elements.TabBarScreenElements;
import ru.shadrin.methods.Methods;

public class TabBarScreenSteps {
    private final TabBarScreenElements tabBarScreenElements = new TabBarScreenElements();
    private final Methods methods = new Methods();

    public void goToInfoMenu() throws InterruptedException {
        methods.retryingFindClick(tabBarScreenElements.buttonTabInfoMenu);
    }

    public void goToProfile() throws InterruptedException {
        methods.retryingFindClick(tabBarScreenElements.buttonTabProfile);
    }

}
