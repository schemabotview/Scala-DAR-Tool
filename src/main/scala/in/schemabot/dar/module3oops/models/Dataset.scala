package in.schemabot.dar.module3oops.models

case class Dataset(rows: List[Row]):
  def filter(p: Row => Boolean): Dataset =
    Dataset(rows.filter(p))

  def map(f: Row => Row): Dataset =
    Dataset(rows.map(f))

  def size: Int = rows.size