package in.schemabot.dar.module3oops
import in.schemabot.dar.module3oops.models.{Dataset, Row}

import scala.io.Source
import scala.util.{Failure, Success, Try}

class CSVLoader(val delimiter:Char) extends AbstractFileLoader(delimiter) {
  val someVar = 10
}

class CSVLoader2 extends FileLoaderTriat {
  override val delimiter: Char = ','
  val someVar = 10
}

class CSVLoader3 extends SpecificCSVLoaderTrait {
  var someVar = 20
}