package in.schemabot.dar.module3oops.models

case class Row(values: Map[String, Cell]):
  def get(col: String): Option[Cell] = values.get(col)