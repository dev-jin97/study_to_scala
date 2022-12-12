package ch04

object S04_VariableStudy extends App {
  // TODO: 스칼라의 변수
  // 스칼라의 변수의 두가지 유형

  // var(가변)
  var variable = 10


  variable = 40 // 가변 var은 값을 재할당이 가능함.

  println(variable)

  // val(불변)
  val value = 20

//  value = 30 error 실행됨. reassignment to val
// 즉, val 로 선언된 값은 재할당이 불가하다.
}
