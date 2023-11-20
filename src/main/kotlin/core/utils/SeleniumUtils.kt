package core.utils

import core.driver.Driver
import org.openqa.selenium.*
import org.openqa.selenium.support.ui.WebDriverWait
import java.time.Duration

class SeleniumUtils {
    private val driver = Driver.instance

    fun waitForPageDOM() {
        val jsExecutor = driver as JavascriptExecutor
        WebDriverWait(driver, Duration.ofSeconds(60)).until {
            jsExecutor.executeScript(
                "return document.readyState === 'complete';"
            ) as Boolean
        }
    }

}

