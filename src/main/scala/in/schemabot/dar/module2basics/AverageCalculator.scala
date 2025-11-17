/**
 * Basics
 * Variables, Data Types, Expressions, Functions, Control Flow, Loops, Pattern Matching
 */
package in.schemabot.dar.module2basics

object AverageCalculator {

  def main(args: Array[String]): Unit = {

    val sale1: Double = 1200.50
    val sale2: Double = 350.99
    val sale3: Double = 75.00


    def calculateMean(s1: Double, s2: Double, s3: Double): Double = {
      val sum: Double = s1 + s2 + s3
      sum / 3
    }

    val average: Double = calculateMean(sale1, sale2, sale3)

    val saleStatus: String = if average >= 500 then "High" else "Low"

    println(s"Average sale is: $average")
    println(s"Result: $saleStatus")

    val sales = List(sale1, sale2, sale3)

    for (sale <- sales) {
      sale match {
        case sale if sale >= 500 => println("High sale")
        case sale if sale >= 250 && sale < 500 => println("Average sale")
        case sale if sale < 500 => println("Low sale")
      }
    }
  }
}
