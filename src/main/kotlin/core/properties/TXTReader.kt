package core.properties

import java.io.File

class TXTReader {
    fun getListFromFile(fileName: String): List<String> {
        val strings = mutableListOf<String>()
        val file = File(javaClass.classLoader.getResource(fileName).file)

        file.useLines { lines ->
            lines.forEach { line ->
                strings.add(line.trim())
            }
        }
        return strings
    }
}