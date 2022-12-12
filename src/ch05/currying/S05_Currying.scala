package ch05.currying

object S05_Currying extends App {
  /*
  커링이란 인자를 여러개 받는 함수를 분리하여, 인자를 하나씩만 받는 함수의 체인으로 만드는 방법.
  * */



  /*
  함수의 파라미터를 표현하는 방법은 다르지만 같은 함수, 1번은 n, x인수를 2번은 여러개의 괄호로 받은 것.
  2번 함수는 커링을 이용해서 n 값을 미리 바인딩하는 다른 함수로 선언하거나, 다른 함수의 파라미터로 전달할 수 있다.
  * */
  // x를 n으로 나누어 나머지가 0인지 확인하는 함수
  def modN(n:Int, x:Int) = ((x % n) == 0) // 1번
  def modF(f:Int)(x:Int) = ((x % f) == 0) // 2번

  // modF함수를 커링을 이용하여 n 값이 정해진 변수로 호출
  def modOne:Int => Boolean = modF(1)
  def modTwo = modF(2) _

  println(modOne(4))
  println(modTwo(2))
  println(modTwo(1))
}
