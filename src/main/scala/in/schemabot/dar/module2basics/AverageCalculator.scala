/**
 * Basics
 * Variables, Data Types, Expressions, Methods, Control Flow, Loops, Pattern Matching
 */
package in.schemabot.dar.module2basics

object AverageCalculator {

  def main(args: Array[String]): Unit = {

    val pi: Double = 3.14159 // immutable variable
    var some: Int = 10 // mutable variable
    var another = 20 // type inferred
    val b: Byte = 1 // 1 byte
    val s: Short = 100 // 2 bytes 
    val i: Int = 0 // 4 bytes
    val l: Long = 123456789L // 8 bytes
    val f: Float = 3.14f // 4 bytes  
    val d: Double = 2.71828 // 8 bytes
    val c: Char = 'A' // 2 bytes
    val str: String = "Hello, Scala"
    val bool: Boolean = true
    val u: Unit = ()
    val bi: BigInt = BigInt("12345678901234567890")
    val bd: BigDecimal = BigDecimal("12345.6789")

    val sale1: Double = 1200.50 //immutable variable
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
