package djinni.step_definitions

import core.driver.Driver
import core.properties.PropertiesReader
import djinni.pages.HomePage

class HomePageStepDefs {
    private val homePage = HomePage(Driver.instance)

    fun userNavigatesToHomePage(): HomePageStepDefs {
        Driver.instance.get(PropertiesReader().urlsProperties().djinniSiteUrl)
        return this
    }

    fun userClickLoginInBtn(): LoginPageStepDef {
        homePage.loginInBtn.click()
        return LoginPageStepDef()
    }
}