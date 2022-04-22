package com.sprachsport.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OurConceptPage extends PageBase {
    @FindBy(className = "fusion-tab-heading fusion-responsive-typography-calculated")
    public WebElement methodeButton;
}
