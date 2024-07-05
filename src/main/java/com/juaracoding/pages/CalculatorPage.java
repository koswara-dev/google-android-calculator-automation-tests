package com.juaracoding.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.android.AndroidDriver;
import java.time.Duration;

public class CalculatorPage {

    public CalculatorPage(AndroidDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
    }

    // Elemen-elemen kalkulator
    @AndroidFindBy(id = "com.google.android.calculator:id/digit_2")
    public MobileElement digitTwo;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_3")
    public MobileElement digitThree;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_4")
    public MobileElement digitFour;

    @AndroidFindBy(id = "com.google.android.calculator:id/digit_5")
    public MobileElement digitFive;

    @AndroidFindBy(accessibility = "plus")
    public MobileElement addButton;

    @AndroidFindBy(accessibility = "equals")
    public MobileElement equalsButton;

    @AndroidFindBy(id = "com.google.android.calculator:id/result_final")
    public MobileElement result;

    // Metode-metode untuk interaksi dengan elemen
    public void clickDigit(int digit) {
        switch (digit) {
            case 2:
                digitTwo.click();
                break;
            case 3:
                digitThree.click();
                break;
            case 4:
                digitFour.click();
                break;
            case 5:
                digitFive.click();
                break;
            // Tambahkan kasus lain sesuai kebutuhan Anda
        }
    }

    public void clickAdd() {
        addButton.click();
    }

    public void clickEquals() {
        equalsButton.click();
    }

    public String getResultText() {
        return result.getText();
    }
}

