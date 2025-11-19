package in.schemabot.dar.module4fp

import in.schemabot.dar.module4fp.models.{Dataset, Row}

import scala.util.{Failure, Success}

abstract class AbstractFileLoader(delimiter: Char) {
  def load(resourceName: String): Dataset = {
    FileUtils.readLines(resourceName) match {
      case Failure(ex) =>
        println(s"Error reading file: ${ex.getMessage}")
        Dataset(Nil)
      case Success(lines) if lines.isEmpty =>
        Dataset(Nil)
      case Success(lines) =>
        val header = lines.head.split(delimiter).toList
        val data   = lines.tail.map(parseRow(_, header))
        Dataset(data)
    }
  }

  private def parseRow(line: String, header: List[String]): Row = {
    val values = line.split(delimiter).toList
    val mapped = header.zip(values).toMap
    Row(mapped)
  }
}