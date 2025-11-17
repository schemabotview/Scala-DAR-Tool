package in.schemabot.dar.module3oops.models

class Dataframe(val schema: Schema, val ds: Dataset)

object Dataframe:
  def apply(ds: Dataset): Dataframe = {
    val firstRow: Map[String, Cell] = ds.rows.head.values
    val columns = firstRow.map((k, v) => (k, v.getClass.getSimpleName)).toSeq
    new Dataframe(Schema(columns), ds)
  }
