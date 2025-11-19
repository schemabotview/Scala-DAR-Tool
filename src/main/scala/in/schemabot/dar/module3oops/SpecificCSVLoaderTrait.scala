package in.schemabot.dar.module3oops

trait SpecificCSVLoaderTrait {
  this: CSVLoader3 =>
  
  val delimiter: Char = ','
  def getSomeVar: Int = someVar
}
