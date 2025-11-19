package in.schemabot.dar.module4fp

trait SpecificCSVLoaderTrait {
  this: CSVLoader3 =>

  val delimiter: Char = ','
  def getSomeVar: Int = someVar
}
