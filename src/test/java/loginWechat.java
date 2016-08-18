import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;

/**
 * Created by yddu on 8/15/16.
 */
public class loginWechat {
    AppiumDriver wd;

    @Before
    public void setUp() throws Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "5.0");
        capabilities.setCapability("deviceName", "192.168.56.101:5555");
        capabilities.setCapability("app", "/Users/yddu/Documents/workshop/Appuim/weixin6322android821.apk");
        wd = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        wd.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @Test
    public void sendMessage() {
        wd.findElement(By.xpath("//android.view.View[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.Button[1]")).click();
        wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.EditText[1]")).sendKeys("didi3135606247");
        wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]")).sendKeys("password");
        wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();
        wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.Button[1]")).click();

        WebElement word = wd.findElement(By.id("com.tencent.mm:id/bhj"));
        assertEquals("Chats",word.getText());

        wd.findElement(By.id("com.tencent.mm:id/a_u")).click();
        wd.findElement(By.id("com.tencent.mm:id/yv")).sendKeys("hahahaha");
        wd.findElement(By.id("com.tencent.mm:id/z1")).click();

        WebElement text = wd.findElement(By.id("com.tencent.mm:id/gw"));
        assertEquals("hahahaha",text.getText());

        wd.quit();
    }

    @Test
    public void sendTextMoments(){
        wd.findElement(By.id("com.tencent.mm:id/c32")).click();
        wd.findElement(By.id("com.tencent.mm:id/b58")).click();
        wd.findElement(By.id("com.tencent.mm:id/ew")).sendKeys("didi3135606247");
        wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]")).sendKeys("password");
        wd.findElement(By.id("com.tencent.mm:id/b4n")).click();
        wd.findElement(By.id("com.tencent.mm:id/bhd")).click();

        WebElement word = wd.findElement(By.id("com.tencent.mm:id/bhj"));
        assertEquals("Chats",word.getText());

        wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]")).click();
        wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).click();

        WebElement moments = wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.view.View[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]"));

        TouchAction action = new TouchAction(wd);
        action.longPress(moments,3000).release().perform();
        
        wd.findElement(By.id("com.tencent.mm:id/b5b")).click();
        wd.findElement(By.id("com.tencent.mm:id/b5e")).sendKeys("This moment is for Appium test!");
        wd.findElement(By.id("com.tencent.mm:id/eg")).click();

        WebElement momentsText = wd.findElement(By.xpath("//android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.ListView[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]"));
        assertEquals("This moment is for Appium test!",momentsText.getText());

        wd.quit();
    }
}
