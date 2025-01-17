package com_pkg_createtest

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.util.KeywordUtil


public class CreateTest {



	@Keyword
	def selectTutorMode(String tutor) {
		Mobile.waitForElementPresent(findTestObject('Object Repository/CreateTest/createTestHeader'), 10, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/CreateTest/createTestHeader'), 10, FailureHandling.STOP_ON_FAILURE)

		String attrValue = Mobile.getAttribute(findTestObject('Object Repository/CreateTest/tutorModeSwitch'), 'value', 10, FailureHandling.STOP_ON_FAILURE)
		if(attrValue == '1') {
			if(tutor == 'true') {
				KeywordUtil.logInfo('tutor mode is on')
			} else {
				KeywordUtil.logInfo('tutor mode is on click on off')
				Mobile.tap(findTestObject('Object Repository/CreateTest/tutorModeSwitch'), 10, FailureHandling.STOP_ON_FAILURE)
			}
		} else {
			if(tutor == 'false') {
				KeywordUtil.logInfo('tutor mode is off')
			} else {
				KeywordUtil.logInfo('tutor mode is off click on on')
				Mobile.tap(findTestObject('Object Repository/CreateTest/tutorModeSwitch'), 10, FailureHandling.STOP_ON_FAILURE)
			}
		}
	}


	@Keyword
	def selectTimedMode(String timed) {
		String attrValue = Mobile.getAttribute(findTestObject('Object Repository/CreateTest/timedModeSwitch'), 'value', 10, FailureHandling.STOP_ON_FAILURE)
		if(attrValue == '1') {
			if(timed == 'true') {
				KeywordUtil.logInfo('timed mode is on')
			} else {
				KeywordUtil.logInfo('timed mode is on click on off')
				Mobile.tap(findTestObject('Object Repository/CreateTest/timedModeSwitch'), 10, FailureHandling.STOP_ON_FAILURE)
			}
		} else {
			if(timed == 'false') {
				KeywordUtil.logInfo('timed mode is off')
			} else {
				KeywordUtil.logInfo('timed mode is off click on on')
				Mobile.tap(findTestObject('Object Repository/CreateTest/timedModeSwitch'), 10, FailureHandling.STOP_ON_FAILURE)
			}
		}
	}

	@Keyword
	def selectSubjectsAndSystems() {
	}

	@Keyword
	def selectSubjects() {
		Mobile.verifyElementExist(findTestObject('Object Repository/CreateTest/Select All'), 5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/CreateTest/Select All'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def selectSystems() {
		Mobile.verifyElementExist(findTestObject('Object Repository/CreateTest/Select All'), 5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/CreateTest/Select All'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def clickNextButton() {
		Mobile.verifyElementExist(findTestObject('Object Repository/CreateTest/nextBtnOnCreateTest'), 5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/CreateTest/nextBtnOnCreateTest'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def clickOnBackArrow() {
		Mobile.verifyElementExist(findTestObject('Object Repository/CreateTest/backBtn'), 5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/CreateTest/backBtn'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def clickOnNextArrow() {
		Mobile.verifyElementExist(findTestObject('Object Repository/CreateTest/nextBtn'), 5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/CreateTest/nextBtn'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def clickOnGeneratetestButton() {
		Mobile.verifyElementExist(findTestObject('Object Repository/CreateTest/generateBtn'), 5, FailureHandling.STOP_ON_FAILURE)
		Mobile.tap(findTestObject('Object Repository/CreateTest/generateBtn'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def enterQuestionsNumbers(String qcount) {
		Mobile.verifyElementExist(findTestObject('Object Repository/CreateTest/QNoInput'), 10, FailureHandling.STOP_ON_FAILURE)
		Mobile.clearText(findTestObject('Object Repository/CreateTest/QNoInput'), 10, FailureHandling.STOP_ON_FAILURE)
		Mobile.sendKeys(findTestObject('Object Repository/CreateTest/QNoInput'), qcount, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Object Repository/CreateTest/Done'), 10, FailureHandling.STOP_ON_FAILURE)

		//Mobile.setPickerWheelValue(findTestObject('YourPickerWheelObject'), 'January', 'NEXT')
	}
}
