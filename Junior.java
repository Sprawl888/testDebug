package ru.Junior;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Junior {
    @Test
    public void junior() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        String titlegoogle = driver.getTitle();
        // Проверка перехода на страницу Google
        Assert.assertTrue(titlegoogle.equals("Google"));
        WebElement YO = driver.findElement(By.name("q"));
        //String href = driver.getCurrentUrl();
        //Assert.assertFalse(href.equals("https://market.yandex.ru/"));
        //WebElement R = driver.findElement(By.linkText("Яндекс.Маркет — выбор и покупка товаров из ..."));
        //R.getCssValue();
        //System.out.println("abc abc abc"+R.getTagName());
        //String href = driver.getCurrentUrl();
        //Assert.assertFalse(href.equals("https://market.yandex.ru/"));
        YO.sendKeys("Яндекс Маркет");
        YO.submit();
        //String href = driver.getCurrentUrl();
        //Assert.assertFalse(href.equals("https://market.yandex.ru/"));
        /**String OP = driver.getTitle();
        Assert.assertFalse(OP.equals("Яндекс.Маркет — выбор и покупка товаров из проверенных интернет-магазинов"));*/
        WebElement L = driver.findElement(By.xpath("//h3[contains(text(), 'Яндекс.Маркет — выбор и покупка товаров из ...')]"));
        // Проверка отображения ссылки на странице поиска
        Assert.assertTrue(L.isDisplayed());
        L.click();
        String urlyandex = driver.getCurrentUrl();
        // Проверка открытия Яндекс Маркет для Тест 1 и Тест 2
        Assert.assertTrue(urlyandex.equals("https://market.yandex.ru/"));
        WebElement OI = driver.findElement(By.id("header-search"));
        OI.sendKeys("Пылесосы");
        OI.submit();
        String pylisos = driver.getTitle();
        // Проверка перехода на страницу раздела "Пылесоса"
        Assert.assertTrue(pylisos.equals("«Пылесосы» — Результаты поиска — Яндекс.Маркет"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement N = driver.findElement(By.className("Q2TzG3eu2W"));
        N.click();
        WebElement U = driver.findElement(By.xpath("//button[contains(text(), 'Показать всё')]"));
        U.click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement X = driver.findElement(By.xpath("//span[contains(text(), 'В продаже')]"));
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        X.click();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement Z = driver.findElement(By.xpath("//span[contains(text(), 'Polaris')]"));
        Assert.assertTrue(Z.isDisplayed());
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        Z.click();
        WebElement G = driver.findElement(By.xpath("//span[contains(text(), 'VITEK')]"));
        Assert.assertTrue(G.isDisplayed());
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        G.click();
        WebElement Q = driver.findElement(By.id("glpriceto"));
        Q.sendKeys("6000");
        Q.submit();

        }
    }

