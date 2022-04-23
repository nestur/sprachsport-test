package com.sprachsport.pages;

import com.sprachsport.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dashboard extends PageBase {
    {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href = 'https://www.sprachsport.com/']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href = 'https://www.sprachsport.com/unser-konzept/']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href = 'https://www.sprachsport.com/team/']")));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href = 'https://www.sprachsport.com/kontakt/']")));
    }

    @FindBy(xpath = "//a[@href = 'https://www.sprachsport.com/']")
    public WebElement startSeiteButton;

    @FindBy(xpath = "//a[@href = 'https://www.sprachsport.com/unsere-konzept/']")
    public WebElement unserKonzeptButton;

    @FindBy(xpath = "//a[@href = 'https://www.sprachsport.com/team/']")
    public WebElement teamButton;

    @FindBy(xpath = "//a[@href = 'https://www.sprachsport.com/kontakt/']")
    public WebElement kontaktButton;
}
