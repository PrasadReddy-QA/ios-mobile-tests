package com_pkg_testInterface

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class flashcards {


	@Keyword
	def clickFlashcards() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Testinterface/flashCardsLbl'), 10, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/Testinterface/flashCardsLbl'), 10, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Object Repository/Testinterface/flashCardsLbl'), 10, FailureHandling.STOP_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Object Repository/Testinterface/Flashcards/flashCardsHeader'), 10, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/Testinterface/Flashcards/flashCardsHeader'), 10, FailureHandling.STOP_ON_FAILURE)
	}


	@Keyword
	def clickOnAddNewCard() {
		Mobile.waitForElementPresent(findTestObject('Object Repository/Testinterface/Flashcards/addFlashCard'), 10, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/Testinterface/Flashcards/addFlashCard'), 10, FailureHandling.STOP_ON_FAILURE)

		Mobile.tap(findTestObject('Object Repository/Testinterface/Flashcards/addFlashCard'), 10, FailureHandling.STOP_ON_FAILURE)

		Mobile.waitForElementPresent(findTestObject('Object Repository/Testinterface/Flashcards/flashcardFront'), 10, FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyElementExist(findTestObject('Object Repository/Testinterface/Flashcards/flashcardFront'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def enterCardFront() {
		Mobile.tap(findTestObject('Object Repository/Testinterface/Flashcards/flashcardFront'), 10, FailureHandling.STOP_ON_FAILURE)
		entertext('Enter Card front On Mobile')
	}

	@Keyword
	def enterCardBack() {
		Mobile.tap(findTestObject('Object Repository/Testinterface/Flashcards/flashcardBack'), 10, FailureHandling.STOP_ON_FAILURE)
		entertext('Enter Card Back On Mobile')
	}

	@Keyword
	def clickOnSave() {
		Mobile.tap(findTestObject('Object Repository/Testinterface/Flashcards/Save'), 10, FailureHandling.STOP_ON_FAILURE)
	}

	@Keyword
	def entertext(String cardText) {
		Mobile.sendKeys(findTestObject('Object Repository/Testinterface/Flashcards/enterText'), cardText, FailureHandling.STOP_ON_FAILURE)
	}
}
