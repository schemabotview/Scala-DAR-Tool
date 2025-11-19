package in.schemabot.dar.module4fp.models

case class Row(values: Map[String, Cell]):
  def get(col: String): Option[Cell] = values.get(col)