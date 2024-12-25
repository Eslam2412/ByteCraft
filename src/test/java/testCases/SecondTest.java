package testCases;

import base.BaseTests;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest extends BaseTests {

    @Test
    public void testUpload (){

        String filePath="C:\\Users\\lenovo\\OneDrive\\Desktop\\IMG_1111.png";

        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("File Upload")).click();
        driver.findElement(By.cssSelector("input#file-upload")).sendKeys(filePath);
        driver.findElement(By.cssSelector("input#file-submit")).click();
        String actualResult = String.valueOf(driver.findElement(By.cssSelector("div#uploaded-files")).getText());
        String expectedResult = "IMG_1111.png";
        Assert.assertEquals(actualResult, expectedResult, "Uploaded file name does not match expected value.");

    }
}
