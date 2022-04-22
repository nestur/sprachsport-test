package com.sprachsport.pages;

import com.sprachsport.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class PageBase {
    public PageBase(){
        PageFactory.initElements(Driver.get(), this);
    }
}
