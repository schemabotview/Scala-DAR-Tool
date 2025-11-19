package in.schemabot.dar.module4fp

import in.schemabot.dar.module4fp.models.Dataset

import scala.io.StdIn.readLine

object Starter {

  def main(args: Array[String]): Unit = {
    println("Starting Scala DAR Engine")
    val fileName = readLine("Enter file name: ")
    val ds: Dataset = fileName.split("\\.").last match {
      case "csv" => CSVLoader(',').load(fileName)
      case "psv" => PSVLoader('|').load(fileName)
      case _ =>
        println("Unsupported file format")
        Dataset(Nil)
    }
    println("Number of sales: " + Aggregator.count(ds))
    println("Total sales: " + Aggregator.sum(ds, "amount"))
    println("Average sales: " + Aggregator.average(ds, "amount"))

    // using traits
    val ds2: Dataset = fileName.split("\\.").last match {
      case "csv" => CSVLoader2().load(fileName)
      case "psv" => PSVLoader2().load(fileName)
      case _ =>
        println("Unsupported file format")
        Dataset(Nil)
    }
    println("Number of sales: " + Aggregator.count(ds2))
    println("Total sales: " + Aggregator.sum(ds2, "amount"))
    println("Average sales: " + Aggregator.average(ds2, "amount"))

    //Specific CSVLoaderTrait
    //mostly used for segregating some methods from the class
    val csvLoader3 = new CSVLoader3()
    csvLoader3.getSomeVar
  }
}
