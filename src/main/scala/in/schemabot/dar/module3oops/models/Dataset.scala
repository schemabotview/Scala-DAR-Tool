package in.schemabot.dar.module3oops.models

case class Dataset(rows: List[Row]):
  def size: Int = rows.size