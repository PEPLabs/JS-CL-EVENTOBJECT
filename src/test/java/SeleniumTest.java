import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Set up ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

        // Create a new ChromeDriver instance
        driver = new ChromeDriver();
        File file = new File("EventObject.html");
        // Open the HTML file
        driver.get(file.getAbsolutePath());
    }
    @Test
    public void testClickParagraph() {

        // Find a p tag and click it
        WebElement paragraph = driver.findElement(By.tagName("p"));
        paragraph.click();

        // assert that the content field was updated:
        WebElement content = driver.findElement(By.id("content"));

        Assert.assertEquals("[object HTMLParagraphElement]", content.getText());
    }

    @Test
    public void testClickButton() {

        // Find a button tag and click it
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        // assert that the content field was updated:
        WebElement content = driver.findElement(By.id("content"));

        Assert.assertEquals("[object HTMLButtonElement]", content.getText());
    }

    @Test
    public void testClickHeader() {

        // Find a header tag and click it
        WebElement header = driver.findElement(By.tagName("h1"));
        header.click();

        // assert that the content field was updated:
        WebElement content = driver.findElement(By.id("content"));

        Assert.assertEquals("[object HTMLHeadingElement]", content.getText());
    }


    @Test
    public void testClickAnchor() {

        // Find anchor tag and click it
        WebElement anchor = driver.findElement(By.tagName("a"));
        anchor.click();

        // assert that the content field was updated:
        WebElement content = driver.findElement(By.id("content"));

        Assert.assertEquals("https://developer.mozilla.org/en-US/docs/Web/API/Event", content.getText());
    }




    @After
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}