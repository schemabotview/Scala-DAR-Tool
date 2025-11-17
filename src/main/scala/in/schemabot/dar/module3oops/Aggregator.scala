package in.schemabot.dar.module3oops

object Aggregator:

  def count(ds: Dataset): Int = ds.size

  def sum(ds: Dataset, col: String): Double =
    ds.rows.flatMap(_.get(col)).collect { case d: String => d.toDouble }.sum

  def average(ds: Dataset, col: String): Double =
    val nums = ds.rows.flatMap(_.get(col)).collect { case d: String => d.toDouble }
    if nums.isEmpty then 0.0 else nums.sum / nums.length
