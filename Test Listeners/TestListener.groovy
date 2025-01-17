import org.openqa.selenium.Capabilities

import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.util.KeywordUtil

import io.appium.java_client.AppiumDriver
class TestListener {
	/**
	 * Executes before every test suite starts.
	 * @param testSuiteContext: related information of the executed test suite.
	 */
	@BeforeTestSuite
	def launchApp() {
		
		// Define custom desired capabilities
		Map<String, Object> desiredCapabilities = new HashMap<>()
		desiredCapabilities.put("platformName", "iOS")
		desiredCapabilities.put("platformVersion", "18.1")
		desiredCapabilities.put("deviceName", "iPhone 13")
		desiredCapabilities.put("automationName", "XCUITest")
		desiredCapabilities.put("app", "/Users/uw-in-lpt0079/Desktop/BOARDS.ipa")
		desiredCapabilities.put("udid", "00008110-001078C91E12401E")
		
		// Set these capabilities for the mobile driver
		RunConfiguration.setMobileDriverPreferencesProperty("desiredCapabilities", desiredCapabilities)
		
		// Specify the path to your iOS app file
		String appPath = '/Users/uw-in-lpt0079/Desktop/iOS_ipa/BOARDS.ipa'

		// Launch the app
		
		Mobile.startApplication(appPath, false)
		AppiumDriver driver = MobileDriverFactory.getDriver()
		Capabilities caps = driver.getCapabilities()
		KeywordUtil.logInfo("Execution Session ID: " + caps.getCapability("kt:requestId"))
	}
	
	
	@AfterTestSuite
	def closeApp() {
		// Close the app
		Mobile.closeApplication()
	}
}