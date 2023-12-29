package org.Class19;

import static org.Class19.Chrome.get;

public class BrowserTester {
    public static void main(String[] args) {
        Chrome chrome = new Chrome();
        get("https://Amazon.com");
        chrome.performTest();
        chrome.closBrowser();

        FireFox fireFox = new FireFox();
        FireFox.get("https://Amazon.com");
        fireFox.performTest();
        fireFox.closBrowser();

        Safari safari = new Safari();
        safari.get("https://Amazon.com");
        safari.performTest();
        Safari.closBrowser();

        Edge edge = new Edge();
        edge.get("https://Amazon.com");
        edge.performTest();
        edge.closBrowser();

        System.out.println("***************************");

    }
}