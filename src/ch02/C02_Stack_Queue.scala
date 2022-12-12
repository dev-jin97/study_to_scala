package ch02

import scala.collection.mutable

object C02_Stack_Queue extends App {
  // Queue , mutable
  // 먼저 집어 넣은 데이터가 먼저 나오게 됨.
  val queue  = new mutable.Queue[String]
  queue += "a"
  queue ++= List("b", "c")

  println(queue.dequeue())

  // Stack , mutable
  // 마지막에 넣은 데이터가 먼저 나오게 됨.
  val stack = new mutable.Stack[Int]
  stack.push(1)
  stack.push(2)

  println(stack.pop())

}
