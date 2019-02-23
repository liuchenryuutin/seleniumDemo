package lc.cy.selenium.base;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import lc.cy.constant.Constant;
import lc.cy.utils.FileUtil;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public abstract class SeleniumHelper {

	protected static WebDriver driver;

	@Before
	public void beforeTest() {
		System.setProperty("webdriver.ie.driver", "F:\\workspace\\seleniumdemo\\driver\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
	}

	@After
	public void afterTest() {
		driver.quit();
	}

	@Deprecated
	public static boolean getScreenshot_before(String path) {
		return FileUtil.saveScreensFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
				Constant.WORKPATH + path);
	}

	public static void getScreenshot(String path) {
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(10))
				.takeScreenshot(driver);
		try {
			ImageIO.write(screenshot.getImage(), "png", new File(
					Constant.WORKPATH + path + "\\" + FileUtil.getYearToMilliSecound() + Constant.File.SUFFIX));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
