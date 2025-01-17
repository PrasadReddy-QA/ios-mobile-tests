package com_pkg_createtest
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil



class WelcomePage {
	/**
	 * Check if element present in timeout
	 * @param to Katalon test object
	 * @param timeout time to wait for element to show up
	 * @return true if element present, otherwise false
	 */
	@Keyword
	def isElementPresent_Mobile(TestObject to, int timeout){
		try {
			KeywordUtil.logInfo("Finding element with id:" + to.getObjectId())

			WebElement element = MobileElementCommonHelper.findElement(to, timeout)
			if (element != null) {
				KeywordUtil.markPassed("Object " + to.getObjectId() + " is present")
			}
			return true
		} catch (Exception e) {
			KeywordUtil.markFailed("Object " + to.getObjectId() + " is not present")
		}
		return false;
	}

	/**
	 * Get mobile driver for current session
	 * @return mobile driver for current session
	 */
	@Keyword
	def WebDriver getCurrentSessionMobileDriver() {
		return MobileDriverFactory.getDriver();
	}


	@Keyword
	def login() {
		Mobile.verifyElementExist(findTestObject('Object Repository/Welcome/productName'), 5)
		Mobile.clearText(findTestObject('Object Repository/Welcome/emailID'), 4, FailureHandling.STOP_ON_FAILURE)
		Mobile.sendKeys(findTestObject('Object Repository/Welcome/emailID'), 'kmadhyanam@uworld.in')
		Mobile.clearText(findTestObject('Object Repository/Welcome/password'), 4, FailureHandling.STOP_ON_FAILURE)
		Mobile.sendKeys(findTestObject('Object Repository/Welcome/password'), 'JY80VbMOh+F58zRfzCFbOA==', FailureHandling.STOP_ON_FAILURE)

		//if(Mobile.verifyElementChecked(findTestObject('Object Repository/Welcome/rememberMeBtn'), 5)== true) {
		Mobile.tap(findTestObject('Object Repository/Welcome/rememberMeBtn'), 5, FailureHandling.STOP_ON_FAILURE)
		//}

		Mobile.tap(findTestObject('Object Repository/Welcome/signInBtn'), 5, FailureHandling.STOP_ON_FAILURE)

		//Mobile.waitForElementPresent(findTestObject('Object Repository/HomePage/powericon'), 10)
		//Mobile.verifyElementExist(findTestObject('Object Repository/HomePage/powericon'), 10, FailureHandling.STOP_ON_FAILURE)
		//Mobile.verifyElementExist(findTestObject('Object Repository/HomePage/cartIcon'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def launchQbank(String QBANK) {
		//INTERNAL MEDICINE QBANK
		Mobile.waitForElementPresent(findTestObject('Object Repository/HomePage/qbank', [('QBANK NAME') : QBANK]), 10)
		Mobile.tap(findTestObject('Object Repository/HomePage/qbank', [('QBANK NAME') : QBANK]), 10, FailureHandling.STOP_ON_FAILURE)
	}
}