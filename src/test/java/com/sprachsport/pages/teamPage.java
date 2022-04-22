package com.sprachsport.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class teamPage extends HomePage {
    @FindBy(className = "menu-text")
    public WebElement teamPage;
}

