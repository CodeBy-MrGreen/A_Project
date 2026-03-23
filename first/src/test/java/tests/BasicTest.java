package tests;

import org.testng.annotations.Test;
import base.BaseTest;

public class BasicTest extends BaseTest{

    @Test
    public void verifyTitle(){
        page.navigate("https://www.youtube.com/");
        String pageTitle = page.title();
        System.out.println("Title of this page is: "+pageTitle);
    }
    
}
