package start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;


public class First {
    WebDriver driver = new ChromeDriver();



    @Test
    public void firstTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts()
                        .pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts()
                        .implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
        pause(3000);
        WebElement btnAbout = driver
                .findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
        WebElement btnLogin = driver
                .findElement(By.cssSelector("a[href='/login']"));
        btnLogin.click();
        //driver.navigate().forward();
        pause(3000);
        WebElement btnHome = driver.findElement
                (By.cssSelector("*[href='/home']"));
        //a[href='/home']
        //[href='/home']
        btnHome.click();
        pause(3000);
        WebElement divRoot = driver.findElement
                (By.cssSelector("div[id='root']"));
        //#root
        //[id='root']
        //*[id='root']
        System.out.println(divRoot.getTagName());
        System.out.println(divRoot.getAttribute("class"));

        WebElement divRoot1 = driver.findElement(By.id("root"));
        System.out.println(divRoot1.getTagName());

        WebElement divRoot2 = driver.findElement
                (By.className("container"));
        System.out.println(divRoot2.getAttribute("id"));

        driver.navigate().refresh();
        pause(3000);
        //driver.close();
        pause(3000);
        driver.quit();
    }


    @Test
    public void ilCarroTest() {
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        pause(2000);
        WebElement linkSearch = driver.findElement
                (By.cssSelector(".navigation-link"));
        // a[class='navigation-link']
        // a.navigation-link
        // *[class='navigation-link']
        // [class='navigation-link']
        // a[id='0']
        // #0
        // a#0.navigation-link
        // a#0.navigation-link[href='/search']
        linkSearch.click();
        pause(2000);

        WebElement linkTerms = driver.findElement
                (By.cssSelector("a.navigation-link[href='/terms-of-use']"));
        //[href='/terms-of-use']
        //a[href*='of-use'] * означает включает в себя
        // a[href^='/terms'] ^ начинается с
        // a[href$='-use'] $ заканчивается на
        linkTerms.click();
        pause(2000);

        WebElement linkSingUp = driver.findElement
                (By.cssSelector("div.header a.navigation-link:nth-child(5)"));
        linkSingUp.click();
        pause(2000);

        WebElement linkLogin = driver.findElement
                (By.cssSelector("div.header a.navigation-link:last-child"));
        linkLogin.click();
        pause(2000);

        WebElement logo = driver.findElement
                (By.cssSelector("div.header a:first-child"));
        logo.click();
        pause(2000);

        WebElement linkLetTheCar = driver.findElement
                (By.linkText("Let the car work"));
        linkLetTheCar.click();
        pause(2000);

        WebElement linkLetTheCar1 = driver.findElement
                (By.partialLinkText("work"));
        linkLetTheCar1.click();
        pause(2000);

        driver.quit();
    }




    public void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
