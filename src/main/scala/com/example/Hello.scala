package com.example

import org.json4s._
import org.json4s.native.JsonMethods._
import org.json4s.JsonDSL._

object Hello {
  def main(args: Array[String]): Unit = {
    // PARSE
    // JObject(List((numbers,JArray(List(JInt(1), JInt(2), JInt(3), JInt(4))))))
    println(parse(""" { "numbers": [ 1, 2, 3, 4 ] }"""))
    // JObject(List((name,JString(Toy)), (price,JDecimal(35.35))))
    println(parse("""{"name":"Toy","price":35.35}""", useBigDecimalForDouble = true))
    // JObject(List((name,JString(Toy)), (price,JDouble(35.35))))
    println(parse("""{"name":"Toy","price":35.35}""", useBigDecimalForDouble = false))
    // DSL Rules
    // Primitive types map to JSON primitives.
    // val json1 = List(1, 2, 3)
    val json1 = Seq(1,2,3,4,5)
    println(compact(render(json1)))

    println("Hello, world!")
  }
}
