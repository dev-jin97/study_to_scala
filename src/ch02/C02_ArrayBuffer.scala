package ch02

import scala.collection.mutable


object C02_ArrayBuffer extends App {
  // ArrayBuffer (동적으로 사이즈가 변하는 배열)

  // 스칼라에는 java.util.ArrayList 없음. 대신 ArrayBuffer 있음. mutable 속성

  // Array 와 ArrayBuffer 의 차이

  var array = Array(1, 2, 3) // 배열 생성
  array +:= 4 // 배열 앞에 4 추가
  array :+= 5 // 배열 뒤에 5 추가

  // ArrayBuffer
  val buf = mutable.ArrayBuffer.empty[Int]

  buf += 1
  buf += 10
  val ar = buf.toArray
  ar.foreach(println(_))

}
