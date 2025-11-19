package in.schemabot.dar.module4fp

import in.schemabot.dar.module4fp.models.{Dataset, Row}

import scala.io.Source
import scala.util.{Failure, Success, Try}

class PSVLoader(val delimiter:Char) extends AbstractFileLoader(delimiter)

class PSVLoader2 extends FileLoaderTriat {
  override val delimiter: Char = '|'
}