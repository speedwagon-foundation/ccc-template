import utils.C3Utils
import utils.C3Utils.printToFile

fun main() {
    val l1 = C3Utils.parse2DArray("test.csv")
    l1.toString().printToFile("test.txt")
    l1.printToFile("array.txt")
}