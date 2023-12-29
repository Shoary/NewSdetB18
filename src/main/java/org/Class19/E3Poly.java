package org.Class19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E3Poly {
    public static void main(String[] args) throws InterruptedException {

        // Using polymorphism by declaring the variable as WebDriver
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("https://amazon.com");
        Thread.sleep(2000);
        System.out.println(webDriver.getTitle());
        webDriver.quit();
    }
}

