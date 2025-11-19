package in.schemabot.dar.module3oops

trait Renderer {
  this: Node =>
  def render: Unit = {
    println(s"Rendering content: $content with wrapper: $wrapper")
  }
}

abstract class Node(val content: String) extends Renderer{
  val wrapper: String
}

class TextNode(override val content: String) extends Node(content) {
  override val wrapper: String = "<p>"
}
class CodeNode(override val content: String) extends Node(content) {
  override val wrapper: String = "<code>"
}

object NodeRenderer {
  def main(args: Array[String]): Unit = {
    val nodes: List[Node] = List(new TextNode("Hello"), new CodeNode("World"))
    nodes.foreach(node => node.render)
  }
}
