package Objects;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import Values.BrowserCodeValues;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class BrowserCode {
	public static  WebDriver driver;
	public static void Browser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\cubic\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions co =new ChromeOptions();
		co.addArguments("Start-Maximized");
		driver= new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(BrowserCodeValues.URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

        public static void screenshot1(String dest) throws Exception {
        Screenshot sc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        BufferedImage scrfile = sc.getImage();
        File destfile = new File(dest);
        ImageIO.write(scrfile, "png", destfile);

}
      /*  public static void screenshot2() throws Exception {
            Screenshot sc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            BufferedImage scrfile = sc.getImage();
            File destfile = new File("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\screenshot\\screenshot2.png");
            ImageIO.write(scrfile, "png", destfile);

    }
        public static void screenshot3() throws Exception {
            Screenshot sc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            BufferedImage scrfile = sc.getImage();
            File destfile = new File("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\screenshot\\screenshot3.png");
            ImageIO.write(scrfile, "png", destfile);

    }
        public static void screenshot4() throws Exception {
            Screenshot sc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            BufferedImage scrfile = sc.getImage();
            File destfile = new File("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\screenshot\\screenshot4.png");
            ImageIO.write(scrfile, "png", destfile);

    }
        public static void screenshot5() throws Exception {
            Screenshot sc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
            BufferedImage scrfile = sc.getImage();
            File destfile = new File("C:\\Users\\cubic\\git\\BOOKSTORE_TASK\\BookStore\\External Files\\screenshot\\screenshot5.png");
            ImageIO.write(scrfile, "png", destfile);

    }*/
}