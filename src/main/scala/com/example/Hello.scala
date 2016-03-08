package com.example

import org.json4s._
import org.json4s.native.JsonMethods._

object Hello {
  def main(args: Array[String]): Unit = {
    // JObject(List((numbers,JArray(List(JInt(1), JInt(2), JInt(3), JInt(4))))))
    println(parse(""" { "numbers": [ 1, 2, 3, 4 ] }"""))
    // JObject(List((name,JString(Toy)), (price,JDecimal(35.35))))
    println(parse("""{"name":"Toy","price":35.35}""", useBigDecimalForDouble = true))
    println("Hello, world!")
  }
}
