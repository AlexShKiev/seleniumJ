package com.mysite.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;



public class sikuli_test {
    public static void main(String[] args) throws FindFailed, InterruptedException {
        Screen screen = new Screen();
        Pattern image = new Pattern("/img/gmail.jpg");
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        screen.wait(image, 10);
        screen.click(image);

    }
}