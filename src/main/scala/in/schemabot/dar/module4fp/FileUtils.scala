package in.schemabot.dar.module4fp

import scala.io.Source
import scala.util.Try

object FileUtils:
  def readLines(resourceName: String): Try[List[String]] =
    Try {
      val src = Source.fromResource(resourceName)
      try src.getLines().toList
      finally src.close()
    }