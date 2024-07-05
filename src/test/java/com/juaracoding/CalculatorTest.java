package com.juaracoding;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.juaracoding.pages.CalculatorPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorTest {

    private AndroidDriver<MobileElement> driver;
    private CalculatorPage calculatorPage;
    private static ExtentReports extent;
    private static ExtentTest test;

    @Before
    public void setUpReport() {
        if (extent == null) {
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extent-report.html");
            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
        }
        test = extent.createTest("Calculator Test", "Testing the Google Calculator app");
    }

    @Given("The calculator app is open")
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");  // Update sesuai device Anda
        caps.setCapability("appPackage", "com.google.android.calculator");
        caps.setCapability("appActivity", "com.android.calculator2.Calculator");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        calculatorPage = new CalculatorPage(driver);

        test.pass("Calculator app opened successfully");
    }

    @When("I add {int} and {int}")
    public void performAddition(int num1, int num2) {
        calculatorPage.clickDigit(num1);
        calculatorPage.clickAdd();
        calculatorPage.clickDigit(num2);
        calculatorPage.clickEquals();

        test.pass(String.format("Performed addition of %d and %d", num1, num2));
    }

    @Then("The result should be {int}")
    public void validateResult(int expected) {
        String resultText = calculatorPage.getResultText();
        Assert.assertEquals(resultText, String.valueOf(expected), "Calculation result is incorrect!");
        test.pass(String.format("Validated that result is %d", expected));

        driver.quit();
    }

    @After
    public void tearDownReport() {
        extent.flush();
    }
}


