package in.schemabot.dar.module3oops
import in.schemabot.dar.module3oops.models.{Dataset, Row}

import scala.io.Source
import scala.util.{Failure, Success, Try}

object FileUtils:
  def readLines(resourceName: String): Try[List[String]] =
    Try {
      val src = Source.fromResource(resourceName)
      try src.getLines().toList
      finally src.close()
    }

object CSVLoader:
  def load(resourceName: String): Dataset =
    FileUtils.readLines(resourceName) match
      case Failure(ex) =>
        println(s"Error reading CSV: ${ex.getMessage}")
        Dataset(Nil)

      case Success(lines) =>
        val header = lines.head.split(",").toList
        val data   = lines.tail.map(parseRow(_, header))
        Dataset(data)

  private def parseRow(line: String, header: List[String]): Row =
    val values = line.split(",").toList
    val mapped = header.zip(values).toMap
    Row(mapped)