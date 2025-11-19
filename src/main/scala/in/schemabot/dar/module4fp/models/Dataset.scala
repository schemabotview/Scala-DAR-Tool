package in.schemabot.dar.module4fp.models

case class Dataset(rows: List[Row]):
  def size: Int = rows.size