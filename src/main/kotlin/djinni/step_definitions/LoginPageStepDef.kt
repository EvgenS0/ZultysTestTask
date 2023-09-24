package djinni.step_definitions

import core.driver.Driver
import djinni.pages.LoginPage

class LoginPageStepDef {
    private val loginPage = LoginPage(Driver.instance)

    fun userFillEmailField(): LoginPageStepDef {
        loginPage.emailInput.sendKeys(System.getProperty("email"))
        return this
    }

    fun userFillPasswordField(): LoginPageStepDef {
        loginPage.passwordInput.sendKeys(System.getProperty("password"))
        return this
    }

    fun userClickSubmitBtn(): InboxPageStepDefs {
        loginPage.submitBtn.click()
        return InboxPageStepDefs()
    }
}