/**
 * Abstract Data Types
 */
package in.schemabot.dar

package object module3oops {

  type Cell = Int | Double | String

  opaque type ColumnName = String
  object ColumnName:
    def apply(name: String): ColumnName = name

  case class Row(values: Map[String, Cell]):
    def get(col: String): Option[Cell] = values.get(col)

  case class Dataset(rows: List[Row]):
    def filter(p: Row => Boolean): Dataset =
      Dataset(rows.filter(p))

    def map(f: Row => Row): Dataset =
      Dataset(rows.map(f))

    def size: Int = rows.size

  case class DataFrame(id: Int, product: String, region: String, amount: Double)

}
