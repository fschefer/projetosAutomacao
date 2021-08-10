package io.appium.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTest {

	public static void main(String[] args) throws MalformedURLException {
		File appDir = new File ("src/main/resources");
		File app = new File(appDir, "ApiDemos-debug.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Teste");
		cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2"); 
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL ("http://192.168.0.9:4723/wd/hub"), (cap));
		//Finding Elements:
		/* 1) By xpath:
		 * driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click(); <- That will click on the element
		 * -> If you have 2 elements with the same class, you may use an array identifier, such as:
		 *      driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click(); <- We will find the third element with that xpath and click
		 *      
		 *      2) Using Android UI Automator:
		 *      driver.findElementByAndroidUIAutomator("attribute("value")") <- Useful when tagname is hard to use
		 *      
		 *      //Performing actions: 
		 *      -> Import those classes:
		 *      import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

1) Tap
		TouchAction t =new TouchAction(driver);
		WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		 *
		 *      2) Long press:
		 *      //Tap
		TouchAction t =new TouchAction(driver);
		WebElement expandList=	driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		t.tap(tapOptions().withElement(element(expandList))).perform();
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		** IMPORTANT: All actions MUST finish with the 'perform()' keyword
		*
		*3) Scrolling:
		*driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
	     4) Swipping:
	     TouchAction t=new TouchAction(driver);
	//long press //on element// 2 sec// move to another element and you release
	WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
	WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
	

t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();

5) Typing into a box: 
driver.findElementById("com.calculator:id/EditText02").sendKeys("50");

		 */
	}

}
