package example

import scala.util.Random

object Hello extends Greeting with App {
  val isOneInHundred = Random.nextDouble() < 0.01
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "hello"
}
