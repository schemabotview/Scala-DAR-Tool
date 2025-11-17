package in.schemabot.dar.module3oops

import in.schemabot.dar.module3oops.models.Dataset

object Starter {

  def main(args: Array[String]): Unit = {
    val ds: Dataset = CSVLoader.load("dataset.csv")
    println("Number of sales: " + Aggregator.count(ds))
    println("Total sales: " + Aggregator.sum(ds, "amount"))
    println("Average sales: " + Aggregator.average(ds, "amount"))
  }
}
