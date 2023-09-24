package core.properties

import java.util.*

class URLProperties {
    lateinit var djinniSiteUrl: String

    fun loadFromProperties(properties: Properties) {
        djinniSiteUrl = properties.getProperty("djinniSiteURL")
    }
}