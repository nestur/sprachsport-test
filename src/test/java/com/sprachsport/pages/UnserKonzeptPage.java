package com.sprachsport.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnserKonzeptPage extends PageBase {
    @FindBy(className = "fusion-tab-heading fusion-responsive-typography-calculated")
    public WebElement methodeButton;
    @FindBy(className = "fusion-tab-heading fusion-responsive-typography-calculated")
    public WebElement sportButton;
    @FindBy(className = "fusion-tab-heading fusion-responsive-typography-calculated")
    public WebElement sprachenButton;
    @FindBy(className = "fusion-tab-heading fusion-responsive-typography-calculated")
    public WebElement untersheidungsMerkmalButton;
    @FindBy(className = "title-heading-center fusion-responsive-typography-calculated")
    public WebElement unterrichtNameTitle;
    @FindBy(className = "tab-header")
    public WebElement natürlicheTextTitle;
    @FindBy(className = "fusion-button-text")
    public WebElement mehrErfahrenButton;

}
