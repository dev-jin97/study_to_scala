package ch01


object C01_Map extends App {
  // Map
  // Map은 변경 가능한 것과 변경 불가능한 것 모두 제공함.

  // 생성
  val m = Map[Int, String]() // 다른 것들과 마찬가지로 팩토리 메소드를 이용해 생성가능

  val m2 = Map(1 -> "one", 2-> "two") // 초기화 방식 1
  val m3 = Map((1, "one"), (2, "two")) // 초기화 방식 2

  // List를 이용한 Map 생성
  val myList = List("England" -> "London", "Germany" -> "Berlin")

  // List 요소들이 Tuple
  val myMap = myList.groupBy(e => e._1).map(e => (e._1, e._2))
  val betterConversion = Map(myList:_*)
  val scala28Map = myList.toMap

  // map 메소드 이용
  val myList2 = List("England", "London",  "Germany", "Berlin")
  val map: Map[String, Int] = myList2.map{s => (s, s.length)}.toMap




}
