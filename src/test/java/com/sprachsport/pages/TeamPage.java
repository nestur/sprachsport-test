package com.sprachsport.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeamPage extends StartseitePage {
    @FindBy(className = "menu-text")
    public WebElement teamPage;
}

