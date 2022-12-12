package ch03

object C03_WhileLoop extends App {
  // While Loop
  /*
  스칼라에서 While, For 문은 없다로 생각하는 것이 좋다.
  * */

  /*
  if 나 for 가 표현 "식" 인 반면에 while 은 "식"이 아닌 루프, 즉, 값을 내어놓지 못한다.

  * */

  var a = 0
  while(a<20){
    a += 1
  }

  // Loop 의 결과는 Unit 이다. 이 타입은 unit 값 밖에 없으며 빈 괄호가 결과가 된다.

  // 재귀함수
  def gcd(x:Long, y:Long): Long =
    if (y==0) x else gcd(y, x%y)

}
