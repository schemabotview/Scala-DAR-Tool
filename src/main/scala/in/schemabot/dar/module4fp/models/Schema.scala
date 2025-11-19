package in.schemabot.dar.module4fp.models

case class Schema(columns: Seq[(String, String)]) {
  def columnNames: Seq[String] = columns.map(_._1)
  def columnTypes: Seq[String] = columns.map(_._2)
}
