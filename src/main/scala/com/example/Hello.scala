package com.example

import org.json4s._
import org.json4s.native.JsonMethods._

object Hello {
  def main(args: Array[String]): Unit = {
    println(parse(""" { "numbers": [ 1, 2, 3, 4 ] }"""))
    println(parse("""{"name":"Toy","price":35.35}""", useBigDecimalForDouble = true))
    println("Hello, world!")
  }
}
