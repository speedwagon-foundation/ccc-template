package utils

import java.io.File

object C3Utils {
    private fun userdir() = System.getProperty("user.dir")

    private fun getFile(fileName: String) =File("${userdir()}${File.separator}$fileName")

    private fun getLines(fileName: String) = getFile(fileName).readLines()

    fun parse2DArray(fileName: String) = getLines(fileName).map { it.split(" ") }

    fun String.printToFile(fileName: String) = getFile(fileName).writeText(this)

    fun List<List<String>>.printToFile(fileName:String) {
        val file = getFile(fileName)
        file.writeText("")
        this.forEach {row ->
            file.appendText("${row.print()}\n")
        }
    }

    private fun List<String>.print(): String {
        var s = ""
        this.forEach {
            s += "$it "
        }
        return s.trim()
    }
}