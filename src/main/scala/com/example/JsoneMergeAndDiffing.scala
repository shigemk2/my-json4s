package com.example

import org.json4s.Diff

object JsoneMergeAndDiffing {
  def main(args: Array[String]): Unit = {
    import org.json4s.JsonDSL._
    import org.json4s.jackson.JsonMethods._

    val lotto1 = parse("""{
         "lotto":{
           "lotto-id":5,
           "winning-numbers":[2,45,34,23,7,5,3],
           "winners":[{
             "winner-id":23,
             "numbers":[2,45,34,23,3,5]
           }]
         }
       }""")

    val lotto2 = parse("""{
         "lotto":{
           "winners":[{
             "winner-id":54,
             "numbers":[52,3,12,11,18,22]
           }]
         }
       }""")

    val mergedLotto = lotto1 merge lotto2


    println(compact(render(mergedLotto)))
    // jqを使った感じで整形
    println(pretty(render(mergedLotto)))

    val Diff(changed, added, deleted) = mergedLotto diff lotto1
    println(changed)
    println(added)
    println(deleted)
    println("Hello, world!")
  }
}
