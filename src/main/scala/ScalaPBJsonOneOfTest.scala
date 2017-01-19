package scalapbtest

import com.trueaccord.scalapb.json.JsonFormat
import test.oneof._

object ScalaPBJsonOneOfTest extends App {
  val example = Options("yellow", Options.Options.A(A("orange")))
  val json = JsonFormat.toJsonString(example)
  println(json)

  val proto = JsonFormat.fromJsonString[Options](json)
  println(proto.toString)

  val string = JsonFormat.toJsonString(proto)
  println(string)
}
