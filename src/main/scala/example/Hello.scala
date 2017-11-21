package example

import org.scalajs.dom
import dom.document

object Hello {
  def main(args: Array[String]): Unit = {
    //print to console
    println("Hello World!")

    val h1 = document.createElement("h1")
    h1.textContent = "Hello World paragraph"
    document.body.appendChild(h1)
  }
}
