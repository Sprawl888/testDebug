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
    public void junior() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\spraw\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        String titlegoogle = driver.getTitle();
        // Проверка перехода на страницу Google
        Assert.assertTrue(titlegoogle.equals("Google"));
        WebElement YO = driver.findElement(By.name("q"));
        YO.sendKeys("Яндекс Маркет");
        YO.submit();
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
        TimeUnit.SECONDS.sleep(4);
        String pylisos = driver.getTitle();
        // Проверка перехода на страницу раздела "Пылесосов"
        Assert.assertTrue(pylisos.equals("«Пылесосы» — Результаты поиска — Яндекс.Маркет"));
        WebElement N = driver.findElement(By.className("Q2TzG3eu2W"));
        N.click();
        WebElement U = driver.findElement(By.xpath("//button[contains(text(), 'Показать всё')]"));
        //Assert.assertTrue(U.isDisplayed());
        U.click();
        TimeUnit.SECONDS.sleep(4);
        WebElement ONYX = driver.findElement(By.className("_1JYTt02WxW"));
        ONYX.sendKeys("Polaris");
        ONYX.click();
        TimeUnit.SECONDS.sleep(4);
        WebElement Z = driver.findElement(By.xpath("//span[contains(text(), 'Polaris')]"));
        Z.click();
        TimeUnit.SECONDS.sleep(4);
        WebElement FOX = driver.findElement(By.className("_19zvwl8AGi"));
        FOX.click();
        TimeUnit.SECONDS.sleep(4);
        ONYX.sendKeys("Vitek");
        ONYX.click();
        TimeUnit.SECONDS.sleep(4);
        WebElement G = driver.findElement(By.xpath("//span[contains(text(), 'VITEK')]"));
        G.click();
        TimeUnit.SECONDS.sleep(4);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement X = driver.findElement(By.xpath("//span[contains(text(), 'В продаже')]"));
        X.click();
        TimeUnit.SECONDS.sleep(4);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        WebElement Q = driver.findElement(By.id("glpriceto"));
        Q.sendKeys("6000");
        Q.click();
        WebElement OPS = driver.findElement(By.xpath("//span[contains(text(), 'Найдено 36 результатов')]"));
        //Проверка количества результатов фильтрации
        Assert.assertTrue(OPS.getText().equals("Найдено 36 результатов"));
        driver.quit();
        }
    }

