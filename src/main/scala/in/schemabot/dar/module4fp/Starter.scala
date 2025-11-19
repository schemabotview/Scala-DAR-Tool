package in.schemabot.dar.module4fp

import in.schemabot.dar.module4fp.models.Dataset

import scala.io.StdIn.readLine

object Starter {

  def main(args: Array[String]): Unit = {
    println("Starting Scala DAR Engine")
    val ds: Dataset = CSVLoader(',').load("dataset.csv")
    println("Number of sales: " + Aggregator.count(ds))
    println("Total sales: " + Aggregator.sum(ds, "amount"))
    println("Average sales: " + Aggregator.average(ds, "amount"))
  }
}
