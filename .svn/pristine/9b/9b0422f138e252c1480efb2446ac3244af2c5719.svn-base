package lc.cy.selenium.impl;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import lc.cy.selenium.base.SeleniumHelper;

public class FirstSeleniumTest extends SeleniumHelper {

	@Test
	public void Test_1() throws Exception {

		driver.get("https://www.baidu.com/");

		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();

		driver.findElement(By.xpath("//*[@wdfield='kw']")).click();

		driver.manage().window().setSize(new Dimension(1280, 798));
		driver.manage().window().maximize();

		driver.navigate().back();

		driver.findElement(By.linkText("知道")).click();
		driver.findElement(By.linkText("网页")).click();

		WebElement element = driver.findElement(By.id("kw"));
		element.clear();
		element.sendKeys("陈阳");
		element.submit();

		driver.navigate().refresh();
		getScreenshot("a");

	}

	@Test
	public void Test_2() throws Exception {
		driver.get("https://www.baidu.com");

		driver.findElement(By.linkText("设置")).click();

		driver.findElement(By.linkText("搜索设置")).click();
		// Thread.sleep(2000);
		driver.switchTo().alert().accept();
		// 保存设置
		driver.findElement(By.linkText("保存设置")).click();

	}

	@Test
	public void Test_3() throws Exception {
		driver.get("https://www.baidu.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("kw")).sendKeys("selenium");
		driver.findElement(By.id("su")).click();
		getScreenshot("a");

	}
}
