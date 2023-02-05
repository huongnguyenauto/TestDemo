package qaTest.com.Demo01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import qaTest.com.common.BaseTest;

public class DropdownCheckbox extends BaseTest {

    public static void main(String[] args) throws InterruptedException {
        createDriver();
        System.out.println("Step01");

        driver.navigate().to("https://demoqa.com/progress-bar");
        System.out.println("chrome ok");

        driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]")).click();
        Thread.sleep(2000);
        System.out.println("step 2");

        driver.findElement(By.xpath("//div[contains(@class,'element-list collapse show')]//li[2][@id='item-1']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@title='Toggle']//*[name()='svg']")).click();
        Thread.sleep(3000);

        WebElement element1 = driver.findElement(By.xpath("//label[@for='tree-node-downloads']//span[@class='rct-checkbox']//*[name()='svg']"));
        element1.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[normalize-space()='Radio Button']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//label[normalize-space()='Yes']")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//label[normalize-space()='Yes']")).isSelected();

        closeDriver();
    }
}
