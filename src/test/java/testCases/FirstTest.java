package testCases;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class FirstTest extends BaseTests {
    @Test
    public void testSearch() {
        driver.get("https://www.google.com/ncr");
        WebElement searchBar = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBar.sendKeys("selenium webdriver");
        searchBar.submit();
        String thirdResult = driver.findElement(By.xpath("//div[@class='dURPMd']")).getText();
        assert thirdResult.contains("What is Selenium WebDriver");

    }
}
