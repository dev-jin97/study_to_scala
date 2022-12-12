package ch01

object C01_Set extends App {
  // Set
  /*
  변경 가능한 것과 변경 불가능한 것 모두 제공함.
  Set 을 위한 기반 트레이트가 있고 이를 상속한 변경 가능 집합, 변경 불가능 집합을 위한 2가지 트레이트가 있음.
  */

  // 생성
  val set1 = Set("Hi", "Hello")
  // 리스트나 배열과 비슷하게 생성됨, 변경 불가능한 Set 객체를 만들어서 변경 불가능(val)한 s에 대입.

  println(set1)

  // 변경
  // 변경 가능한 set을 선언해주고 싶다면 import scala.collection.immutable.set 해야함.
  // 그리고 꼭 var 로 선언 해야함. 그래야 += 사용가능.
  var test_set = Set("Hi", "There")
  test_set += "Hello"

  println(test_set)


}
