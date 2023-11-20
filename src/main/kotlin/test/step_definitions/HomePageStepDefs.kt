package test.step_definitions

import core.driver.Driver
import core.properties.PropertiesReader
import core.utils.SeleniumUtils
import test.pages.HomePage

class HomePageStepDefs {
    private val homePage = HomePage(Driver.instance)
    private val driver = Driver.instance
    private val seleniumUtils = SeleniumUtils()

    fun userNavigatesToHomePage(): HomePageStepDefs {
        driver.get(PropertiesReader().urlsProperties().zultysSiteURL)
        seleniumUtils.waitForPageDOM()
        return this
    }

    fun userClicksOnDownloadBtns(): HomePageStepDefs {
        homePage.downloadBtns.forEach {
            it.click()
        }
        return this
    }


    fun printAllLinksInConsole(): HomePageStepDefs {
        userNavigatesToHomePage()
        val iterator: Int = homePage.linkBtns.size - 1
        for (i in 0..iterator) {
            homePage.linkBtns[i].click()
            seleniumUtils.waitForPageDOM()
            println("Current URL: ${driver.currentUrl}")
            userNavigatesToHomePage()
        }
        return this
    }

}